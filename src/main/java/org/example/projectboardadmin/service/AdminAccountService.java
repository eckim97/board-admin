package org.example.projectboardadmin.service;

import lombok.RequiredArgsConstructor;
import org.example.projectboardadmin.domain.constant.RoleType;
import org.example.projectboardadmin.dto.AdminAccountDto;
import org.example.projectboardadmin.repository.AdminAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class AdminAccountService {

    private final AdminAccountRepository adminAccountRepository;

    public Optional<AdminAccountDto> searchUser(String username) {
        return Optional.empty();
    }

    public AdminAccountDto saveUser (String username, String password, Set<RoleType> roleTypes, String email, String nickname, String memo){
        return null;
    }

    public List<AdminAccountDto> users() {
        return List.of();
    }

    public void deleteUser(String username) {

    }
}
