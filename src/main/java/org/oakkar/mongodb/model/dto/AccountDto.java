package org.oakkar.mongodb.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {
    private String id;
    private String username;
    private String password;
    private Instant createdDate;
    private Instant updateDate;
    private Long version;
}
