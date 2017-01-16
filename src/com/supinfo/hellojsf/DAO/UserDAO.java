package com.supinfo.hellojsf.DAO;

import com.supinfo.hellojsf.Entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends GeneriqueDAO<User> {
    public UserDAO(Connection conn) {
        super(conn);
    }

    public boolean create(User obj) {
        return false;
    }

    public boolean delete(User obj) {
        return false;
    }

    public boolean update(User obj) {
        return false;
    }

    public User find(int id) {
        User user = new User();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM user WHERE id = " + id);
            if(result.first())
                user = new User(
                        id,
                        result.getString("mail"),
                        result.getString("mdp"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public User findByMailAndPassword(String mail, String mdp) {
        User user = new User();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM user WHERE mail = '"+mail+"' AND mdp = '"+mdp+"'");
            if(result.first())
                user = new User(
                        Integer.valueOf(result.getString("id")),
                        result.getString("mail"),
                        result.getString("mdp"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}