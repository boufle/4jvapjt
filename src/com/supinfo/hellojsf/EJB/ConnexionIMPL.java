package com.supinfo.hellojsf.EJB;

import com.supinfo.hellojsf.DAO.CoursesDAO;
import com.supinfo.hellojsf.DAO.GeneriqueDAO;
import com.supinfo.hellojsf.DAO.UserDAO;
import com.supinfo.hellojsf.Entities.User;
import com.supinfo.hellojsf.Singleton.DBinstance;

import javax.ejb.Stateless;

/**
 * Created by Boufle on 10/01/2017.
 */
@Stateless
public class ConnexionIMPL implements Connexion {


    @Override
    public User connect(String mail, String mdp) {

        UserDAO userGeneriqueDAO = new UserDAO(DBinstance.getInstance());

        User user = new User();
        user = userGeneriqueDAO.findByMailAndPassword(mail, mdp);

        return user;

    }
}
