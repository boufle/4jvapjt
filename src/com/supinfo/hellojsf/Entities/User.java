package com.supinfo.hellojsf.Entities;

/**
 * Created by Boufle on 10/01/2017.
 */
public class User {
        //ID
        private int id = 0;
        //Mail
        private String mail = "";
        //MDP
        private String mdp = "";

        public User(int id, String mail, String mdp) {
            this.id = id;
            this.mail = mail;
            this.mdp = mdp;
        }
        public User(){};

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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
}
