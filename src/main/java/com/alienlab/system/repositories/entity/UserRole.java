package com.alienlab.system.repositories.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 橘 on 2016/8/3.
 */
@Entity
@Table(name="tb_role_user")
public class UserRole implements Serializable{
    @Id
    @Column(name="role_user_id")
    private Long userroleid;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    public Long getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Long userroleid) {
        this.userroleid = userroleid;
    }

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
}
