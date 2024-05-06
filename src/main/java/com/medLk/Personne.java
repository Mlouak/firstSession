package com.medLk;

public abstract class Personne {

    private String nom;
    private String prenom;

    public Personne(){

    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String nomMaj(){
        return nom.toUpperCase();
    }
    public abstract void realiserAvancement();

}
