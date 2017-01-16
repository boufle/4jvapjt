package com.supinfo.hellojsf.EJB;

import com.supinfo.hellojsf.Entities.User;

import javax.ejb.Remote;

@Remote
public interface Connexion {
     User connect(String mail, String mdp);
}