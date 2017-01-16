package com.supinfo.hellojsf.ManagedBean;

import com.supinfo.hellojsf.EJB.Connexion;
import com.supinfo.hellojsf.EJB.CoursesReceiver;
import com.supinfo.hellojsf.Entities.Courses;
import com.supinfo.hellojsf.Entities.User;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

/**
 * Created by Boufle on 10/01/2017.
 */

@ManagedBean
public class CoursesManagedBean {

    @EJB
    CoursesReceiver coursesReceiver;
    private ArrayList<Courses> courses;
    private String titre;

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void loadAllCourses(){
        try {
            courses = coursesReceiver.receivecourses();
        }catch (Exception e){
        }

    }

}
