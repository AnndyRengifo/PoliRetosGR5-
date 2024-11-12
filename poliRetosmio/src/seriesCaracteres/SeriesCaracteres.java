package seriesCaracteres;
import java.util.*;

public class SeriesCaracteres {

    public void generarSeries(Scanner sc){
        System.out.print("\t Ingrese el número de series que desea generar: ");
        int n = sc.nextInt();

        System.out.print("S1: ");
        Gr5_s1(n);
        System.out.print("S2: ");
        Gr5_s2(n);
        System.out.print("S3: ");
        Gr5_s3(n);
        System.out.print("S4: ");
        Gr5_s4(n);
        System.out.print("S5: ");
        Gr5_s5(n);
        System.out.print("S6: ");
        Gr5_s6(n);
        System.out.print("S7: ");
        Gr5_s7(n);
        System.out.print("S8: ");
        Gr5_s8(n);
        System.out.print("S9: ");
        Gr5_s9(n);
    }

    public void Gr5_s1(int n){
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.print("+ ");
            }else{
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    public void Gr5_s2(int n){
        for (int i = 0; i < 6; i++) {
            for(int j = 0; j < i * i; j++){
                System.out.print("+");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void Gr5_s3(int n){
        int x = 2;
        for (int i = 0; i < 6; i++) {
            for(int j = 0; j < x; j++){
                System.out.print("+");
            }
            System.out.print(" ");
            x += 2;
        }
        System.out.println();
    }

    public void Gr5_s4(int n){  
        char[] sym =  {'+', '-', '*', '/'};
        for (int i = 0; i < 12; i++) {
            System.out.print(sym[i % sym.length] + " ");
        }
        System.out.println();
    }

    public void Gr5_s5(int n){
        char[] sym = {'\\',  '|', '/', '-', '|', '\\', '|',  '/', '-'};
        for (int i = 0; i < sym.length * 3; i++) {
            System.out.print(sym[i % sym.length] + " ");
        }
        System.out.println();
    }

    public void Gr5_s6(int n){
        for(char ch = 'a'; ch <= 'h'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public void Gr5_s7(int n){
        char ch = 'a';
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(ch);
            }
            System.out.print(" ");
            ch++;
        }
        System.out.println();
    }

    public void Gr5_s8(int n){
        char ch = 'a';
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print(ch);
            }
            System.out.print(" ");
            ch++;
        }
        System.out.println();
    }

    public void Gr5_s9(int n){
        char ch = 'a';
        for (int i = 1; i <= 7; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(ch);
            }
            System.out.print(" ");
            ch++;
        }
        System.out.println();
    }


}
