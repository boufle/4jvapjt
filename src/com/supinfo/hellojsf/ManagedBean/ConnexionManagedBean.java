package com.supinfo.hellojsf.ManagedBean;

import com.supinfo.hellojsf.EJB.Connexion;
import com.supinfo.hellojsf.Entities.User;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * Created by Boufle on 10/01/2017.
 */

@ManagedBean
@SessionScoped
public class ConnexionManagedBean {

    @EJB
    Connexion connexion;
    private String mail;
    private String mdp;
    private User user;

    public boolean isLogged() {
        return isLogged;
    }

    private boolean isLogged = false;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String connect(){

        user = connexion.connect(mail,mdp);
        if (user.getMail().equals("")){
            return "failed";
        }else{
            isLogged = true;
            return "succes";
        }

    }

    public String disconnect(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "disconect";
    }


}
