package com.supinfo.hellojsf.DAO;

import com.supinfo.hellojsf.Entities.Courses;
import com.supinfo.hellojsf.Entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Boufle on 10/01/2017.
 */
public class CoursesDAO extends GeneriqueDAO<Courses> {
    public CoursesDAO(Connection conn) {
        super(conn);
    }
    @Override
    public boolean create(Courses obj) {
        return false;
    }

    @Override
    public boolean delete(Courses obj) {
        return false;
    }

    @Override
    public boolean update(Courses obj) {
        return false;
    }

    @Override
    public Courses find(int id) {
        return null;
    }

    public ArrayList<Courses> findByTitle(String titre){
        ArrayList<Courses> courses = new ArrayList<>();
        Courses courses1 = new Courses();


        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM courses WHERE titre = '"+titre+"'");
            if(result.first())
                courses1 = new Courses(
                        Integer.valueOf(result.getString("id")),
                        result.getString("titre"),
                        result.getString("description"),
                        result.getInt("nbheure"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        courses.add(courses1);
        return courses;
    }

    public ArrayList<Courses> findAll(){
        ArrayList<Courses> courses = new ArrayList<>();


        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM courses ");

            while (result.next()){
               Courses courses1 = new Courses(
                        Integer.valueOf(result.getString("id")),
                        result.getString("titre"),
                        result.getString("description"),
                        result.getInt("nbheure"));
                courses.add(courses1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return courses;
    }

}
