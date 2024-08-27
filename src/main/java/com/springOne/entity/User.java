package com.springOne.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {

    @Id
    private String userName;
    private String userFirstName;
    private String userLastname;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role; // Many users can have multiple roles

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}

//FetchType.EAGER means that when a User entity is loaded from the database, the associated Role entities are also immediately loaded.
//CascadeType.ALL means that any operation (such as persist, remove, update) performed on the User entity will also be cascaded to the associated Role entities.
//name = "USER_ROLE": This specifies the name of the join table in the database,
                //will be USER_ROLE. This table will contain references to both USER and ROLE entities.
//@JoinColumn(name = "USER_ID"): This annotation specifies the name of the column in
                //the USER_ROLE table that will reference the USER_ID column in the User table.
//@JoinColumn(name = "ROLE_ID"): This annotation specifies the name of the column in
                //the USER_ROLE table that will reference the ROLE_ID column in the Role table.




