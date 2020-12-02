package com.example.repository.secondary;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author
 */
public interface SecondaryRepository extends MongoRepository<User, String> {
}
