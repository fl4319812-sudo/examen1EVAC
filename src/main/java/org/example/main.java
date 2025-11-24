package org.example;

import java.util.Scanner;

public class main {
/** main class @author JoseRodriguez*/
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
                    extracted(Repo, Sc);
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }

    private static void extracted(Repo_File Repo, Scanner Sc) {
        System.out.print(Constantes.eliminar_nombre);
        Repo.eliminarNombre(Sc.nextLine());
        /** elimina los nombres*/
    }

    private static void case4(Scanner Sc, Repo_File Repo) {
        System.out.print(Constantes.introduzca_nombre);
        String N = Sc.nextLine();
        System.out.print(Constantes.introduzca_dia);
        int D = Integer.parseInt(Sc.nextLine());
        System.out.print(Constantes.introduzca_mes);
        int M = Integer.parseInt(Sc.nextLine());
        Repo.add_cumple(new Cumple_Agenda(N, D, M));
        /** registra mes nombre y dia*/
    }

    private static void case3(Repo_File Repo, Scanner Sc) {
        System.out.print(Constantes.introduzca_nombre);
        Cumple_Agenda c = Repo.buscarNombre(Sc.nextLine());
        if (c != null) System.out.println(c.getNombre());
        /** regustra nombre*/
    }

    private static void case2(Repo_File Repo, Scanner Sc) {
        System.out.print(Constantes.introduzca_dia);
        for (Cumple_Agenda c : Repo.buscarDia(Integer.parseInt(Sc.nextLine()))) {
            System.out.println(c.getNombre());
            /** regustra dia*/
        }
    }

    private static void case1(Repo_File Repo) {
        for (Cumple_Agenda c : Repo.get_lista()) {
            System.out.println(c.getNombre());
        }
    }

    private static void menu() {
        System.out.println(Constantes.TITULO_MENU);
        System.out.println(Constantes.op_listar);
        System.out.println(Constantes.op_buscarxD);
        System.out.println(Constantes.op_buscarxN);
        System.out.println(Constantes.op_eliminar);
        System.out.println(Constantes.op_añadir);
        System.out.println(Constantes.op_salir);
        /** imprime el menu*/
    }
}
