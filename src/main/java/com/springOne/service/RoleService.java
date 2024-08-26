package com.springOne.service;

import com.springOne.dao.RoleDAO;
import com.springOne.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService{

    @Autowired
    private RoleDAO roleDao;

    public Role createNewRole(Role role) {
       return roleDao.save(role);
    }
}
