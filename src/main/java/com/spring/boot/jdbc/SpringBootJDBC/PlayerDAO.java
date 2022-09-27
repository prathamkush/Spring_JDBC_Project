package com.spring.boot.jdbc.SpringBootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PlayerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Player> getAllPlayers(){
        String getPlayerQuery = "SELECT * FROM Player";
        // JDBCTEMPLATE => Query => Database => Result Set => Row Mapped => Player.Class => List<Object>
        return jdbcTemplate.query(getPlayerQuery, new BeanPropertyRowMapper<Player>(Player.class));
    }

    public Player getPlayerbyId(int id){
        String getPlayerbyIdQuery = "SELECT * FROM Player WHERE ID = ?";

        // JDBCTEMPLATE => Query => ID is being substituted as a Primary Key => Database => Result Set => Row Mapped => Player.Class => Object
        return jdbcTemplate.queryForObject(getPlayerbyIdQuery, new BeanPropertyRowMapper<Player>(Player.class) , new Object[] {id});
    }

    // inserting
    public int insertPlayer(Player player){
        String insertPlayerQuery = "INSERT INTO Player VALUES(?, ?, ?, ?, ?, ?)";


        // will return Primary key after update
        return jdbcTemplate.update(insertPlayerQuery, new Object[]{player.getID(),player.getName(),player.getAge(),
                player.getNationality(), new Timestamp(player.getDob().getTime()),player.getDesignation()});

    }

}
