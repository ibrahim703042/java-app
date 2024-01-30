/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kwizera.ibrahim.java.app.main;

import com.kwizera.ibrahim.java.app.persistence.CustomPersistenceUnitInfo;
import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.jpa.HibernatePersistenceProvider;

/**
 *
 * @author Ibrahim
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String puName = "my-persistence-unit";
        Map<?, ?> props = new HashMap<>();

        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);
        //EntityManagerFactory emf = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(), new HashMap<>());
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            
            em.getTransaction().commit();
        }finally{
            em.close();
        }
        

    }
    
}
