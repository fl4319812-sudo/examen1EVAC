package org.example;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Repo_File Repo = new Repo_File();
        Scanner Sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println(Constantes.TITULO_MENU);
            System.out.println(Constantes.op_listar);
            System.out.println(Constantes.op_buscarxD);
            System.out.println(Constantes.op_buscarxN);
            System.out.println(Constantes.op_eliminar);
            System.out.println(Constantes.op_añadir);
            System.out.println(Constantes.op_salir);

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    for (Cumple_Agenda c : Repo.get_lista()) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "2":
                    System.out.print("Día: ");
                    for (Cumple_Agenda c : Repo.buscarDia(Integer.parseInt(Sc.nextLine()))) {
                        System.out.println(c.getNombre());
                    }
                    break;

                case "3":
                    System.out.print("Nombre: ");
                    Cumple_Agenda c = Repo.buscarNombre(Sc.nextLine());
                    if (c != null) System.out.println(c.getNombre());
                    break;

                case "4":
                    System.out.print("Nombre: ");
                    String N = Sc.nextLine();
                    System.out.print("Día: ");
                    int D = Integer.parseInt(Sc.nextLine());
                    System.out.print("Mes: ");
                    int M = Integer.parseInt(Sc.nextLine());
                    Repo.add_cumple(new Cumple_Agenda(N, D, M));
                    break;

                case "5":
                    System.out.print("Eliminar nombre: ");
                    Repo.eliminarNombre(Sc.nextLine());
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }
}
