/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.dao;

import dev.jaw.airqualitmon.account.Account;
import dev.jaw.airqualitmon.viewmodels.AccountVM;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Administrator
 */
public class AccountDAO extends DaoBase {

    private final EntityManager entityManager;

    public AccountDAO() {
        entityManager = getEntityManagerFactory().createEntityManager();
    }

    public void addNewAccount(Account account) {
        
    }

    public String[] getAvailableRoles() {
        String[] roles = {"ADMIN", "USER"};
        return roles;
    }
}
