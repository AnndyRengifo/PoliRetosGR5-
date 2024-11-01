package Menu;
import java.util.Scanner;
import seriesCaracteres.SeriesCaracteres;
import seriesFiguras.SeriesFiguras;
import seriesNumericas.SeriesNumericas;

public class menu {
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("");
            System.out.println("BIENVENIDO A LOS POLIRETOS");
            System.out.println("1. Series numericas");
            System.out.println("2. Serie de caracteres");
            System.out.println("3. Serie de figuras");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        SeriesNumericas series = new SeriesNumericas();
                        series.generarSeries(sc); 
                        break;
                    case 2:
                        SeriesCaracteres seriesCaracteres = new SeriesCaracteres();
                        seriesCaracteres.generarSeries(sc);
                        break;
                    case 3:
                       SeriesFiguras seriesFiguras = new SeriesFiguras();
                       seriesFiguras.generarFiguras(sc);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida, ingrese una opcion valida");
                }
            } else {
                System.out.println("Opcion no valida, ingrese una opcion valida");
                sc.next(); 
            }
        } while (opcion != 4);

        sc.close();
    }
}
