package seriesArrays;
import java.util.*;

public class seriesArrays {
    public void generarArrays(Scanner sc){

        int opcion;
        do { 
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t          Bienvenido a los Arrays!       ");
            System.out.println("\t |---------------------------------------------------|");
            System.out.println("1. Porcentaje con nombres");
            System.out.println("2. Iniciales con Caracteres");
            System.out.println("3. Plano de Coordenadas con Nombre");
            System.out.println("4. X con nombre y apellido");
            System.out.println("5. Matriz cuadrada Random");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            while(!sc.hasNext()){
                System.out.println("Error, ingrese un número");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> A01(sc);
                case 2 -> A02(sc);
                case 3 -> A03(sc);
                case 4 -> A04(sc);
                case 5 -> A05(sc);
                case 6 -> System.out.println("Saliendo del programa Arrays");
                default -> System.out.println("Opción no válida");
            }
            
        } while (opcion != 6);
    }

    public void A01(Scanner sc){
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();
        String[] palabras = nombreCompleto.split(" ");
        int[] porcentajes = new int[palabras.length];


        System.out.print("Ingrese el porcentaje de carga para cada  palabra: ");
        for(int i = 0; i < palabras.length; i++){
            while(!sc.hasNextInt()){
                System.out.println("Error, ingrese un número");
                sc.next();
            }
            porcentajes[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("\n" + nombreCompleto);
        for(int i = 0; i < palabras.length; i++){
            mostrarProgreso(palabras[i], porcentajes[i]);
        }

    }

    private void mostrarProgreso(String palabra, int porcentaje) {
        int longitudBarra = 15;
        int cantidadLlenos = (porcentaje * longitudBarra) / 100;
        int cantidadVacios = longitudBarra - cantidadLlenos;

        int longitudCorte = (porcentaje * palabra.length()) / 100;
        String palabraCortada = palabra;
        if (longitudCorte < palabra.length()) {
            palabraCortada = palabra.substring(0, longitudCorte);
        }

        String barra = "[" + "=".repeat(cantidadLlenos) + ">".repeat(1) 
                        + " ".repeat(cantidadVacios) + "] "
                        + porcentaje + "% " + palabraCortada;
        System.out.println(barra);
    }

    public void A02(Scanner sc){
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamanio = sc.nextInt();
        
        System.out.print("Ingrese el carácter para construir las iniciales: ");
        char caracter = sc.next().charAt(0);

        System.out.println("\nIniciales en Matriz:");
        imprimirIniciales(nombreCompleto, tamanio, caracter);
    }

    public void imprimirIniciales(String nombreCompleto, int tamanio, char caracter) {
        String[] palabras = nombreCompleto.split(" ");
        StringBuilder[] letras = new StringBuilder[palabras.length];
    
        for (int i = 0; i < palabras.length; i++) {
            char inicial = palabras[i].charAt(0);
            letras[i] = new StringBuilder();
            for (int j = 0; j < tamanio; j++) {
                for (int k = 0; k < tamanio; k++) {
                    if (esParteInicial(inicial, j, k, tamanio)) {
                        letras[i].append(caracter);
                    } else {
                        letras[i].append(' ');
                    }
                }
                letras[i].append("  "); 
            }
        }
    

        for (int fila = 0; fila < tamanio; fila++) {
            for (StringBuilder letra : letras) {
                for (int col = 0; col < tamanio; col++) {
                    System.out.print(letra.charAt(fila * (tamanio + 2) + col)); 
                }
                System.out.print("  "); 
            }
            System.out.println();
        }
    }

    private boolean esParteInicial(char letra, int i, int j, int tamanio) {
        return switch (letra) {
            case 'A' -> (j == 0 || j == tamanio - 1 || i == 0 || i == tamanio / 2);
            case 'B' -> (j == 0 || (i == 0 || i == tamanio / 2 || i == tamanio - 1) && j < tamanio - 1 || (j == tamanio - 1 && (i > 0 && i < tamanio)));
            case 'C' -> (j == 0 || i == 0 || i == tamanio - 1);
            case 'D' -> (j == 0 || (i == 0 || i == tamanio - 1) && j < tamanio - 1 || (j == tamanio - 1 && (i > 0 && i < tamanio)));
            case 'E' -> (j == 0 || i == 0 || i == tamanio / 2 || i == tamanio - 1);
            case 'F' -> (j == 0 || i == 0 || i == tamanio / 2);
            case 'G' -> (j == 0 || i == 0 || i == tamanio - 1 || (j == tamanio - 1 && i > tamanio / 2) || (i == tamanio / 2 && j < tamanio - 1));
            case 'H' -> (j == 0 || j == tamanio - 1 || i == tamanio / 2);
            case 'I' -> (j == tamanio / 2 || i == 0 || i == tamanio - 1);
            case 'J' -> (j == tamanio / 2 && i < tamanio - 1 || i == tamanio - 1 && j < tamanio / 2);
            case 'K' -> (j == 0 || j == tamanio - 1 || (i == tamanio / 2 && j < tamanio - 1) || (j < tamanio / 2 && i + j == tamanio / 2) || (j > tamanio / 2 && i - j == tamanio / 2));
            case 'L' -> (j == 0 || i == tamanio - 1);
            case 'M' -> (j == 0 || j == tamanio - 1 || i == j && i < tamanio / 2 || i + j == tamanio - 1 && i < tamanio / 2);
            case 'N' -> (j == 0 || j == tamanio - 1 || i == j);
            case 'O' -> (j == 0 || j == tamanio - 1 || i == 0 || i == tamanio - 1);
            case 'P' -> (j == 0 || (i == 0 || i == tamanio / 2) && j < tamanio - 1 || (j == tamanio - 1 && (i > 0 && i < tamanio / 2)));
            case 'Q' -> (j == 0 || j == tamanio - 1 || i == 0 || i == tamanio - 1 || (i - j == tamanio / 2));
            case 'R' -> (j == 0 || i == 0 || (j == tamanio - 1 && i < tamanio / 2) || (i == tamanio / 2 && j < tamanio - 1) || (i > tamanio / 2 && i == j));
            case 'S' -> (j == 0 || j == tamanio - 1 || (i == 0 || i == tamanio - 1) && j > 0 && j < tamanio - 1 || (i == tamanio / 2 && j > 0 && j < tamanio - 1));
            case 'T' -> (i == 0 || j == tamanio / 2);
            case 'U' -> (j == 0 || j == tamanio - 1 || i == tamanio - 1);
            case 'V' -> (i + j == tamanio - 1 && i <= tamanio / 2);
            case 'W' -> (j == 0 || j == tamanio - 1 || i == j && i >= tamanio / 2 || i + j == tamanio - 1 && i >= tamanio / 2);
            case 'X' -> (i + j == tamanio - 1 || i == j);
            case 'Y' -> (i == j && i <= tamanio / 2 || j == tamanio / 2 && i <= tamanio / 2);
            case 'Z' -> (i == 0 || i == tamanio - 1 || j + i == tamanio - 1);
            default -> false;
        };        
    }

    public void A03(Scanner sc){ //arreglar
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        int maxX = 5;
        int maxY = nombre.length();
        char[][] plano = new char[maxY + 1][maxX + 1];

        for (char[] fila : plano) {
            for (int j = 0; j < fila.length; j++) {
                fila[j] = ' ';
            }
        }
        
        for(int x = 0; x <= maxX; x++){
            int y = 2 * x;
            if(y < maxY){
                int charIndex = x % nombre.length();
                plano[maxY - 1 - y][x] = nombre.charAt(charIndex);
            }
        }

        for(int i = 0; i <= maxY; i++){
            System.out.printf("%2d |", maxY - i);
            for(int j = 0; j < maxX; j++){
                System.out.print(plano[i][j]);
            }
            System.out.println();
        }

        System.out.print("   |");
        for(int j = 0; j <= maxX; j++){
            System.out.print("__");
        }
        System.out.println("_");
        System.out.print("   |");
        System.out.println();
    }

    public void A04(Scanner sc) {
        System.out.print("Ingrese su nombre y apellido: ");
        String input = sc.nextLine();
        
        String[] partes = input.split(" ");
        String nombre = partes[0];
        String apellido = partes.length > 1 ? partes[1] : "";

        int tamanio = apellido.length();
        char[][] matriz = new char[tamanio][tamanio];

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < tamanio; i++) {
            if (i < nombre.length()) { 
                matriz[i][i] = nombre.charAt(i);
            }
            if (i < apellido.length()) {
               matriz[tamanio - 1 - i][i] = apellido.charAt(i);
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void A05(Scanner sc) {
        System.out.print("Ingrese su nombre completo: ");
        String input = sc.nextLine();
        String[] nombres = input.trim().split(" ");

        int tamanio = 0;
        for (String nombre : nombres) {
            tamanio += nombre.length();
        }

        tamanio = Math.max(tamanio / 2, 1); 
        char[][] matriz = new char[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = ' ';
            }
        }

        Random random = new Random();

        for (String nombre : nombres) {
            boolean placed = false;
        
            while (!placed) {
                int direction = random.nextInt(4);
                int fila = random.nextInt(tamanio);
                int columna = random.nextInt(tamanio);
                
                boolean canPlace;
        
                switch (direction) {
                    case 0 -> { // Horizontal
                        canPlace = columna + nombre.length() <= tamanio;
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                if (matriz[fila][columna + j] != ' ' && matriz[fila][columna + j] != nombre.charAt(j)) {
                                    canPlace = false;
                                    break;
                                }
                            }
                        }
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                matriz[fila][columna + j] = (matriz[fila][columna + j] != ' ') ? '*' : nombre.charAt(j);
                            }
                            placed = true;
                        }
                    }
                    case 1 -> { // Vertical
                        canPlace = fila + nombre.length() <= tamanio;
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                if (matriz[fila + j][columna] != ' ' && matriz[fila + j][columna] != nombre.charAt(j)) {
                                    canPlace = false;
                                    break;
                                }
                            }
                        }
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                matriz[fila + j][columna] = (matriz[fila + j][columna] != ' ') ? '*' : nombre.charAt(j);
                            }
                            placed = true;
                        }
                    }
                    case 2 -> { // Diagonal descendente
                        canPlace = fila + nombre.length() <= tamanio && columna + nombre.length() <= tamanio;
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                if (matriz[fila + j][columna + j] != ' ' && matriz[fila + j][columna + j] != nombre.charAt(j)) {
                                    canPlace = false;
                                    break;
                                }
                            }
                        }
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                matriz[fila + j][columna + j] = (matriz[fila + j][columna + j] != ' ') ? '*' : nombre.charAt(j);
                            }
                            placed = true;
                        }
                    }
                    case 3 -> { // Diagonal ascendente
                        canPlace = fila + nombre.length() <= tamanio && columna - nombre.length() >= -1;
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                if (matriz[fila + j][columna - j] != ' ' && matriz[fila + j][columna - j] != nombre.charAt(j)) {
                                    canPlace = false;
                                    break;
                                }
                            }
                        }
                        if (canPlace) {
                            for (int j = 0; j < nombre.length(); j++) {
                                matriz[fila + j][columna - j] = (matriz[fila + j][columna - j] != ' ') ? '*' : nombre.charAt(j);
                            }
                            placed = true;
                        }
                    }
                    default -> throw new IllegalArgumentException("Dirección no válida");
                }                
        
                imprimirMatriz(matriz);
                esperar(500);
            }
        }
        
        System.out.println("\nMatriz Final:");
        imprimirMatriz(matriz);
    }

    private void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char letra : fila) {
                System.out.print(letra + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
    }

}

