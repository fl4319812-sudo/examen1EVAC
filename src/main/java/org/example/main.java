package org.example;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Repo_File Repo = new Repo_File();
        Scanner Sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            menu();

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    case1(Repo);
                    break;

                case "2":
                    case2(Repo, Sc);
                    break;

                case "3":
                    case3(Repo, Sc);
                    break;

                case "4":
                    case4(Sc, Repo);
                    break;

                case "5":
                    case5(Repo, Sc);
                    break;

                case "6":
                    salir = Salir();
                    break;
            }
        }
    }

    private static boolean Salir() {
        boolean salir;
        salir = true;
        return salir;
    }

    private static void case5(Repo_File Repo, Scanner Sc) {
        System.out.print("Eliminar nombre: ");
        Repo.eliminarNombre(Sc.nextLine());
    }

    private static void case4(Scanner Sc, Repo_File Repo) {
        System.out.print("Nombre: ");
        String N = Sc.nextLine();
        System.out.print("Día: ");
        int D = Integer.parseInt(Sc.nextLine());
        System.out.print("Mes: ");
        int M = Integer.parseInt(Sc.nextLine());
        Repo.add_cumple(new Cumple_Agenda(N, D, M));
    }

    private static void case3(Repo_File Repo, Scanner Sc) {
        System.out.print("Nombre: ");
        Cumple_Agenda c = Repo.buscarNombre(Sc.nextLine());
        if (c != null) System.out.println(c.getNombre());
    }

    private static void case2(Repo_File Repo, Scanner Sc) {
        System.out.print("Día: ");
        for (Cumple_Agenda c : Repo.buscarDia(Integer.parseInt(Sc.nextLine()))) {
            System.out.println(c.getNombre());
        }
    }

    private static void case1(Repo_File Repo) {
        for (Cumple_Agenda c : Repo.get_lista()) {
            System.out.println(c.getNombre());
        }
    }

    private static void menu() {
        System.out.println("\n=== AGENDA ===");
        System.out.println("1. Listar");
        System.out.println("2. Buscar por día");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Añadir");
        System.out.println("5. Eliminar");
        System.out.println("6. Salir");
    }
}
