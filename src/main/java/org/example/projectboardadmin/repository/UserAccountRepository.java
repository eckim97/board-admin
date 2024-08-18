package org.example.projectboardadmin.repository;

import org.example.projectboardadmin.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}