package com.spring.boot.jdbc.SpringBootJDBC;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import com.spring.boot.jdbc.SpringBootJDBC.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.Date;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

//	@Autowired
//	PlayerDAO dao;

	@Autowired
	PlayerRepository repo;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("\n-----------GET PLAYERS INFO------------\n");
//		System.out.println(dao.getAllPlayers());
//
//		System.out.println("\n-----------GET PLAYER BY ID------------\n");
//		System.out.println(dao.getPlayerbyId(2));

//		System.out.println("\n-----------INSERT A PLAYER---------------\n");
//		System.out.println(dao.insertPlayer(new Player(4, "Dave", 30, "CANADA", new Date(System.currentTimeMillis()), 10)));
//		System.out.println("----updated data-----");
//		System.out.println(dao.getAllPlayers());
//
//		System.out.println("\n-----------UPDATING A PLAYER'S INFO---------------\n");
//		System.out.println(dao.updatePlayerInfo(new Player(4, "Dave", 35, "BRAZIL", new Date(System.currentTimeMillis()), 11)));
//		System.out.println("----updated data-----");
//		System.out.println(dao.getAllPlayers());
//
//		System.out.println("\n-----------DELETING A PLAYER---------------\n");
//		System.out.println(dao.deletePlayer(3));
//		System.out.println("----updated data-----");
//		System.out.println(dao.getAllPlayers());

		//****************CRUD WITHOUT DATABASE QUERIES**********************//

		// CREATE
		repo.insertPlayer(new Player(1,"Alice",	22, "INDIAN", Date.valueOf("2000-01-01"),	1));
		repo.insertPlayer(new Player(2,"Bob",	20, "CANADA", Date.valueOf("2000-05-04"),	4));

		// READ
		System.out.println(repo.getPlayerById(2));

		// UPDATE
		//repo.updatePlayer(new Player(1,"Alice",	22, "BRITISH", Date.valueOf("2000-01-01"), 1));

		// DELETE
		//repo.deleteById(2);

		// get
		System.out.println(repo.getAllPlayers());

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);

	}



}

//C://users/pratham/springbootjdbc/src/main/java/SpringBootJdbcApplication.class
//
//		../check/SpringClassCheck.class