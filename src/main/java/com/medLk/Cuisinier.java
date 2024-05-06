package com.medLk;

public class Cuisinier {
    private String specialite;

    public Cuisinier() {
    }
    public Cuisinier(String specialite) {
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public String toString() {
        return "Cuisinier specialite: "+specialite;
    }
}
