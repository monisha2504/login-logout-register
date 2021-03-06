package com.cg.loginlogoutregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.loginlogoutregister.entity.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, String> {

}
