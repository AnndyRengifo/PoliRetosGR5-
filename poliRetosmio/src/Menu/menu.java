package Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import seriesCaracteres.SeriesCaracteres;
import seriesFiguras.SeriesFiguras;
import seriesNumericas.SeriesNumericas;

public class menu {

    public void mostrarIntegrantes(){
        List<String> integrantes = new ArrayList<>();
        integrantes.add("Andy Rengifo");
        integrantes.add("Joel Velez");
        integrantes.add("los demas...");  

        String nombreGrupo = " Grupo Nro. 5";
        int width = 40;  

        System.out.println("\t\t╔" + "═".repeat(width - 2) + "╗");
        System.out.println("\t\t║" + " ".repeat(width - 2) + "║");

        int paddingNombre = (width - nombreGrupo.length() - 2) / 2;
        System.out.printf("\t\t║%" + paddingNombre + "s%s%" + (width - nombreGrupo.length() - paddingNombre - 2) + "s║\n", "", nombreGrupo, "");

        System.out.println("\t\t║" + " ".repeat(width - 2) + "║");

        for (String integrante : integrantes) {
            if (integrante.length() > width - 2) {
                System.out.printf("\t\t║ %s ║\n", integrante); 
            } else {
                int paddingIntegrante = (width - integrante.length() - 2) / 2;
                System.out.printf("\t\t║%" + paddingIntegrante + "s%s%" + (width - integrante.length() - paddingIntegrante - 2) + "s║\n", "", integrante, "");
            }
            System.out.println("\t\t║" + " ".repeat(width - 2) + "║");
        }
        System.out.println("\t\t╚" + "═".repeat(width - 2) + "╝");   
    }

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
