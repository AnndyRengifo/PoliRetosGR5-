package seriesNumericas;

import java.util.Scanner;

public class SeriesNumericas {

    public void generarSeries(Scanner sc) {
        System.out.print("Ingrese el número de términos de la serie: ");
        int n = sc.nextInt();

        System.out.println("\t Serie de Fibonacci: ");
        g5_crearserieFibonacci(n);
        System.out.println("\t Serie Alternada: ");
        g5_crearserieAlternada(n);
        System.out.println("\t Serie Fraccion Fibonacci/Impares: ");
        g5_crearserieFraccionFibonacciImpares(n);
        System.out.println("\t Serie Fraccion Fibonacci/pares: ");
        g5_crearserieFraccionFibonacciPares(n);
        System.out.println("\t Serie Primos: ");
        g5_crearseriePrimos(n);
        System.out.println("\t Serie Progresion cuadratica: ");
        g5_crearserieProgresionCuadratica(n);
        System.out.println("\t Serie Incremento de 3: ");
        g5_crearserieIncrementoDeTres(n);
        System.out.println("\t Serie Incrementos de 5: ");
        g5_crearserieIncrementoDeCinco(n);
        System.out.println("\t Serie Potencias de 2: ");
        g5_crearseriePotenciasDeDos(n);
        System.out.println("\t Serie potencia de 3: ");
        g5_crearseriePotenciasDeTres(n);
        System.out.println("\t Serie cuadrados Perfectos: ");
        g5_crearserieCuadradosPerfectos(n);
    }

    public void g5_crearserieFibonacci(int numTerminos){
        int a = 0, b = 1, temp;
        for(int i = 0; i < numTerminos; i++){
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    public void g5_crearserieAlternada(int numTerminos){
        
        for(int i = 1; i <= numTerminos; i++){
            System.out.print((i * 2 - 1) + " ");
            System.out.print("0 ");
        }
        System.out.println();
    }

    public void g5_crearserieFraccionFibonacciImpares(int numTerminos){
        int a = 0, b = 1, temp;
    
        for(int i = 0; i < numTerminos; i++){
            if(i % 2 == 0){
                System.out.print(a + "/" + (2 * i + 1) + " ");
                temp = a;
                a = b;
                b = temp + b;
            }else{
                System.out.print("0/" + (2 * i + 1) + " ");
            }
        }
        System.out.println();
    }

    public void g5_crearserieFraccionFibonacciPares(int numTerminos){
        int a = 0, b = 1, temp;
        
        for(int i = 0; i < numTerminos; i++){
            System.out.print(a + "/" + (2 * (i + 1)) + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    public void g5_crearseriePrimos(int numTerminos){
                int count = 0, num = 2;
        while (count < numTerminos){
            if (esPrimo(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    private boolean esPrimo(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public void g5_crearserieProgresionCuadratica(int numTerminos){
        
        for(int i = 0; i <= numTerminos; i++){
            System.out.print((i * (i + 1)) + " ");
        }
        System.out.println();
    }

    public void g5_crearserieIncrementoDeTres(int numTerminos){
        
        for(int i = 0; i < numTerminos; i++){
            System.out.print((i * 3 + 1) + " ");

        }
        System.out.println();
    }

    public void g5_crearserieIncrementoDeCinco(int numTerminos){
       
        for(int i = 0; i <= numTerminos; i++){
            System.out.print((i * 5 + 3) + " ");
        }
        System.out.println();
    }

    public void g5_crearseriePotenciasDeDos(int numTerminos){
        
        for (int i = 0; i < numTerminos; i++) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
        System.out.println();
    }

    public void g5_crearseriePotenciasDeTres(int numTerminos){
        
        for(int i = 0; i <= numTerminos; i++){
            System.out.print((int)Math.pow(3, i) + " ");
        }
    }

    public void g5_crearserieCuadradosPerfectos(int numTerminos){
        
        for(int i = 1; i <= numTerminos; i++){
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

}
