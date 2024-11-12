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
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                if(i==0 && j==0){
                    System.out.print("_");
                } else if(i==j){
                    System.out.print("|_");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void Gr5_f8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            if (i == 0) {
                System.out.println("_");
            } else {
                System.out.println("_|");
            }
        }
    }

    public void Gr5_f9(int n) {
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                if(i==n-j){
                    System.out.print("_|");
                } else System.out.print("  ");
            }

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }

            System.out.println("_");
        }
    }

    public void Gr5_f10(int n){
        String figura1 = "|_+_";
        String figura2 = "|_-_";
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("    ");
            }
            if(i%2==0){
                System.out.println(figura1);
            }else{
                System.out.println(figura2);
            }
        }
    }

    public void Gr5_f11(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("|" + " _".repeat(i));
            for (int j = 0; j <= i; j++) {
                System.out.print((j==0)?"   ".repeat(j):"  ".repeat(j));
            }
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
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public void Gr5_16(int n) {
        int espacios = 0;
        int anchoLinea = (n + 1) * 2;
 
        for (int i = 1; i <= n * 2 + 1; i++) {
            StringBuilder linea = new StringBuilder();
 
            for (int j = 1; j <= anchoLinea; j++) {
                if (i != n + 1) {
                   if (j == 1 + espacios || j == anchoLinea - espacios) {
                       linea.append((n % 2 == 0) ? ((i % 2 == 0) ? "+ " : "- ") :
                               ((i % 2 != 0) ? "+ " : "- "));
                   } else {
                       linea.append(" ");
                   }
                } else {
                   linea.append((j == espacios) ? "  + " : " ");
                }
            }
 
            System.out.println(linea);
 
            if (i <= n) {
                espacios++;
            } else {
                espacios--;
            }
        }
    }
    
    public void Gr5_17(int n) {
        int espacios = 0;
        for (int i = 1; i <= n*2+1; i++) {
            for (int j = 1; j <= ((n + 1) * 2); j++) {
                System.out.print((i!=n+1)?(((j == 1 + espacios || j == ((n +1) * 2) - espacios))
                        ? (((n % 2 == 0) ? ((i % 2 == 0) ? 0+" " : 1+" ") : ((i % 2 != 0) ? 0+" " : 1+" ")))
                        : "      "): (j==espacios)? "       "+1:"      ");
            }
            if(i<=n){
                espacios++;
            }else{
                espacios--;
            }
            System.out.println();
        }
    }
    
    public void Gr18_f18(int n){
        int [][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                matriz[i][j]=2;
                else if(j==0)
                matriz[i][j]=1;
            }
         }
         for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if(i>j)
                matriz[i][j]=matriz[i-1][j]+matriz[i-1][j-1];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if((j==0)&&(i!=0))
                System.out.print("1 ");
                if((i>j)&&(j!=0))
                System.out.print(matriz[i][j]+" ");
                if(i==j)
                System.out.print("2 ");
            }
            System.out.println();
         }
    }

    public void Gr5_f19(int n) {
        int [][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                matriz[i][j]=2;
                else if(j==0)
                matriz[i][j]=1;
            }
         }
         for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if(i>j)
                matriz[i][j]=matriz[i-1][j]+matriz[i-1][j-1];
            }
         }
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if((j==0)&&(i!=0))
                System.out.print("+ ");
                if((i>j)&&(j!=0))
                System.out.print(matriz[i][j]+" ");
                if(i==j)
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
