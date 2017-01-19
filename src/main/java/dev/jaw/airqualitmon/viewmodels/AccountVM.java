/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.viewmodels;

/**
 *
 * @author Administrator
 */
public class AccountVM {
    
    private String username;
    private String password;
    private String passwordCopy;
    private String role;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the passwordCopy
     */
    public String getPasswordCopy() {
        return passwordCopy;
    }

    /**
     * @param passwordCopy the passwordCopy to set
     */
    public void setPasswordCopy(String passwordCopy) {
        this.passwordCopy = passwordCopy;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
}
