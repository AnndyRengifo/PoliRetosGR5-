package seriesFiguras;
import java.util.*;

public class SeriesFiguras {
    public void generarFiguras(Scanner sc){
        
        System.out.print("\t Ingrese el tamanio de la figura: ");
        int n = sc.nextInt();

        System.out.println(" F1: ");
        Gr5_f1(n);
        System.out.println(" F2: ");
        Gr5_f2(n);
        System.out.println(" F3: ");
        Gr5_f3(n);
        System.out.println(" F4: ");
        Gr5_f4(n);
        System.out.println(" F5: ");
        Gr5_f5(n);
        System.out.println(" F6: ");
        Gr5_f6(n);
        System.out.println(" F7: ");
        Gr5_f7(n);
        System.out.println(" F8: ");
        Gr5_f8(n);
        System.out.println(" F9: ");
        Gr5_f9(n);
        System.out.println(" F10: ");
        Gr5_f10(n);
        System.out.println(" F11: ");
        Gr5_f11(n);
        System.out.println(" F12: ");
        Gr5_f12(n);
        System.out.println(" F13: ");
        Gr5_f13(n);
        System.out.println(" F14: ");
        Gr5_14(n);
        System.out.println(" F15: ");
        Gr5_f15(n);
        System.out.println(" F16: ");
        Gr5_16(n);
        System.out.println(" F17: ");
        Gr5_17(n);
        System.out.println(" F18: ");
        Gr18_f18(n);
        System.out.println(" F19: ");
        Gr5_f19(n);
        

    }

    public void Gr5_f1(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void Gr5_f2(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print((i + j) % 2 == 0 ? "* " : "+ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void Gr5_f3(int n){
        for (int i = 0; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Gr5_f4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    public void Gr5_f5(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (n - i) * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Gr5_f6(int n){
        for (int i = 0; i < n; i++) {
            for(int j = n - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i * 2) + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Gr5_f7(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i * 4; j++){
                System.out.print(" ");
            }
            System.out.println("|__");
        }
    }

    public void Gr5_f8(int n){
        for (int i = 0; i < n; i++) {
            for(int j = n - i - 1; j > 0; j--){
                System.out.print("    ");
            }
            System.out.println("__|");
        }
    }

    public void Gr5_f9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1) * 4; j++) {
                System.out.print(" ");
            }
            System.out.print("___|");
            
             for (int k = 0; k < i * 8; k++) {
                 System.out.print(" ");
            }

            System.out.println("|___");
        }
    }

    public void Gr5_f10(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i * 4; j++){
                System.out.print(" ");
            }
            if(i % 2 == 0){
                System.out.println("|_+_");
            }else{
                System.out.println("|_-_");
            }
        }
    }

    public void Gr5_f11(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i * 4; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            for(int j = 0; j < i; j++){
                System.out.print("_");
            }
            System.out.println();
        }
    }

    public void Gr5_f12(int n) {
        System.out.println("...");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); 
        }
    }

    public void Gr5_f13(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("...");
    }

    public void Gr5_14(int n) {
        int[][] triangulo = new int[n][n];

        for (int i = 0; i < n; i++) {
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", triangulo[i][j]);
            }
            System.out.println();
        }
    }

    public void Gr5_f15(int n){ 
        int[][] triangulo = new int[n][n];
        for(int i = 0; i < n; i++){
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for(int j = 1; j < i; j++){
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.println("   ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("%4d", triangulo[i][j]);
            }
            System.out.println();
        }
    }

    public void Gr5_16(int n) {
        for (int i = 0; i < n; i++) {
            // Imprimir espacios en blanco antes del primer símbolo
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("    "); // Espacios en blanco
            }
    
            // Determinar el símbolo a imprimir en las diagonales
            String sym1 = (i % 2 == 0) ? "+" : "-"; // Primer símbolo
            System.out.print(sym1); // Imprimir el primer símbolo
    
            // Imprimir espacios entre los símbolos
            if (i != n - 1) { // Evitar imprimir el segundo símbolo en la última fila
                for (int j = 0; j < (i * 2); j++) {
                    System.out.print("    "); // Espacios en blanco
                }
                String sym2 = (i % 2 == 0) ? "+" : "-"; // Segundo símbolo
                System.out.print(sym2);
            }
    
            // Nueva línea al final de cada fila
            System.out.println();
        }
    }
    
    
    public void Gr5_17(int n) {
        for (int i = 0; i < n; i++) {
            // Imprimir espacios en blanco antes del primer número
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("    "); // Espacios en blanco
            }
    
            // Determinar el número a imprimir en las diagonales
            int num1 = (i % 2 == 0) ? 1 : 0; // Primer número
            System.out.print(num1); // Imprimir el primer número
    
            // Imprimir espacios entre los números
            if (i != n - 1) { // Evitar imprimir el segundo número en la última fila
                for (int j = 0; j < (i * 2); j++) {
                    System.out.print("    "); // Espacios en blanco
                }
                int num2 = (i % 2 == 0) ? 1 : 0; // Segundo número
                System.out.print(num2);
            }
    
            // Nueva línea al final de cada fila
            System.out.println();
        }
    }
    
    public void Gr18_f18(int n){
        int[][] triangulo = new int[n][n];
        for(int i = 0; i < n; i++){
            triangulo[i][0] = 1;
            triangulo[i][i] = 2;
            for(int j = 1; j < i; j++){
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.println("   ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("%4d", triangulo[i][j]);
            }
            System.out.println();
        }
    }

    public void Gr5_f19(int n) {
        int[][] valores = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    valores[i][0] = 1; 
                    break;
                case 1:
                    valores[i][0] = 1; 
                    valores[i][1] = 2; 
                    break;
                default:
                    valores[i][0] = i + 1; 
                    for (int j = 1; j < i; j++) {
                        valores[i][j] = valores[i - 1][j - 1] + valores[i - 1][j]; 
                    }
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(""); 
            }
            if (i > 0) {
                System.out.print("+"); 
            }
    
            for (int j = 0; j <= i; j++) {
                if (j < i) {
                    if(i == 0){
                        System.out.print("*");
                    }else{
                        System.out.print("  " + valores[i][j]); 
                    }
                } else {
                    System.out.print("   *"); 
                }
            } 
            System.out.println(); 
        }
    }
    

}