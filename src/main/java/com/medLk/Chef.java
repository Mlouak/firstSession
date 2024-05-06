package com.medLk;

public class Chef extends Cuisinier{
    private int experience;

    public Chef(){
        super();
    }


    public Chef(String specialite, int experience){
        super(specialite);
        this.experience = experience;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public String toString(){
        return super.toString() + " experience: "+experience;
    }
}
