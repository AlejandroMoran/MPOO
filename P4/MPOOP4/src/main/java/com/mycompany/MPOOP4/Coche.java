package com.mycompany.MPOOP4;
class Coche {
//Atributos
    String color;
    String marca;
    int puertas;
    int year;
    int potencia;
    boolean auto;
//Constructures
    public Coche(){
    }
    public Coche(String color, String marca, int puertas, int year, int potencia, boolean auto){
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.year = year;
        this.potencia = potencia;
        this.auto = auto;
    }
//Metodos
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
    return "Coche{"+"marca="+marca+",year="+year+",color="+color+",puertas="+puertas+",potencia="+potencia+",automatico="+auto+"}";
    }
}
