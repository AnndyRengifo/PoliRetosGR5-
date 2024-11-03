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
                sc.nextLine();
            }catch(Exception e){
                System.out.println(" ");
                System.out.println("\t Opción no válida. Por favor, ingrese un número del 1 al 9.");
                sc.next();
                continue; 
            }

            switch (opcion1) {
                case 1:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese los valores a evaluar (a* b+ c): ");  
                    String entrada = sc.nextLine();
                    GR5_Automata1(entrada);
                    break;
                
                case 2:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese los valores a evaluar (ab+ca): ");  
                    String entrada1 = sc.nextLine();
                    GR5_Automata2(entrada1);
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
            }
        }while(opcion1 != 9);
    }

    public void GR5_Automata1(String entrada){
        int e = -1, estado  = 0;
        char [] letras = entrada.toCharArray();
        for (int letra : letras) {
            switch (estado) {
                case 0: switch (letra) { case 'a': estado = 1; break; case 'b': estado = 2; break; default: estado = e; break; }
                break;
                case 1: switch (letra) { case 'a': estado = 1; break; case 'b': estado = 2; break; default: estado = e; break; }
                break;
                case 2: switch (letra) { case 'b': estado = 2; break; case 'c': estado = 3; break; default: estado = e; break; }
                break;
                case 3: switch (letra) { default: estado = e; break; } 
                break;
                default: estado = e; break;
            }
        }
        if(estado == 3){
            System.out.println("\t\t |--> La cadena es aceptada ");
        }else{
            System.out.println("\t\t |--> La cadena no es aceptada ");
        }
    }

    public void GR5_Automata2(String entrada2){
        int e=-1, estado = 0;
        char [] letras = entrada2.toCharArray();
        for (char letra : letras) {
            switch (estado) {
                case 0: switch (letra) { case 'a': estado = 1; break; default: estado = e; break; }
                break;
                case 1: switch (letra) { case 'b': estado = 2; break; default: estado = e; break; }
                break;
                case 2: switch (letra) { case 'b': estado = 2; break; case 'c': estado = 3; break; default: estado = e; break; }
                break;
                case 3: switch(letra){ case 'a': estado = 4; break; default: estado = e; break; }
                break;
                default: estado = e; break;
            }
        }
        if(estado == 4){
            System.out.println("\t\t |--> La cadena es aceptada ");
        }else{
            System.out.println("\t\t |--> La cadena no es aceptada ");
        }
            
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
