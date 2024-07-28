package me.juliana.domain.repository;

import me.juliana.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
