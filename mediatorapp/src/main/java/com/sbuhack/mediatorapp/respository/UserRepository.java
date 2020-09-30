package com.sbuhack.mediatorapp.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbuhack.mediatorapp.entity.User;

public interface UserRepository extends JpaRepository<User,String>{

}
