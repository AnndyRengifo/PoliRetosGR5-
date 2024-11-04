package SeriesLoading;

import java.util.*;
import java.util.random.*;

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
        char[] caracter = {'|', '/', '-', '\\'};
        int totalDuracion = 3000;  // Duración total en milisegundos
        int intervalo = totalDuracion / 100;  // Intervalo de actualización en milisegundos

        for (int i = 0; i <= 100; i++) {
            char simbolo = caracter[i % caracter.length];
            System.out.print("\r" + simbolo + " " + i + "%");
            Thread.sleep(intervalo);
        }
        System.out.println("\r| 100%");
    }

    public void GR5_simularCarga(Scanner sc) {
        System.out.print("\t Ingrese un caracter: ");
        char loadingChar = sc.next().charAt(0);

        int barra = 20;
        int delay = 100;

        for (int i = 0; i <= 100; i += 5) {
            int filledLength = (i * barra) / 100;
            StringBuilder bar = new StringBuilder("[");

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

        System.out.println("\nCarga completa! :)");
    }

    public void GR5_desplzarIzquierdaDerecha(Scanner sc) {
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
            System.out.print("\r" + bar.toString() + " " + percentage + "%");
    

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
    }
    
    public void GR5_simularWaiting() {
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
    
            System.out.print("\r" + display.toString() + " " + step + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida.");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.print("\r" + "ooo" + " 100%\n");
        System.out.println("\t Carga completa! :)");
    }
    
    public void GR5_barraAvanza(){
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

            System.out.print("\r[" + new String(barra) + "] " + step + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t Carga Interrumpida!!");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.print("\r[" + new String(barra) + "] 100%\n");
        System.out.println("\t Carga completa! :)");
    }
    
    public void GR5_desplzarBarraIzquierdaDerecha() {
        
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
            System.out.print("\r" + bar.toString() + " " + percentage + "%");
    
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("\t La carga fue interrumpida!!.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.print("\r[" + bar.toString() + " 100%\n");
        System.out.println("\t Carga completa! :)");
    }
    
    public void GR5_cargaConCambiodePunta(){
        System.out.println("\t\t Cargando...");

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

    }

    public void GR5_barraDeSonidoVectorial(){

    }

    public void GR5_desplazarFiguraDeIzquierdaDerecha(){

    }

}
    
            
