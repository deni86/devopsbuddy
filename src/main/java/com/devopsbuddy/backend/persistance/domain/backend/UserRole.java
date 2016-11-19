package com.devopsbuddy.backend.persistance.domain.backend;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Deni86 on 19.11.2016..
 */
@Entity
@Table(name="user_role")//Ovo zato sto zelimo da ne bude podrazumjevano ime za tabelu ime klase
public class UserRole implements Serializable{
    /** The Serial Version UID for Serializable classes. */
        private static final long serialVersionUID = 1L;

    public UserRole(){

    }

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="role_id")
    private Role role;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (!user.equals(userRole.user)) return false;
        return role.equals(userRole.role);

    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }
}
