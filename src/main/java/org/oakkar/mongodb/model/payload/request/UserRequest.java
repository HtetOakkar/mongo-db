package org.oakkar.mongodb.model.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class UserRequest {
    @JsonProperty("full_name")
    private String fullName;
    private String username;
    private String password;
}
