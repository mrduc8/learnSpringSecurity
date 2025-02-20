package eaut.buingocduc.ecommerce.service;

import eaut.buingocduc.ecommerce.dto.ReqRes;
import eaut.buingocduc.ecommerce.entity.OurUsers;
import eaut.buingocduc.ecommerce.repository.UserRepo;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsersManagementService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    JWTUtils jwtUtils;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder passwordEncoder;

    public ReqRes register(ReqRes registrationRequest) {
        ReqRes resp = new ReqRes();
        try {
            OurUsers ourUsers = new OurUsers();
            ourUsers.setEmail(registrationRequest.getEmail());

            ourUsers.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
        }catch (Exception e) {
            resp.setStatusCode(500);
            resp.setError(e.getMessage());

        }
    }
}
