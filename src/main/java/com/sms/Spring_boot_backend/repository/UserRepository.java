package com.sms.Spring_boot_backend.repository;

import com.sms.Spring_boot_backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Users, Long>{

}
