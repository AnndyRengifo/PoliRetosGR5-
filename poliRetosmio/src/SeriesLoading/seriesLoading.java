package SeriesLoading;

import java.util.*;

public class seriesLoading {

    public void generarLoading(Scanner sc) {
        int opcion;

        do {
            System.out.println("\t |---------------------------------------------------|");
            System.out.println("\t          Bienvenido a las Series Loading!");
            System.out.println("\t |---------------------------------------------------|");
            System.out.println("1. Carga rotacional");
            System.out.println("2. Carga con caracter");
            System.out.println("3. Carga de movimiento");
            System.out.println("4. Carga con o0o");
            System.out.println("5. Carga con cambio > -");
            System.out.println("6. Carga con <=>");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Error, ingrese un número válido.");
                sc.next(); 
            }
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    try {
                        L01();
                    } catch (InterruptedException e) {
                        System.out.println("La animación de carga fue interrumpida.");
                        Thread.currentThread().interrupt();
                    }
                }
                case 2 -> L02(sc);
                case 3 -> L03(sc);
                case 4 -> L04();
                case 5 -> L05();
                case 6 -> L06();
                case 7 -> System.out.println("Saliendo del programa Arrays");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 7);
    }

    public void L01() throws InterruptedException {
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


    public void L02(Scanner sc) {
        System.out.print("Ingrese un caracter: ");
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
                System.out.println("La carga fue interrumpida!!");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.println("\nCarga completa! :)");
    }

    public void L03(Scanner sc) {
        System.out.print("Ingrese un caracter: ");
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
                System.out.println("La carga fue interrumpida!!.");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.print("\r" + bar.toString() + " 100%\n");
        System.out.println("Carga completa! :)");
    }
    
    public void L04() {
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
                System.out.println("La carga fue interrumpida.");
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        System.out.print("\r" + "ooo" + " 100%\n");
        System.out.println("Carga completa! :)");
    }
    
    public void L05(){
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
                System.out.println("Carga Interrumpida!!");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.print("\r[" + new String(barra) + "] 100%\n");
        System.out.println("Carga completa! :)");
    }
    
    public void L06() {
        
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
                System.out.println("La carga fue interrumpida!!.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.print("\r[" + bar.toString() + " 100%\n");
        System.out.println("Carga completa! :)");
    }
    
    

}
    
            
