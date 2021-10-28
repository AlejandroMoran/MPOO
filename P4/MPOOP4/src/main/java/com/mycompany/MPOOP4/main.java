package com.mycompany.MPOOP4;
/**
 *@author Moran Duque, Jose Alejandro
 */
public class main {
    public static void main( String[] args ) {
        KeyboardInput teclado = new KeyboardInput();
        Coche coche1 = new Coche();
        coche1.marca = "Nissan";
        coche1.color = "blanco";
        coche1.puertas = 5;
        coche1.year = 2020  ;
        coche1.potencia = 150;
        coche1.auto = true;
        coche1.encender();
        coche1.avanzar(true);
        coche1.frenar(true);
        coche1.apagar();
        coche1.abrirPuertas(6);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        Coche coche2 = new Coche("negro", "Mazda", 3, 2021, 200, false);
        coche2.encender();
        coche2.avanzar(false);
        coche2.frenar(false);
        coche2.apagar();
        coche2.abrirPuertas(5);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        Perro perro1 = new Perro("Rex", 5.8f,2,6,"Chihuahua",false);
        Perro perro2 = new Perro("Firulais", 6.4f,6,10,"Puddle",true);
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        TrianguloRectangulo triangulo = new TrianguloRectangulo();
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo("notable",3.0,4.0,5.0);
        System.out.println("Ingrese el nombre del triangulo");
        triangulo.nombre = teclado.readString();
        System.out.println("Quiere calcular un cateto (1) o la hipotenusa (2)");
        int a = teclado.readInteger();
        if(a==1){
            System.out.println("Ingrese el cateto");
            float B = teclado.readFloat();
            triangulo.ladoB=B;
            System.out.println("Ingrese la hipotenusa");
            float C = teclado.readFloat();
            triangulo.ladoC=C;
            triangulo.obtenerCateto();
        }
        else{
            System.out.println("Ingrese el primer cateto");
            float A = teclado.readFloat();
            triangulo.ladoA=A;
            System.out.println("Ingrese el segundo cateto");
            float B = teclado.readFloat();
            triangulo.ladoB=B;
            triangulo.obtenerHipotenusa();
        }
        triangulo.area();
        triangulo.perimetro();
        triangulo.angulos();
        System.out.println(triangulo);
        System.out.println(triangulo1);
    }
}
