package com.springOne.service;

import com.springOne.dao.RoleDAO;
import com.springOne.dao.UserDAO;
import com.springOne.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    public User registerNewUser(User user){
       return userDAO.save(user);
    }

    // in the application.properties, as the ddl-auto- is assigned to create, every time you re-start the server,
            // the data that is saved in the server gets vanishes and you need to again provide all the necessary data
            // 2 ways to avoid this- either you provide the value to update or the following method gives you another way
//    public void initRolesAndUser() {
//        Role adminRole = new Role();
//        adminRole.setRoleName("Admin");
//        adminRole.setRoleDescription("Admin role for an application");
//        roleDAO.save(adminRole);
//
//        Role userRole = new Role();
//        userRole.setRoleName("Admin");
//        userRole.setRoleDescription("Default role for newly created record");
//        roleDAO.save(userRole);
//
//        User adminUser = new User();
//        adminUser.setUserName("admin123");
//        adminUser.setUserFirstName("admin");
//        adminUser.setUserLastname("admin");
//        adminUser.setUserPassword("admin@pass");
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
//        userDAO.save(adminUser);
//
//        User user = new User();
//        user.setUserName("Raj");
//        user.setUserFirstName("Sharma");
//        user.setUserLastname("Raj123");
//        user.setUserPassword("Raj@pass");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        userDAO.save(user);
//    }
}
