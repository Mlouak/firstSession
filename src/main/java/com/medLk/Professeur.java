package com.medLk;

public class Professeur extends Personne{
    private String matiere;

    public Professeur(){
     super();
    }
    public Professeur(String nom, String prenom, String matiere){
        super(nom, prenom);
        this.matiere = matiere;
    }
    public String getMatiere(){
        return matiere;
    }
    public void setMatiere(String matiere){
        this.matiere = matiere;
    }
    @Override
    public void realiserAvancement() {
        System.out.println("j'ai ajouté les notes des étudiants");
    }
}
