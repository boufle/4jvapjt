package com.supinfo.hellojsf.Entities;

/**
 * Created by Boufle on 10/01/2017.
 */
public class Courses {

    private int id = 0;
    private String titre = "";
    private String description = "";
    private int nbheure = 0;

    public Courses(int id, String titre, String description, int nbheure){
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.nbheure = nbheure;
    }

    public Courses(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNbheure(int nbheure) {
        this.nbheure = nbheure;
    }
}
