package Menu;
import java.util.Scanner;

import GrafosyAutomatas.grafosYautomatas;
import SeriesRecursion.seriesRecursion;
import seriesCaracteres.SeriesCaracteres;
import seriesFiguras.SeriesFiguras;
import seriesNumericas.SeriesNumericas;
import cadenaCaracteres.CadenaDeCaracteres;


public class menu {

    public void mostrarIntegrantes(){
        System.out.println();
        System.out.println("\t\t |---------------------------------------------------|"); 
        System.out.println("\t\t |                     GRUPO N° 5                    |"); 
        System.out.println("\t\t |---------------------------------------------------|"); 
        System.out.println("\t\t |                   RENGIFO ANNDY                   |"); 
        System.out.println("\t\t |                   SANCHEZ ANDY                    |"); 
        System.out.println("\t\t |                   VALLEJO ALEXIS                  |"); 
        System.out.println("\t\t |                   VELEZ JOEL                      |"); 
        System.out.println("\t\t |---------------------------------------------------|"); 
        System.out.println(" ");
    }
    
    
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("");
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t              BIENVENIDO A LOS POLIRETOS"              );
            System.out.println("\t |---------------------------------------------------|"); 
            System.out.println("\t  1. Series numericas");
            System.out.println("\t  2. Serie de caracteres");
            System.out.println("\t  3. Serie de figuras");
            System.out.println("\t  4. Cadena de Caracteres");
            System.out.println("\t  5. Arrays");
            System.out.println("\t  6. Loading");
            System.out.println("\t  7. Recursion");
            System.out.println("\t  8. Grafos y Automatas");
            System.out.println("\t  9. Salir");
            System.out.print("\t Seleccione una opcion: ");
            
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
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
                        CadenaDeCaracteres cadena = new CadenaDeCaracteres();
                        cadena.generarCaracteres(sc);
                        break;
                    case 5:
                        break;
                    case 6:

                        break;
                    case 7:
                        seriesRecursion  recursion = new seriesRecursion();
                        recursion.generarRecursion(sc);
                        break;

                    case 8:
                        grafosYautomatas grafosAutomata = new grafosYautomatas();
                        grafosAutomata.GR5_generarGrafosyAutomatas(sc);
                        break;

                    case 9:
                        System.out.println("\n\t Saliendo del programa");
                        break;
                    default:
                        System.out.println("\t Opcion no valida, ingrese una opcion valida");
                }
            } else {
                System.out.println("\t Opcion no valida, ingrese una opcion valida");
                sc.next(); 
            }
            System.out.println("\n");
        } while (opcion != 9);

        sc.close();
    }
}
