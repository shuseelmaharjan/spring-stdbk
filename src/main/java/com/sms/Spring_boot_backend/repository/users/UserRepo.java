package com.sms.Spring_boot_backend.repository.users;

import com.sms.Spring_boot_backend.entity.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

}
