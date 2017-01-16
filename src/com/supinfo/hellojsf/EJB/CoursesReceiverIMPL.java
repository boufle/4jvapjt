package com.supinfo.hellojsf.EJB;

import com.supinfo.hellojsf.DAO.CoursesDAO;
import com.supinfo.hellojsf.Entities.Courses;
import com.supinfo.hellojsf.Singleton.DBinstance;

import javax.ejb.Stateless;
import java.util.ArrayList;

/**
 * Created by Boufle on 10/01/2017.
 */
@Stateless
public class CoursesReceiverIMPL implements CoursesReceiver {
    @Override
    public ArrayList<Courses> receivecourses() {

        CoursesDAO coursesDAO = new CoursesDAO(DBinstance.getInstance());
        return   coursesDAO.findAll();

    }

    @Override
    public ArrayList<Courses> receivecoursesByTitle(String titre) {

        CoursesDAO coursesDAO = new CoursesDAO(DBinstance.getInstance());
        return coursesDAO.findByTitle(titre);
    }
}
