package cadenaCaracteres;

import java.util.*;

public class CadenaDeCaracteres {
    public void generarCaracteres(Scanner sc) {

        int opcion;
        do {
            System.out.println("Bienvenido a la Cadena de caracteres!");
            System.out.println("1. Contar vocales");
            System.out.println("2. Contar Letras");
            System.out.println("3. Eliminar vocal");
            System.out.println("4. Eliminar letra");
            System.out.println("5. Invertir palabra");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");

            while(!sc.hasNext()){
                System.out.println("Error, ingrese un número");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la frase: ");
                    String frase = sc.nextLine();
                    C01(frase);
                    break;
                case 2:
                    System.out.print("Ingrese la frase: ");
                    String frase2 = sc.nextLine();
                    C02(frase2);
                    break;
                case 3:
                    System.out.print("Ingresela frase: ");
                    String frase3 = sc.nextLine();
                    C03(sc, frase3);
                    break;
                case 4:
                    System.out.print("Ingrese la frase: ");
                    String frase4 = sc.nextLine();
                    C04(sc, frase4);
                    break;
                case 5:
                    System.out.print("Ingresela frase: ");
                    String frase5 = sc.nextLine();
                    C05(sc, frase5);
                    break;
                case 6:
                    System.out.println("Saliendo del menu de Cadena de Caracteres! :)");
                    break;
                default:
                    System.out.println("Opcion no valida, elija  una opción del 1 al 3");
            }
        }while(opcion !=6);
    }

    public void C01(String frase) {
        int contarVocales = 0;

        for(int i = 0; i < frase.length(); i++){
            char caracter = Character.toLowerCase(frase.charAt(i));
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contarVocales++;
            }
        }
        System.out.println("C01) La frase \"" + frase + "\" tiene " +  contarVocales + " vocales.");
    }

    public void C02(String frase){
        int contarLetras = 0;
        for(int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter  <= 'z')){
                contarLetras++;
            }
        }
        System.out.println("C02) La frase \"" + frase + "\" tiene " + contarLetras + " letras.");
    }

    public void C03(Scanner sc, String frase) {
        char vocal;
        
        while (true) {
            System.out.print("Ingrese la vocal a eliminar: ");
            String entrada = sc.nextLine().toLowerCase(); 
    
            if (entrada.length() == 1 && "aeiou".indexOf(entrada.charAt(0)) != -1) {
                vocal = entrada.charAt(0);
                break;
            } else {
                System.out.println("ERROR!. Por favor, ingrese solo una vocal (a, e, i, o, u).");
            }
        }
    
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter != vocal) {
                resultado.append(frase.charAt(i));
            } else {
                resultado.append(" ");
            }
        }
        System.out.println("C03) La frase sin la vocal \"" + vocal + "\" es: " + resultado.toString());
    }
    
    public void C04(Scanner sc, String frase) {
        char letra;
    
        while (true) {
            System.out.print("Ingrese la letra a eliminar: ");
            String entrada = sc.nextLine();
    
            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                letra = entrada.charAt(0);
                break;
            } else {
                System.out.println("ERROR!! Por favor, ingrese solo una letra.");
            }
        }
    
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter != Character.toLowerCase(letra)) {
                resultado.append(frase.charAt(i));
            } else {
                resultado.append(" ");
            }
        }
        System.out.println("C04) La frase sin la letra \"" + letra + "\" es: " + resultado.toString());
    }
    
     public void C05(String frase){
        StringBuilder resultado = new StringBuilder();
        for(int i = frase.length() - 1; i >= 0; i--){
            char caracter = frase.charAt(i);
            if(isVowel(caracter)){
                resultado.append(Character.toUpperCase(caracter));
            }else{
                resultado.append(caracter);
            }
        }
        System.out.println("C05) La frase invertida es: " +  resultado.toString());
    }
    
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != - 1;
    }

}
