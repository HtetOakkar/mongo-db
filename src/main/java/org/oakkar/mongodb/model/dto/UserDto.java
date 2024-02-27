package org.oakkar.mongodb.model.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String id;
    private String fullName;
    private Instant cratedAt;
    private Instant updatedAt;
    private long version;
}
