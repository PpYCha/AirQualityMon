/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jaw.airqualitmon.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrator
 */
public class DaoBase {

    private static EntityManagerFactory _factory = null;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (_factory == null) {
            _factory = Persistence.createEntityManagerFactory("dev.jaw.AirQualitMon");
        }
        return _factory;
    }
}
