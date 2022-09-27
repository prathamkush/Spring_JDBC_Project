package com.spring.boot.jdbc.SpringBootJDBC.Repository;


import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// jpa  - java persistance api (jpa based repository)
@Repository     // To perform all the CRUD operations without DDL/DML
@Transactional  // to make transactions b/w java classes and database
public class PlayerRepository {

    @PersistenceContext
    EntityManager entityManager;

    // Insert
    public Player insertPlayer(Player player){
        return entityManager.merge(player);
    }

    // Update
    public Player updatePlayer(Player player){
        return entityManager.merge(player);
    }

    // Get/Read
    public Player getPlayerById(int id){
        return entityManager.find(Player.class, id);
    }

    // Delete
    public void deleteById(int id){
        Player player = entityManager.find(Player.class, id);
        entityManager.remove(player);
    }



}
