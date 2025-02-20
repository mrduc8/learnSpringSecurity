package eaut.buingocduc.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import eaut.buingocduc.ecommerce.entity.OurUsers;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReqRes {
    int statusCode;
    String error;
    String message;
    String token;
    String refreshToken;
    String expirationTime;
    String name;
    String city;
    String role;
    String email;
    String password;
    OurUsers ourUsers;
    List<OurUsers> ourUsersList;
}
