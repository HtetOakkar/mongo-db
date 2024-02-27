package org.oakkar.mongodb.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@Setter
@Document(value = "accounts")
public class Account {
    @Id
    private String id;

    private String username;

    private String password;

    @CreatedDate
    private Instant createdDate;

    @LastModifiedDate
    private Instant updateDate;

    @Version
    private Long version;
}
