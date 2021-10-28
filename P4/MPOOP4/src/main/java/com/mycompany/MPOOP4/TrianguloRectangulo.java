package com.mycompany.MPOOP4;
import java.lang.Math;
class TrianguloRectangulo{
    String nombre;
    double ladoA;
    double ladoB;
    double ladoC;
    public TrianguloRectangulo(){
    }
    public TrianguloRectangulo(String nombre, double ladoA, double ladoB, double ladoC){
    this.nombre = nombre;
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    }
    public void obtenerCateto(){
        ladoA = Math.sqrt(Math.pow(ladoC, 2.0)-Math.pow(ladoB, 2.0));
    }
    public void obtenerHipotenusa(){
        ladoC = Math.sqrt(Math.pow(ladoA, 2.0)+Math.pow(ladoB, 2.0));
    }
    public void area(){
        System.out.println("El area es: "+((ladoA*ladoB)/2));
    }
    public void perimetro(){
        System.out.println("El perimetro es: "+(ladoA+ladoB+ladoC));
    }
    public void angulos(){
        System.out.println("El primer angulo es: "+Math.toDegrees(Math.acos(ladoA/ladoC))+ " , el segundo es: "+Math.toDegrees(Math.acos(ladoB/ladoC))+ " y el tercero es: 90");
    }
    @Override
    public String toString(){
        return "Triangulo{"+"nombre="+nombre+", Cateto1="+ladoA+", Cateto2="+ladoB+", Hipotenusa="+ladoC+"}";
    }
}
