package com.mah312.userregistration.user;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true, rollbackFor = Exception.class)
public interface UserRepository {
    public Optional<User> findByUsername(String userName);

    public Optional<User> findByEmail(String email);

}
