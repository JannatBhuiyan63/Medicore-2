package service.authservice.authservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SignupRequest {
    private String name;
    private String email;
    private String password;
    private String role;
    private String phone;
    
    @JsonProperty("blood_group")
    private String bloodGroup;
}