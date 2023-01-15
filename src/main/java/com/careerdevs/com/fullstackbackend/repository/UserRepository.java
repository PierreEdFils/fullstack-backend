package com.careerdevs.com.fullstackbackend.repository;

import com.careerdevs.com.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
