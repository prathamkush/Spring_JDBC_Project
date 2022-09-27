package com.spring.boot.jdbc.SpringBootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	PlayerDAO dao;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n-----------GET PLAYERS INFO------------\n");
		System.out.println(dao.getAllPlayers());

		System.out.println("\n-----------GET PLAYER BY ID------------\n");
		System.out.println(dao.getPlayerbyId(2));

		System.out.println("\n-----------INSERT A PLAYER---------------\n");
		System.out.println(dao.insertPlayer(new Player(4, "Dave", 30, "CANADA", new Date(System.currentTimeMillis()), 10)));
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);


	}



}

//C://users/pratham/springbootjdbc/src/main/java/SpringBootJdbcApplication.class
//
//		../check/SpringClassCheck.class