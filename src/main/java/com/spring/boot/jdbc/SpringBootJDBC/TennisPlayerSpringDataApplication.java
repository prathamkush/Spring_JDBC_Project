package com.spring.boot.jdbc.SpringBootJDBC;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerSpringDataApplication implements CommandLineRunner {

    @Autowired
    PlayerSpringDataRepository repo;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(TennisPlayerSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        logger.info("\n Inserting a player \n", repo.save(new Player("Eve",	23, "JAPANESE", Date.valueOf("2000-01-01"),	1)));
//        logger.info("\n Inserting a player \n",repo.save(new Player("Alice",	22, "BRAZIL", Date.valueOf("2000-01-01"),	5)));
//        logger.info("\n Inserting a player \n",repo.save(new Player("Bob",	62, "CHINESE", Date.valueOf("2000-01-01"),	6)));
//
//
//        logger.info("\n Finding the player by ID \n", repo.findById(1));
////        logger.info("\n Deleting by ID \n");
////        repo.deleteById(2);
//        logger.info("\n Find all players \n", repo.findAll());

    }
}
