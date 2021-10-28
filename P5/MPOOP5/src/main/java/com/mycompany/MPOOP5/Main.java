package com.mycompany.MPOOP5;
/**
 *@author Moran Duque, Jose Alejandro
 */
class Main {
    public static void main( String[] args ) {
        System.out.println("########Composicion 1#########");
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setNombre("Susana");
        persona1.setApellido("Vazquez");
        Fecha fecha = new Fecha(2,1,2021);
        persona1.setFecha(fecha);
        System.out.println(persona1);
        System.out.println(persona1.getFecha().getAnio());
        System.out.println("########Composicion 2#########");
        Persona chofer = new Persona("Rafael","Correa",5,7,2002);
        Persona copiloto = new Persona("Pedro","paramo",6,7,2002);
        Persona pasajero1 = new Persona("Ximena","Duque",7,7,2002);
        Persona pasajero2 = new Persona("Segundo","Moran",8,7,2002);
        Coche coche = new Coche("Rojo","Tesla",4,2021,1800,true,chofer,copiloto,pasajero1,pasajero2);
        System.out.println(coche);
    }
}
