package cadenaCaracteres;
import java.util.*;

public class CadenaDeCaracteres {


    public void generarCaracteres(Scanner sc) {

        String opcion;
        do {
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t          Bienvenido a la Cadena de caracteres!       ");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t1. Contar vocales");
            System.out.println("\t2. Contar Letras");
            System.out.println("\t3. Eliminar vocal");
            System.out.println("\t4. Eliminar letra");
            System.out.println("\t5. Invertir palabra vocales");
            System.out.println("\t6. Invertir palabra letras");
            System.out.println("\t7. Mayusculas sin J");
            System.out.println("\t8. Anagramas");
            System.out.println("\t9. Convertir mayusculas y minusculas");
            System.out.println("\tX. Salir");
            System.out.print("\t Ingrese la opción: ");


            opcion = sc.nextLine();
            sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("\t Ingrese la frase: ");
                    String frase = sc.nextLine();
                    C01(frase);
                    break;
                case "2":
                    System.out.print("\t Ingrese la frase: ");
                    String frase2 = sc.nextLine();
                    C02(frase2);
                    break;
                case "3":
                System.out.print("\t Ingresela frase: ");
                    String frase3 = sc.nextLine();
                    C03(sc, frase3);
                    break;
                case "4":
                    System.out.print("\t Ingrese la frase: ");
                    String frase4 = sc.nextLine();
                    C04(sc, frase4);
                    break;
                case "5":
                    System.out.print("\t Ingrese la frase: ");
                    String frase5 = sc.nextLine();
                    C05(frase5);
                    break;
                case "6":
                    System.out.print("\t Ingrese la frase: ");
                    String frase6 = sc.nextLine();
                    C06(frase6);
                    break;
                case "7":
                    System.out.print("\t Ingrese la frase: ");
                    String frase7 = sc.nextLine();
                    C07(frase7);
                    break;
                case "8":
                    C08();
                    break;
                case "9":
                    System.out.print("\t Ingrese la frase: ");
                    String frase9 = sc.nextLine();
                    C09(sc, frase9);
                    break;
                case "x":
                case "X":
                    System.out.println("\t Saliendo del menu de Cadena de Caracteres! :)");
                    break;
                default:
                    System.out.println("\t Opcion no valida, elija  una opción del 1 al 3");
            }
        }while(!opcion.equalsIgnoreCase("X"));
    }

    public void C01(String frase) {
        int contarVocales = 0;

        for(int i = 0; i < frase.length(); i++){
            char caracter = Character.toLowerCase(frase.charAt(i));
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contarVocales++;
            }
        }
        System.out.println("    C01) La frase \"" + frase + "\" tiene " +  contarVocales + " vocales.");
    }

    public void C02(String frase){
        int contarLetras = 0;
        for(int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter  <= 'z')){
                contarLetras++;
            }
        }
        System.out.println("    C02) La frase \"" + frase + "\" tiene " + contarLetras + " letras.");
    }

    public void C03(Scanner sc, String frase) {
        char vocal;
        
        while (true) {
            System.out.print("\t Ingrese la vocal a eliminar: ");
            String entrada = sc.nextLine().toLowerCase(); 
    
            if (entrada.length() == 1 && "aeiou".indexOf(entrada.charAt(0)) != -1) {
                vocal = entrada.charAt(0);
                break;
            } else {
                System.out.println("    ERROR!. Por favor, ingrese solo una vocal (a, e, i, o, u).");
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
        System.out.println("    C03) La frase sin la vocal \"" + vocal + "\" es: " + resultado.toString());
    }
    
    public void C04(Scanner sc, String frase) {
        char letra;
    
        while (true) {
            System.out.print("\t Ingrese la letra a eliminar: ");
            String entrada = sc.nextLine();
    
            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                letra = entrada.charAt(0);
                break;
            } else {
                System.out.println("    ERROR!! Por favor, ingrese solo una letra.");
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
        System.out.println("    C04) La frase sin la letra \"" + letra + "\" es: " + resultado.toString());
    }
    
    public void C05(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            if (isVowel(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }
        System.out.println("    C05) La frase invertida es: " + resultado.toString());
    }
    
    public void C06(String frase) { //hacer pequenios arreglos :(
        StringBuilder resultadoFrase = new StringBuilder();
        String[] palabras = frase.split(" ");
    
        for (String palabra : palabras) {
            StringBuilder resultadoPalabra = new StringBuilder();
    
            for (int i = palabra.length() - 1; i >= 0; i--) {
                char caracter = palabra.charAt(i);
                
                if (Character.isLetter(caracter) && !"aeiouAEIOU".contains(String.valueOf(caracter))) {
                    resultadoPalabra.append(Character.toUpperCase(caracter));
                }else {
                    resultadoPalabra.append(caracter);
                }
            }
    
            if (resultadoFrase.length() > 0) {
                resultadoFrase.append(" "); 
            }
            resultadoFrase.append(resultadoPalabra);
        }
    
        System.out.println("    C06) La frase invertida es: " + resultadoFrase.toString());
    }
               
    public void C07(String frase){
        StringBuilder resultado = new StringBuilder();

        for(int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if(caracter != 'j' &&  caracter != 'J'){
                resultado.append(Character.toUpperCase(caracter));
            }
        }
        System.out.println("    C07) La frase en mayusculas y sin 'J' es: " + resultado.toString());
    }

    public void C08(){ //consultar como funciona!! :C
        String[][] anagramas = {
            {"delira", "lidera"},
            {"ballena", "llenaba"},
            {"alondra", "ladrona"},
            {"espania", "apanies"},
            {"enrique", "quieren"}
        };
        String[] palabraElegida = anagramas[0];
        String palabra = palabraElegida[0];
        String respuestaCorrecta = palabraElegida[1];

        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        boolean acertado = false;

        System.out.println("\t Palabra: " + palabra);
        System.out.println("\t Ingrese un anagrama de la palabra: ");

        while(intentos < 3 && !acertado){
            String intento = sc.nextLine();

            if(intento.equalsIgnoreCase(respuestaCorrecta)){
                acertado = true;
                System.out.println("\t Acertaste! el anagrama es: " + respuestaCorrecta);
            }else{
                intentos++;
                if(intentos < 3){
                    System.out.println("\t Intentos restantes: " + (3 - intentos));
                }
            }
        }
        if(!acertado){
            System.out.println("\t Perdiste! la respuesta correcta era: "+ respuestaCorrecta);
        }
        sc.close();
    }

    public void C09(Scanner sc, String frase){
        String resultado = convertirFrase(frase);
        System.out.println("    C09) Salida: " + resultado);

    }
    private String convertirFrase(String frase){
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;
        
        for(char caracter : frase.toCharArray()){
            if(Character.isLetter(caracter)){
                if(mayuscula){
                    resultado.append(Character.toUpperCase(caracter));
                }else{
                    resultado.append(Character.toLowerCase(caracter));
                }
                mayuscula = !mayuscula;
            }else{
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }


    // Metodo para verificar si un caracter es una vocal
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    
    
    

}

