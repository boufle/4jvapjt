package com.supinfo.hellojsf.ManagedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by Boufle on 11/01/2017.
 */
@ManagedBean
@RequestScoped
public class SingleCoursesManagedBean {


    @ManagedProperty("#{param.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void loadCourses(){

    }
}
