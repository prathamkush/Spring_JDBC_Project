package com.spring.boot.jdbc.SpringBootJDBC.Repository;

import com.spring.boot.jdbc.SpringBootJDBC.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

// THIS IS USED FOR SQL BASED CRUD OPERATIONS (using jdbctemplate)
//jdbc template based repo
@Repository
public class PlayerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // READING TABLE DATA (ROWS)
    public List<Player> getAllPlayers(){
        String getPlayerQuery = "SELECT * FROM Player";
        // JDBCTEMPLATE => Query => Database => Result Set => Row Mapped => Player.Class => List<Object>
        //return jdbcTemplate.query(getPlayerQuery, new BeanPropertyRowMapper<Player>(Player.class));
        return jdbcTemplate.query(getPlayerQuery, new PlayerMapper());
    }

    // READ (GET BY ID)
    public Player getPlayerbyId(int id){
        String getPlayerbyIdQuery = "SELECT * FROM Player WHERE ID = ?";

        // JDBCTEMPLATE => Query => ID is being substituted as a Primary Key => Database => Result Set => Row Mapped => Player.Class => Object
        return jdbcTemplate.queryForObject(getPlayerbyIdQuery, new BeanPropertyRowMapper<Player>(Player.class) , new Object[] {id});
    }

    // INSERTING a new ROW
    public int insertPlayer(Player player) {
        String insertPlayerQuery = "INSERT INTO Player VALUES(?, ?, ?, ?, ?, ?)";


        // will return 1 after success
        return jdbcTemplate.update(insertPlayerQuery ,new Object[]{player.getID(), player.getName(), player.getAge(),
                player.getNationality(), new Timestamp(player.getDob().getTime()), player.getDesignation()});


    }

    // UPDATE a certain ROW (via ID)
    public int updatePlayerInfo(Player player){
        String updateQuery = "UPDATE Player "+" SET Name = ?, Age = ?, Nationality = ?, DOB = ?, Designation = ?"+
                "WHERE ID = ?";

        return jdbcTemplate.update(updateQuery, new Object[]{player.getName(), player.getAge(), player.getNationality(),
                new Timestamp(player.getDob().getTime()), player.getDesignation(), player.getID()});

    }

    // DELETE OPERATION ON A ROW
    public int deletePlayer(int id){
        String deleteQuery = "DELETE FROM Player "+" WHERE ID = ?";

        return jdbcTemplate.update(deleteQuery, new Object[]{id});
    }

    //******************** USING ROWMAPPER INSTEAD OF BEANPROPERTYROWMAPPER *************************//



    private static final class PlayerMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Player player = new Player();

            player.setID(rs.getInt("ID"));
            player.setName(rs.getString("Name"));
            player.setAge(rs.getInt("Age"));
            player.setNationality(rs.getString("Nationality"));
            player.setDob(rs.getDate("DOB"));
            player.setDesignation(rs.getInt("Designation"));

            return player;
        }
    }

}
