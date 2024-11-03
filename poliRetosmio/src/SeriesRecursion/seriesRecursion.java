package SeriesRecursion;

import java.util.Scanner;

public class seriesRecursion {

    public void generarRecursion(Scanner sc) {

        int opcion=0;
        do {
            System.out.println("\n");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t           Bienvenido a  la serie de recursion        ");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t 1. Obtener el factorial de un numero ");
            System.out.println("\t 2. Obtener la suma de dos numeros");
            System.out.println("\t 3. Obtener la multiplicacion de dos numeros");
            System.out.println("\t 4. Obtener la potencia");
            System.out.println("\t 5. Obtener el conteo Progresivo hasta un numero");  
            System.out.println("\t 6. Obtener el conteo Regresivo  hasta un numero");
            System.out.println("\t 7. Salir");
            System.out.print("\t Ingrese la opción: ");

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println(" ");
                System.out.println("\t Opción no válida. Por favor, ingrese un número del 1 al 7.");
                sc.next();
                continue; 
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese el numero para obtener el factorial: ");  
                    int numero1 = sc.nextInt();
                    GR5_obtenerFactorial(numero1);
                    System.out.println("\t El factorial del numero: " +  numero1 + " es: " + GR5_obtenerFactorial(numero1));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.print("\t Ingrese el primer numero para obtener la suma: ");  
                    int numero2 = sc.nextInt();
                    System.out.print("\t Ingrese el segundo numero para obtener la suma: ");  
                    int numero3 = sc.nextInt();
                    GR5_obtenerSuma(numero2, numero3);
                    System.out.println("\t La suma de los numeros " + numero2 + " + " + numero3 +  " es: " +  GR5_obtenerSuma(numero2, numero3));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.print("\t Ingrese el primer para obtener la multiplicacion:  ");
                    int numero4 = sc.nextInt();
                    System.out.print("\t Ingrese el segundo para obtener la multiplicacion:  ");
                    int numero5 = sc.nextInt();
                    GR5_obtenerMultiplicacion(numero4, numero5);;
                    System.out.println("\t La multipliacion de los numeros " + numero4 + " x " + numero5 + " es: " +  GR5_obtenerMultiplicacion(numero4, numero5));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.print("\t Ingrese el numero al que desea obtener la potencia:  ");
                    int numero6 = sc.nextInt();
                    System.out.print("\t Ingrese el numero para elevar:  ");
                    int numero7 = sc.nextInt();
                    GR5_obtenerPotencia(numero6, numero7);
                    System.out.println("\t El resultado del numero "+ numero6 + " elevado a la potencia "+ numero7 + " es: "+  GR5_obtenerPotencia(numero6, numero7));
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("\n");
                    System.out.print("\t Ingrese el numero hasta donde quiere progresar: ");
                    int numero8 = sc.nextInt();
                    GR5_conteoProgresivo(numero8);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("\n");
                    System.out.print("\t Ingrese el numero para la cuenta regresiva: ");
                    int numero9 = sc.nextInt();
                    GR5_conteoRegresivo(numero9);
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println(" ");
                    System.out.println("\t Saliendo del menu de Series de Recursion! :)");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("\t Opcion no valida, elija  una opción del 1 al 7");
            }
        }while (opcion !=7);
    }


    public int GR5_obtenerFactorial(int numero1){
        return numero1 == 0? 1: numero1 * GR5_obtenerFactorial(numero1-1);    
    }


    public int GR5_obtenerSuma(int numero2, int numero3){
        return numero3 ==0? numero2: GR5_obtenerSuma(numero2+1, numero3-1);
    }

    public int GR5_obtenerMultiplicacion(int numero4, int numero5){
        return numero5 ==0? 0:  numero4 + GR5_obtenerMultiplicacion(numero4, numero5-1);
    }

    public int GR5_obtenerPotencia(int numero6, int numero7){
        return numero7==0? 1:  numero6 * GR5_obtenerPotencia(numero6, numero7-1);
    }

    public void GR5_conteoProgresivo(int numero8){
        if(numero8 <=0){
            return;
        }
        GR5_conteoProgresivo(numero8 - 1);
        System.out.print(" "+numero8+" ");
    }

    public void GR5_conteoRegresivo(int numero9){
        if(numero9 > 0){
            System.out.print(" "+numero9+" ");
            GR5_conteoRegresivo(numero9 - 1);
        }
    }
}