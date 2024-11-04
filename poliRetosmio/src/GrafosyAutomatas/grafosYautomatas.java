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
            System.out.println("\t 4. Automata para validar: 1+/0+ 1*");
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
                    System.out.println("\n");
                    System.out.print("\t  Ingrese los valores a evaluar (a*/b+/c+): ");  
                    String entrada2 = sc.nextLine();
                    GR5_Automata3(entrada2);
                break;

                case 4:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese los valores a evaluar (1+/0+ 1*): ");  
                    String entrada3 = sc.nextLine();
                    GR5_Automata4(entrada3);
                break;

                    case 5:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese el numero decimal a evaluar: ");  
                    String entrada4 = sc.nextLine();
                    GR5_CompiladorValidadorNumeroDecimal(entrada4);
                break;

                case 6:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese la variable a evaluar: ");  
                    String entrada5 = sc.nextLine();
                    GR5_CompiladorValidadordeVariablesJava(entrada5);
                break;

                case 7:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese el lenguaje a evaluar: ");  
                    String entrada6 = sc.nextLine();
                    GR5_CompiladordeLenguaje(entrada6);
                break;

                case 8:
                    System.out.println("\n");
                    System.out.print("\t  Ingrese la clave a evaluar: ");  
                    String entrada7 = sc.nextLine();
                    GR5_ValidadordeClaves(entrada7);
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
    
    public void GR5_Automata3(String entrada2){
        int e=-1, estado = 0;
        char [] letras = entrada2.toCharArray();
        for (char letra : letras) {
            switch (estado) {
                case 0: 
                    switch (letra) { case 'a': estado = 1; break; case 'b': estado = 2; break; case 'c': estado = 3; break; default: estado = e; break; }
                    break;
                case 1:
                    switch (letra) { case 'a': estado = 1; break; case 'b': estado = 4; break; default: estado = e; break; }
                    break;
                case 2:
                    switch (letra) { case 'b': estado = 2; break; case 'c': estado = 4; break; default: estado = e; break; }
                    break;
                case 3:
                    switch (letra) { case 'a': estado = 4; break; case 'c': estado = 3; break; default: estado = e; break; }
                    break;
                default: estado = e; break;
            }
        }
        if (estado == 4) {
            System.out.println("\t\t |--> La cadena es aceptada ");
        }else{
            System.out.println("\t\t |--> La cadena no es aceptada ");
        }
    }
    
    public void GR5_Automata4(String entrada3){
        int e = -1, estado = 0;
        char [] numeros = entrada3.toCharArray();
        for ( char numero : numeros) {
            switch (estado) {
                case 0:
                switch (numero) { case '1': estado = 1; break; case '0': estado = 2; break; default: estado = e; break;} 
                break;
                case 1: 
                switch (numero) { case '0': estado = 2; break; case '1': estado = 1; break; default: estado = e; break; }
                break;
                case 2:
                switch (numero) { case '0': estado = 2; break; case '1': estado = 3; break; default: estado = e; break; }
                break;
                case 3: 
                switch (numero) { case '1': estado = 3; break; default: estado = e; break; }
                break;
                default: estado = e; break;
            }
        } 
        if (estado == 2 || estado == 3) {
            System.out.println("\t\t |--> La cadena es aceptada ");
        } else {
            System.out.println("\t\t |--> La cadena no es aceptada ");
        }
    }

    public void GR5_CompiladorValidadorNumeroDecimal(String entrada4){
        int e = -1, estado = 0; 
        char [] numeros = entrada4.toCharArray();
        for (char decimal : numeros) {
            switch (estado) {
                case 0:
                    if (Character.isDigit(decimal)) {
                        estado = 1;
                    } else {
                        estado = e;
                    }
                    break;
                    
                case 1:
                    if (Character.isDigit(decimal)) {
                        estado = 1;
                    } else if (decimal == '.') {
                        estado = 2;
                    } else if (decimal == 'e') {
                        estado = 3;
                    }else{
                        estado = e;
                    }
                break;
                
                case 2:
                    if (Character.isDigit(decimal)) {
                            estado = 2;
                        } else if (decimal == 'e') {
                            estado = 3;
                        }else{
                            estado = e;
                        }
                break;

                case 3:
                if (Character.isDigit(decimal)) {
                    estado = 4;
                } else {
                    estado = e;
                }
                break;
                
                case 4:
                if (Character.isDigit(decimal)) {
                        estado = 4;
                    } else {
                        estado = e;
                    }
                break;
                default: estado = e; break;
            }
        }
        if ( estado == 2 || estado == 4 ) {
            System.out.println("\t\t |--> Es un numero decimal ");
        }else{
            System.out.println("\t\t |--> No es un numero decimal ");
        }
    }

    public void GR5_CompiladorValidadordeVariablesJava(String entrada5){
        int e = -1, estado = 0; 
        char [] numeros = entrada5.toCharArray();
        for (char variable : numeros) {
            switch (estado) {
                case 0:
                    if (Character.isLetter(variable)) {
                        estado = 1;
                    } else {
                        estado = e;
                    }
                    break;
                    
                case 1:
                    if (Character.isLetter(variable)) {
                        estado = 1;
                    }else if(Character.isDigit(variable)){
                        estado = 2;
                    }else if (variable == '_') {
                        estado = 1;
                    } else if (variable == ';') {
                        estado = 3;
                    }else{
                        estado = e;
                    }
                break;
                
                case 2:
                    if (Character.isLetter(variable)) {
                        estado = 1;
                    }else if(Character.isDigit(variable)){
                        estado = 2;
                    }else if (variable == '_') {
                        estado = 1;
                    } else if (variable == ';') {
                        estado = 3;
                    }else{
                        estado = e;
                    }
                break;
                default: estado = e; break;
            }
        }
        if (estado == 3 ) {
            System.out.println("\t\t |--> Felicidades... Es una variable valida");
        }else{
            System.out.println("\t\t |--> No es un variable valida ");
        }
    }
    
    public void GR5_CompiladordeLenguaje(String entrada6){
        
    }

    public void GR5_ValidadordeClaves(String entrada7){
        int estado = 0, e = -1;
        for (char clave : entrada7.toCharArray()) {
            switch (estado) {
                case 0:
                    if (Character.isUpperCase(clave)) {
                        estado = 1;
                    } else {
                        estado = e;                      
                    }
                break;
                    
                case 1:
                    if (Character.isLowerCase(clave)) {
                        estado = 2;
                    } else {
                        estado = e;                     
                    }
                break;
                    
                case 2:
                    if (Character.isDigit(clave)) {
                        estado = 3;
                    } else {
                        estado = e;
                    }
                break;
                    
                default: estado = 0; break;
            }    
        }
        if (estado == 3) {
            System.out.println("\t\t |--> Felicidades... Es una clave valida");
        } else {
            System.out.println("\t\t |--> No es una clave valida");
        }
    }
}
