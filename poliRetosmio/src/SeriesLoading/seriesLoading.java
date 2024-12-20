package SeriesLoading;

import java.util.*;


public class seriesLoading {

    public void generarLoading(Scanner sc) {
        int opcion=0;

        do {
            System.out.println("\t |---------------------------------------------------|");
            System.out.println("\t          Bienvenido a las Series Loading!            ");
            System.out.println("\t |---------------------------------------------------|");
            System.out.println("\t 1. Carga rotacional                                  ");
            System.out.println("\t 2. Carga con caracter                                ");
            System.out.println("\t 3. Carga de movimiento                               ");
            System.out.println("\t 4. Carga con o0o                                     ");
            System.out.println("\t 5. Carga con cambio > -                              ");
            System.out.println("\t 6. Carga con <=>                                     ");
            System.out.println("\t 7. Carga con cambio en la punta |/-|                 ");
            System.out.println("\t 8. Carga con nombres y apellidos                     ");
            System.out.println("\t 9. Carga con nombre completo                         ");
            System.out.println("\t 10. Carga de un archivo                              ");
            System.out.println("\t 11. Simular longitud de señal                        ");
            System.out.println("\t 12. Barras de sonido vectorial                       ");
            System.out.println("\t 13. Desplazar figura de izquierda a derecha          ");
            System.out.println("\t 14. Salir");
            System.out.print("\t Ingrese una opción: ");

            try{
                opcion = sc.nextInt();
                sc.nextLine();
            }catch(Exception e){
                System.out.println(" ");
                System.out.println("\t Opción no válida. Por favor, ingrese un número del 1 al 14.");
                sc.next();
                continue; 
            }

            switch (opcion) {
                case 1 -> {
                    try {
                        GR5_indicadordeCarga();
                    } catch (InterruptedException e) {
                        System.out.println("\t La animación de carga fue interrumpida.");
                        Thread.currentThread().interrupt();
                    }
                }
                case 2 -> GR5_simularCarga(sc);
                case 3 -> GR5_desplzarIzquierdaDerecha(sc);
                case 4 -> GR5_simularWaiting();
                case 5 -> GR5_barraAvanza();
                case 6 -> GR5_desplzarBarraIzquierdaDerecha();
                case 7 -> GR5_cargaConCambiodePunta();
                case 8 ->  GR5_cargaConNombreyApeliido(sc);
                case 9 -> GR5_cargaConNombreCompleto(sc);
                case 10 -> GR5_cargaDeUnArchivo();
                case 11 -> GR5_simularLongitudDeSenial();
                case 12 -> GR5_barraDeSonidoVectorial();
                case 13 -> GR5_desplazarFiguraDeIzquierdaDerecha();
                case 14 -> System.out.println("\t Saliendo del programa de Loading... ");
                default -> System.out.println("\t Opción no válida");
            }
        } while (opcion != 14);
    }

    public void GR5_indicadordeCarga() throws InterruptedException {
        System.out.println(" \n");
        char[] caracter = {'|', '/', '-', '\\'};
        int totalDuracion = 3000;  // Duración total en milisegundos
        int intervalo = totalDuracion / 100;  // Intervalo de actualización en milisegundos

        for (int i = 0; i <= 100; i++) {
            char simbolo = caracter[i % caracter.length];
            System.out.print("\r\t " + simbolo + " " + i + "%");
            Thread.sleep(intervalo);
        }
        System.out.println("\r\t | 100%");
        System.out.println(" ");
    }

    public void GR5_simularCarga(Scanner sc) {
        System.out.println("\n");
        System.out.print("\t Ingrese un caracter: ");
        char loadingChar = sc.next().charAt(0);

        int barra = 20;
        int delay = 100;

        for (int i = 0; i <= 100; i += 5) {
            int filledLength = (i * barra) / 100;
            StringBuilder bar = new StringBuilder("\t [");

            for (int j = 0; j < filledLength; j++) {
                bar.append(loadingChar);
            }
            for (int j = filledLength; j < barra; j++) {
                bar.append(" ");
            }

            bar.append("] ").append(i).append("%");
            System.out.print("\r" + bar);
        
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida!!");
                Thread.currentThread().interrupt(); 
                return;
            }
        }
        System.out.println(" ");
        System.out.println("\t Carga completa! :)");
        System.out.println(" ");
    }

    public void GR5_desplzarIzquierdaDerecha(Scanner sc) {
        System.out.println("\n");
        System.out.print("\t Ingrese un caracter: ");
        char movingChar = sc.next().charAt(0);
        int barra = 20;
        int delay = 50;
    
        StringBuilder bar = new StringBuilder("[                    ]"); 

        int totalSteps = (barra - 1) * 4;
    
        int currentPosition = 0;
        boolean movingRight = true;
    
        for (int step = 0; step <= totalSteps; step++) {
            bar.setCharAt(currentPosition + 1, ' ');

            if (movingRight) {
                currentPosition++;
                if (currentPosition == barra - 1) { 
                    movingRight = false;
                }
            } else {
                currentPosition--;
                if (currentPosition == 0) {
                    movingRight = true;
                }
            }

            bar.setCharAt(currentPosition + 1, movingChar); 
    
            int percentage = (step * 100) / totalSteps;
            System.out.print("\r\t" + bar.toString() + " " + percentage + "%");
    

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida!!.");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.print("\r" + bar.toString() + " 100%\n");
        System.out.println("\t Carga completa! :)");
        System.out.println(" ");
    }
    
    public void GR5_simularWaiting() {
        System.out.println("\n");
        String char1 = "o"; 
        String char2 = "0";
        int delay = 250;
        int totalSteps = 100;
        int currentPosition = 0;
        boolean movingRight = true;
    
        for (int step = 0; step <= totalSteps; step++) {
            StringBuilder display = new StringBuilder("ooo"); 

            if (movingRight) {
                display.setCharAt(currentPosition, char2.charAt(0)); 
                if (currentPosition < 2) {
                    currentPosition++; 
                } else {
                    movingRight = false;
                }
            } else {
                display.setCharAt(currentPosition, char1.charAt(0)); 
                currentPosition--;
                display.setCharAt(currentPosition, char2.charAt(0)); 
                if (currentPosition <= 0) {
                    movingRight = true; 
                }
            }
            System.out.print("\r\t" + display.toString() + " " + step + "%");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida.");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.print("\r\t" + "ooo" + " 100%\n");
        System.out.println("\t Carga completa! :)");
        System.out.println(" ");
    }
    
    public void GR5_barraAvanza(){
        System.out.println("\n");
        char[] barra = new char[20];
        int totalSteps =  100;
        int delay = 100;

        for(int i = 0; i < barra.length; i++){
            barra[i] = ' ';
        }

        for(int step = 0; step <= totalSteps; step++){
            int filledLength = (step * (barra.length - 1)) / 100;

            for(int i = 0; i < filledLength; i++){
                barra[i] = '=';
            }
            if(filledLength < barra.length -  1){
                barra[filledLength] = (step % 2 == 0) ? '>' : '-';
            }

            for(int i = filledLength + 1; i < barra.length; i++){
                barra[i] = ' ';
            }

            System.out.print("\r\t [" + new String(barra) + "] " + step + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t Carga Interrumpida!!");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t [" + new String(barra) + "] 100%\n");
        System.out.println("\t Carga completa! :)");
        System.out.println(" ");
    }
    
    public void GR5_desplzarBarraIzquierdaDerecha() {
        System.out.println("\n");
        String movingChar = "<=>"; 
        int barra = 20;
        int delay = 50;
    
        StringBuilder bar = new StringBuilder("[                    ]"); 
    
        int totalSteps = (barra - movingChar.length()) * 4;
    
        int currentPosition = 0;
        boolean movingRight = true;
    
        for (int step = 0; step <= totalSteps; step++) {
            for (int i = 0; i < movingChar.length(); i++) {
                bar.setCharAt(currentPosition + i + 1, ' '); 
            }
    
            if (movingRight) {
                currentPosition++; 
                if (currentPosition >= barra - movingChar.length()) { 
                    movingRight = false;
                }
            } else {
                currentPosition--; 
                if (currentPosition < 0) {
                    movingRight = true;
                }
            }
    
            for (int i = 0; i < movingChar.length(); i++) {
                if (currentPosition + i + 1 < barra + 1) { 
                    bar.setCharAt(currentPosition + i + 1, movingChar.charAt(i));
                }
            }
    
            int percentage = (step * 100) / totalSteps;
            System.out.print("\r\t" + bar.toString() + " " + percentage + "%");
    
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida!!.");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t [" + bar.toString() + " 100%\n");
        System.out.println("\t Carga completa! :)");
        System.out.println(" ");
    }
    
    public void GR5_cargaConCambiodePunta(){
        System.out.println("\n");
        int width = 20;
        char[][] barra =  new char[1][width];
        char[] punteros = {'|','/','-','\\'};
        int totalPasos = 100;
        int delay = 100;

        Arrays.fill(barra[0], ' ');

        for(int paso = 0; paso <= totalPasos; paso++){
            int llenarBarra = (paso * (width-1))/100;
            
            //llenar la barra
            for(int i = 0; i < llenarBarra; i++ ){
                barra[0][i] = '=';
            }

            //cambio de la punta
            if(llenarBarra < width - 1){
                barra[0][llenarBarra] = punteros[paso % punteros.length];
            }

            //mostrar % y barra
            System.out.print("\r\t\t [");
            for(char c: barra[0]){
                System.out.print(c);
            }
            System.out.print("] " + paso + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t\t Carga interrumpida...");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t\t [");
        for(char c: barra[0]){
            System.out.print(c);
        }
            System.out.print("] 100% \n");
            System.out.println("\t Carga completada... ");
            System.out.println(" ");
    }

    public void GR5_cargaConNombreyApeliido(Scanner sc){
        System.out.println("\n");
        System.out.print("\t  Ingrese sus nombres y apellidos: ");  
        String entrada1 = sc.nextLine();
        

        int longitud = entrada1.length(); 
        char[][] nombreArray = new char[1][longitud];
        char[] nombreChar = entrada1.toCharArray();
        int totalPasos = 100;
        int delay  = 20;

        Arrays.fill(nombreArray[0], ' ');

        for (int paso = 0; paso <= totalPasos; paso++) {
            int mostrarCaracter = (paso * longitud)/100;

            for (int i = 0; i < mostrarCaracter; i++) {
                nombreArray[0][i] = nombreChar[i];
            }

            System.out.print("\r\t\t [");
            for (char c : nombreArray[0]) {
                System.out.print(c);
            }
            System.out.print("] " + paso + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\n\t Carga interrumpida...");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t\t [");
        for (char c : nombreArray[0]) {
            System.out.print(c);
        }
        System.out.print("] 100% \n");
        System.out.println("\t\t Carga completada...");
        System.out.println(" ");
    }

    public void GR5_cargaConNombreCompleto(Scanner sc){
        System.out.println("\n");
        System.out.print("\t  Ingrese su nombre: ");  
        String entrada1 = sc.nextLine();
        

        int longitud = entrada1.length(); 
        char[][] nombreArray = new char[1][longitud];
        char[] nombreChar = entrada1.toCharArray();
        int totalPasos = 100;
        int delay  = 100;

        Arrays.fill(nombreArray[0], ' ');

        for (int paso = 0; paso <= totalPasos; paso++) {
            int mostrarCaracter = (paso * longitud)/100;

            for (int i = 0; i < mostrarCaracter; i++) {
                nombreArray[0][i] = nombreChar[i];
            }

            System.out.print("\r\t\t [");
            for (char c : nombreArray[0]) {
                System.out.print(c);
            }
            System.out.print("] " + paso + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\n\t Carga interrumpida...");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.print("\r\t\t [");
        for (char c : nombreArray[0]) {
            System.out.print(c);
        }
        System.out.print("] 100% \n");
        System.out.println("\t\t Carga completada...");
        System.out.println(" ");
    }

    public void GR5_cargaDeUnArchivo(){
        Random random = new Random();
        int fileSize = 10 + random.nextInt(91);
        System.out.println(" ");
        System.out.println("\t Downloading ArchivoYarl-win_amd64.whl (" + fileSize + " kB)");

        int totalPasos = 100; 
        int delay = 100; 
        char[] barraProgresar = new char[totalPasos]; 
        int barraLlena = 0;

        for (int i = 0; i < barraProgresar.length; i++) {
            barraProgresar[i] = ' ';
        }

        for (int step = 0; step <= totalPasos; step++) {
            barraLlena = (step * fileSize) / totalPasos;

            for (int i = 0; i < barraLlena; i++) {
                barraProgresar[i] = '═'; 
            }

            System.out.print("\r\t " + "\u001B[33m" + "[" + new String(barraProgresar) + "] " + String.format("%.1f", (step * (double)fileSize / totalPasos)) + " / " + fileSize + " kB" + "\u001B[0m");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\n\t Carga interrumpida.");
                return;
            }
        }
        System.out.print("\r\t" + "\u001B[33m" + "[" + new String(barraProgresar) + "] " + fileSize + " / " + fileSize + " kB" + "\u001B[0m\n");
        System.out.println("\t\t Carga completada!");
        System.out.println(" ");
    }
        
    public void GR5_simularLongitudDeSenial(){
        System.out.println(" ");
        Random random = new Random();
        int nivelMaximo = 50;
        // Definición de colores ANSI
        String[] colores = {
            "\u001B[30m", // Negro
            "\u001B[31m", // Rojo
            "\u001B[32m", // Verde
            "\u001B[33m", // Amarillo
            "\u001B[34m", // Azul
            "\u001B[35m", // Magenta
            "\u001B[36m", // Cian
            "\u001B[37m", // Blanco
        };
        String resetColor = "\u001B[0m";


        for (int nivel = 1; nivel <= nivelMaximo; nivel++) {
            int longitud = 2 * (random.nextInt(5) + 1) + 1; 

            int lado = (longitud - 1) / 2;

            // Construye la fila simétrica con el eje central
            StringBuilder fila = new StringBuilder();
            for (int i = 0; i < lado; i++) {
                fila.append("-");
            }
            fila.append("|"); // Eje central
            for (int i = 0; i < lado; i++) {
                fila.append("-");
            }

            // Calcula el espacio para centrar la fila
            int anchoConsola = 50; // Puedes ajustar este valor según el ancho de tu consola
            int espaciosIzquierda = (anchoConsola - fila.length()) / 2;

            // Asegúrate de que no haya espacios negativos
            if (espaciosIzquierda < 0) {
                espaciosIzquierda = 0;
            }

            // Crea los espacios a la izquierda
            String espacios = " ".repeat(espaciosIzquierda);
            //definir el color aleatorio
            String color = colores[random.nextInt(colores.length)];

            // Imprime la fila centrada
            System.out.println(espacios + color + fila.toString() + resetColor +  "\t\t Nivel: " + nivel);

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\t Simulación completada.");
    }

    public void GR5_barraDeSonidoVectorial(){
        System.out.println(" ");
        Random random = new Random();
        int alturaMaxima = 8;
        int numeroColumnas = 10;  // Número de barras de sonido
        char[][] matriz = new char[alturaMaxima][numeroColumnas];
        
        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < alturaMaxima; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Generar altura aleatoria para cada columna y rellenar con "="
        for (int col = 0; col < numeroColumnas; col++) {
            int altura = random.nextInt(alturaMaxima + 1);
            for (int fila = alturaMaxima - 1; fila >= alturaMaxima - altura; fila--) {
                matriz[fila][col] = '=';
            }
        }

        // Imprimir la matriz de abajo hacia arriba para mostrar las barras de sonido
        for (int i = 0; i < alturaMaxima; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("      ");
                System.out.print(matriz[i][j]);
            }
            System.out.println(); 
        }
    }

    public void GR5_desplazarFiguraDeIzquierdaDerecha(){
        System.out.println(" ");
        char[][] figura = {
            {' ',' ',' ','\\','|','|','|', '/'},
            {' ',' ',' ','(','>',' ','<',')',' ', ' '},
            {'o','o','O','-','(','_',')', '-', 'O', 'o','o'}
        };

        int anchoDeDesplazamiento = 60;
        int anchoFigura = figura[0].length;

        // Desplazar la figura hacia la derecha
        for (int posicion = 0; posicion < anchoDeDesplazamiento - anchoFigura; posicion++) {
            // Limpiar la pantalla
            System.out.print(" \033[H\033[2J");
            System.out.flush();

            // Imprimir la figura con el desplazamiento hacia la derecha
            for (char[] linea : figura) {
                for (int i = 0; i < posicion; i++) {
                    System.out.print(" ");  // Espacios a la izquierda para desplazar la figura
                }
                for (char c : linea) {
                    System.out.print(c);
                }
                System.out.println();
            }

            // Espera para dar efecto de movimiento
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejo de la excepción
            }
        }

        // Bucle para desplazar la figura de regreso hacia la izquierda
        for (int posicion = anchoDeDesplazamiento - anchoFigura; posicion > 0; posicion--) {
            // Limpiar la pantalla
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir la figura con el desplazamiento hacia la izquierda
            for (char[] linea : figura) {
                for (int i = 0; i < posicion; i++) {
                    System.out.print(" ");
                }
                for (char c : linea) {
                    System.out.print(c);
                }
                System.out.println();
            }

            // Espera para dar efecto de movimiento
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejo de la excepción
            }
        }
    }
}