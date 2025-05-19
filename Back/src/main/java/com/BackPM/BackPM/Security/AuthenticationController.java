package com.BackPM.BackPM.Security;


import com.BackPM.BackPM.Security.DTO.LoginUserDto;
import com.BackPM.BackPM.Security.DTO.RegisterUserDto;
import com.BackPM.BackPM.Security.DTO.VerifyUserDto;
import com.BackPM.BackPM.Security.Service.AuthenticationService;
import com.BackPM.BackPM.Security.Service.JwtService;
import com.BackPM.BackPM.Security.reponses.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping(value = "/signup", consumes = {"application/json", "application/x-www-form-urlencoded"})
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping(value = "/login", consumes = {"application/json", "application/x-www-form-urlencoded"})
    public ResponseEntity<LoginResponse> authenticate(
            @RequestBody(required = false) LoginUserDto loginUserDto,
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String password
    ) {

        if (loginUserDto == null && username != null && password != null) {
            loginUserDto = new LoginUserDto(username, password);
        }

        if (loginUserDto == null) {
            return ResponseEntity.badRequest().body(null); // Manejar el caso en el que los parámetros no fueron proporcionados
        }

        User authenticatedUser = authenticationService.authenticate(loginUserDto);
        String jwtToken = jwtService.generateToken(authenticatedUser);
        LoginResponse loginResponse = new LoginResponse(jwtToken, jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }



    @PostMapping(value = "/verify", consumes = {"application/json", "application/x-www-form-urlencoded"})
    public ResponseEntity<?> verifyUser(@RequestBody VerifyUserDto verifyUserDto) {
        try {
            authenticationService.verifyUser(verifyUserDto);
            return ResponseEntity.ok("Account verified successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/resend")
    public ResponseEntity<?> resendVerificationCode(@RequestParam String email) {
        try {
            authenticationService.resendVerificationCode(email);
            return ResponseEntity.ok("Verification code sent");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}