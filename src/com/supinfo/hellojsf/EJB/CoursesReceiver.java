package com.supinfo.hellojsf.EJB;

import com.supinfo.hellojsf.Entities.Courses;
import com.supinfo.hellojsf.Entities.User;

import javax.ejb.Remote;
import java.util.ArrayList;

/**
 * Created by Boufle on 10/01/2017.
 */
@Remote
public interface CoursesReceiver {
    public ArrayList<Courses> receivecourses();
    public ArrayList<Courses> receivecoursesByTitle(String titre);

}