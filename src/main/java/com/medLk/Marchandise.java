package com.medLk;

public class Marchandise {
    private int numero;
    private int poids;
    private int volume;


    // Constructors
    public Marchandise(){

    }
    public Marchandise(int mohamed, int poids){
        this.numero = mohamed;
        this.poids = poids;
    }


    public Marchandise(int numero, int poids, int volume) {
        this.numero = numero;
        this.poids = poids;
        this.volume = volume;
    }

    //get numero
    public int getNumero() {
        return numero;
    }
    //set numero
    public void setNumero(int numero) {

        this.numero = numero;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public String toString(){
        //return "Marchandise numero: "+numero+" poids: "+poids+" volume: "+volume;
        return "Marchandise numero: "+numero+" poids: "+poids+" volume: "+volume;
    }

}
