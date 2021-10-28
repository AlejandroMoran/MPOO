package com.mycompany.MPOOP5;
public class Coche {
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    private String color;
    private String marca;
    private int puertas;
    private int year;
    private int potencia;
    private boolean auto;

    public Coche(){}
    public Coche(String color, String marca, int puertas, int year, int potencia, boolean auto, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2){
        this.chofer=chofer;
        this.copiloto=copiloto;
        this.pasajero1=pasajero1;
        this.pasajero2=pasajero2;
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.year = year;
        this.potencia = potencia;
        this.auto = auto;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas=puertas;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia=potencia;
    }
    public boolean getAuto(){
        return auto;
    }
    public void setAuto(boolean auto){
        this.auto=auto;
    }
    public Persona getChofer(){
        return chofer;
    }
    public void setChofer(Persona chofer){
        this.chofer=chofer;
    }
    public Persona getCopiloto(){
        return copiloto;
    }
    public void setCopiloto(Persona copiloto){
        this.copiloto=copiloto;
    }
    public Persona getPasajero1(){
        return pasajero1;
    }
    public void setPasajero1(Persona pasajero1){
        this.pasajero1=pasajero1;
    }
    public Persona getPasajero2(){
        return pasajero2;
    }
    public void setPasajero2(Persona pasajero2){
        this.pasajero2=pasajero2;
    }
    public void encender(){
        System.out.println("Soy el coche de la marca "+" y estoy encendiendo");
    }
    public void avanzar(boolean avanza){
        if(avanza)
            System.out.println("Estoy avanzando a 10 km/h");
        else
            System.out.println("Voy a 0 km/h");
    }
    public void apagar(){
        System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
    }
    public void frenar(boolean frena){
        if(frena)
            System.out.println("Estoy frenando");
        else
            System.out.println("No estoy frenando");
    }
    public void abrirPuertas(int numPuertasAAbrir){
        if(numPuertasAAbrir > puertas)
            System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
        else
            System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }

    @Override
    public String toString(){
        return "Coche{"+"marca="+marca+",year="+year+",color="+color+",puertas="+puertas+",potencia="+potencia+",automatico="+auto+"\n"+"Chofer="+chofer+"\n"+"Copiloto="+copiloto+"\n"+"pasajero1="+pasajero1+"\n"+"pasajero2="+pasajero2+"}";
    }
}
