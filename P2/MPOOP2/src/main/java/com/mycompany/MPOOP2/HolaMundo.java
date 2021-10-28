package com.mycompany.MPOOP2;
/**
 *@author Moran Duque, Jose Alejandro
 *
 */
public class HolaMundo {
    public static void main( String[] args ) {
        System.out.println("Hola mundo normal");
        //System.err.println("Hola mundo error");

        KeyboardInput teclado = new KeyboardInput();

        System.out.println("Ingrese un entero");
        int a = teclado.readInteger();

        System.out.println("El valor de a = "+a);
        System.out.println("##################### If ################");

        System.out.println("Ingrese valor de a=");
        a=teclado.readInteger();
        System.out.println("Ingrese valor de b");
        int b = teclado.readInteger();
        if (a < b) {
            System.out.println("a es menor que b");
        }
        else if(a==b) {
            System.out.println("a es igual a b");
        }
        else{
            System.out.println("a es mayor que b");
        }

        System.out.println("##################### If ################");

        if (m(a,b)) {
            System.out.println("m retorna true");
        }
        else{
            System.out.println("m retorna false");
        }
        System.out.println("##################### Switch ################");
        int dia = 8;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;

            default:
                System.out.println("No existe ese día");
        }
        System.out.println("##################### Switch ################");

        char vocal = '6';
        switch (vocal) {
            case 'a': System.out.println("Seleccionó la vocal 'a'"); break;
            case 'e': System.out.println("Seleccionó la vocal 'e'"); break;
            case 'i': System.out.println("Seleccionó la vocal 'i'"); break;
            case 'o': System.out.println("Seleccionó la vocal 'o'"); break;
            case 'u': System.out.println("Seleccionó la vocal 'u'"); break;
            default:
                System.out.println("No se presionó ninguna vocal");
        }
        System.out.println("##################### While ################");
        int n=0;

        while (n<10) {
            System.out.println("Contando hacia arriba "+ n);
            //n=n+1
            n++;
        }

        while (n > 0) {
            System.out.println("Contando hacia abajo "+n);
            //n=n-1;
            n--;
        }
        System.out.println("##################### DoWhile ################");

        n=10;

        do {
            System.out.println("Contando hacia arriba "+n);
            n++;
        } while (n<10);

        do {
            System.out.println("Contando hacia abajo "+n);
            n--;
        } while (n>0);

        System.out.println("##################### For ################");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);

        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo "+i);
        }
        System.out.println("##################### For ################");
        int[] miArreglo = new int[10];
        System.out.println("Longitud de arreglo "+miArreglo.length);

        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i]=i*10;
            int j = miArreglo[i];
            System.out.println("miArreglo["+i+"]="+j);
        }

        while(true){
            System.out.print("escriba un digito: ");
            n=teclado.readInteger();
            if(n==5) {
            System.out.println("Escribio un 5. Termina");
            break;
            }
        }

        for(int i=0;i<10;i++){
            System.out.print("escriba un digito: ");
            n=teclado.readInteger();
            if(n==0){
                System.out.println("Division entre cero");
                continue;
            }
            System.out.println("100/"+n+"="+100.0/n);
        }
    }
    private static boolean m(int x, int y) {
        return x<y;
    }
}
