package GrafosyAutomatas;
import java.util.*;

public class grafosYautomatas {

    public void GR5_generarGrafosyAutomatas(Scanner sc){
        int opcion1 = 0;
        do{

            System.out.println("\n");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t                  Bienvenido a Automatas              ");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t 1. Automata para validar: a*b+c");
            System.out.println("\t 2. Automata para validar: ab+ca");
            System.out.println("\t 3. Automata para validar: a+/b+/c+");
            System.out.println("\t 4. Automata para validar: 1+/0+1*");
            System.out.println("\t 5. Compilador para validar un numero decimal");  
            System.out.println("\t 6. Compilador para validar la declaracion de variables en java");
            System.out.println("\t 7. Compilador para validar el siguiente lenguaje L:{for, else, ifelse, foreach}");
            System.out.println("\t 8. Validador de claves");
            System.out.println("\t 9. Salir");
            System.out.print("\t Ingrese la opción: ");

            try{
                opcion1 = sc.nextInt();
            }catch(Exception e){
                System.out.println(" ");
                System.out.println("\t Opción no válida. Por favor, ingrese un número del 1 al 7.");
                sc.next();
                continue; 
            }

            switch (opcion1) {
                case 1:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese los valores a evaluar (a* b+ c): ");  
                    String frase1 = sc.nextLine();
                    GR5_Automata1(frase1);
                    break;
                
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    System.out.println(" ");
                    System.out.println("\t Saliendo del menu de Automatas! :)");
                    System.out.println("\n");
                    break;
            
                default:
                    System.out.println("\t Opcion no valida, elija  una opción del 1 al 9");
                    System.out.println("\n");
                    break;
            }
        }while(opcion1 != 5);
    }

    public void GR5_Automata1(String frase1){
        
    }

    public void GR5_Automata2(){

    }

    public void GR5_Automata3(){

    }

    public void GR5_Automata4(){

    }

    public void GR5_CompiladorValidadorNumeroDecimal(){

    }

    public void GR5_CompiladorValidadordeVariablesJava(){

    }

    public void GR5_CompiladordeLenguaje(){

    }

    public void GR5_ValidadordeClaves(){

    }

}
