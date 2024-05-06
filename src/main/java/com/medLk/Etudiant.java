package com.medLk;

public class Etudiant extends Personne{

    private String matricule;
    private String filiere;
    private String niveau;

    public Etudiant(){
        super();
    }
    public Etudiant(String nom, String prenom, String matricule, String filiere, String niveau){
        super(nom, prenom);
        this.matricule = matricule;
        this.filiere = filiere;
        this.niveau = niveau;
    }
    public String getMatricule(){
        return matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }
    public String getFiliere(){
        return filiere;
    }
    public void setFiliere(String filiere){
        this.filiere = filiere;
    }
    public String getNiveau(){
        return niveau;
    }
    public void setNiveau(String niveau){
        this.niveau = niveau;
    }
    public String toString(){
        return "Etudiant: "+getNom()+" "+getPrenom()+" matricule: "+matricule+" filiere: "+filiere+" niveau: "+niveau;
    }
    public String nomMaj(){
        return super.nomMaj()  + " " + filiere.toUpperCase() + " " + niveau.toUpperCase();
    }

    @Override
    public void realiserAvancement() {
        System.out.println("L'etudiant "+getNom()+" "+getPrenom()+" triuvé la solution de l'equation différentielle.");
    }
}
