package ejecutarprestamo;

import java.util.Scanner;

public class EjecutarPrestamo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        Prestamo[] prestamos = new Prestamo[50];
        int contador = 0;
        int opc;

        do {
            System.out.println("------- MENU DE PRESTAMOS -------");
            System.out.println("1. Ingresar prestamo de automovil");
            System.out.println("2. Ingresar prestamo educativo");
            System.out.println("3. Mostrar todos los prestamos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opc = tcl.nextInt();
            tcl.nextLine(); 

            switch (opc) {
                case 1:
                    System.out.println("--- PRESTAMO DE AUTOMOVIL ---");
                    Persona beneficiarioA = leerPersona(tcl, "Beneficiario");
                    Persona garante = leerPersona(tcl, "Garante");

                    System.out.print("Ciudad del prestamo: ");
                    String ciudadA = tcl.nextLine();

                    System.out.print("Tiempo del prestamo (meses): ");
                    int tiempoA = tcl.nextInt();
                    tcl.nextLine();

                    System.out.print("Tipo de automovil: ");
                    String tipoAuto = tcl.nextLine();

                    System.out.print("Marca de automovil: ");
                    String marcaAuto = tcl.nextLine();

                    System.out.print("Valor del automovil: ");
                    double valorAuto = tcl.nextDouble();
                    tcl.nextLine();

                    PrestamosAutomovil pa = new PrestamosAutomovil(beneficiarioA, tiempoA, ciudadA, tipoAuto, marcaAuto, garante, valorAuto);
                    prestamos[contador] = pa;
                    contador++;
                    break;

                case 2:
                    System.out.println("--- PRESTAMO EDUCATIVO ---");
                    Persona beneficiarioE = leerPersona(tcl, "Beneficiario");

                    System.out.print("Ciudad del prestamo: ");
                    String ciudadE = tcl.nextLine();

                    System.out.print("Tiempo del prestamo (meses): ");
                    int tiempoE = tcl.nextInt();
                    tcl.nextLine();

                    System.out.print("Nivel de estudio: ");
                    String nivel = tcl.nextLine();

                    System.out.print("Nombre de la institucion educativa: ");
                    String nombreInst = tcl.nextLine();

                    System.out.print("Siglas de la institucion: ");
                    String siglas = tcl.nextLine();

                    InstituciónEducativa institucion = new InstituciónEducativa(nombreInst, siglas);

                    System.out.print("Valor de la carrera: ");
                    double valorCarrera = tcl.nextDouble();
                    tcl.nextLine();

                    PrestamoEducativo pe = new PrestamoEducativo(beneficiarioE, tiempoE, ciudadE, nivel, institucion, valorCarrera);
                    prestamos[contador] = pe;
                    contador++;
                    break;

                case 3:
                    System.out.println("--- LISTA DE PRESTAMOS ---");
                    int i = 0;
                    while (i < contador) {
                        System.out.println(prestamos[i].toString());
                        System.out.println("---------------------------");
                        i++;
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

        } while (opc != 0);
    }

    public static Persona leerPersona(Scanner tcl, String tipo) {
        System.out.println("Datos de " + tipo);
        System.out.print("Nombre: ");
        String nombre = tcl.nextLine();
        System.out.print("Apellido: ");
        String apellido = tcl.nextLine();
        System.out.print("Username: ");
        String user = tcl.nextLine();
        return new Persona(nombre, apellido, user);
    }
}
