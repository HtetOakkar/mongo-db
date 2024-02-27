package org.oakkar.mongodb.repository;

import org.oakkar.mongodb.model.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, Long> {
}
