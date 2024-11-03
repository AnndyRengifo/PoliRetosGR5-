package SeriesRecursion;

import java.util.Scanner;

public class seriesRecursion {

    public void generarRecursion(Scanner sc) {

        int opcion;
        do {
            System.out.println("\t Bienvenido a  la serie de recursion");
            System.out.println("\t 1. Obtener el factorial de un numero ");
            System.out.println("\t 2. Obtener la suma de dos numeros");
            System.out.println("\t 3. Obtener la multiplicacion de dos numeros");
            System.out.println("\t 4. Obtener la potencia");
            System.out.println("\t 5. Obtener el conteo Progresivo hasta un numero");  
            System.out.println("\t 6. Obtener el conteo Regresivo  hasta un numero");
            System.out.println("\t 7. Salir");
            System.out.print("\t Ingrese la opción: ");


            opcion = sc.nextInt();
            sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\t  Ingrese el numero para obtener el factorial: ");  
                    int numero1 = sc.nextInt();
                    GR5_obtenerFactorial(numero1);
                    break;
                case 2:
                    System.out.print("\t Ingrese el primer numero para obtener la suma: ");  
                    int numero2 = sc.nextInt();
                    System.out.print("\t Ingrese el segundo numero para obtener la suma: ");  
                    int numero3 = sc.nextInt();
                    GR5_obtenerSuma(numero2, numero3);
                    break;
                case 3:
                    System.out.print("\t Ingrese el primer para obtener la multiplicacion:  ");
                    int numero4 = sc.nextInt();
                    System.out.print("\t Ingrese el segundo para obtener la multiplicacion:  ");
                    int numero5 = sc.nextInt();
                    GR5_obtenerMultiplicaion(numero4, numero5);;
                    break;
                case 4:
                    System.out.print("\t Ingrese el numero al que desea obtener la potencia:  ");
                    int numero6 = sc.nextInt();
                    System.out.print("\t Ingrese el numero para elevar:  ");
                    int numero7 = sc.nextInt();
                    GR5_obtenerPotencia(numero6, numero7);
                    break;
                case 5:
                    System.out.print("\t Ingrese el numero hasta donde quiere progresar: ");
                    int numero8 = sc.nextInt();
                    GR5_conteoProgresivo(numero8);
                    break;
                case 6:
                    System.out.print("Ingrese el numero para la cuenta regresiva: ");
                    int numero9 = sc.nextInt();
                    GR5_conteoRegresivo(numero9);
                    
                    break;
                case 7:
                    System.out.println("Saliendo del menu de Cadena de Caracteres! :)");
                    break;
                default:
                    System.out.println("Opcion no valida, elija  una opción del 1 al 7");
            }
        }while (opcion !=10);
    }


    public void GR5_obtenerFactorial(int nunero1){
        

    }


    public void GR5_obtenerSuma(int numero2, int numero3){


    }

    public void GR5_obtenerMultiplicaion(int numero4, int numero5){


    }

    public void GR5_obtenerPotencia(int nummero6, int numero7){


    }

    public void GR5_conteoProgresivo(int numero5){


    }

    public void GR5_conteoRegresivo(int numero9){


    }
}
