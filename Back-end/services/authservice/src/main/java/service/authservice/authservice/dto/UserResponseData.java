package service.authservice.authservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;

@Data
@Builder
public class UserResponseData {
    private String userId;
    private String name;
    private String email;
    private String role;
    private String phone;
    
    @JsonProperty("blood_group")
    private String bloodGroup;
    private Boolean approval;
    private Instant createdAt;
    private Instant updatedAt;
}