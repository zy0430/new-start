package com.example.repository.primary;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author
 */
public interface PrimaryRepository extends MongoRepository<User, String> {
}
