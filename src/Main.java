import dao.usuarioDAO;
import model.usuario;
import flow.usuarioFlujos;
import db.databaseConection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        usuarioFlujos flujo = new usuarioFlujos();
        do {
            System.out.println("###################################");
            System.out.println("#                                 #");
            System.out.println("#             Menu                #");
            System.out.println("#       1)Agregar usuario         #");
            System.out.println("#       2)Eliminar usuario        #");
            System.out.println("#       3)Modificar usuario       #");
            System.out.println("#       4)Listar usuarios         #");
            System.out.println("#       5)Salir                   #");
            System.out.println("#                                 #");
            System.out.println("###################################");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    flujo.agregarUsuarioFlujo();
                    break;
                case 2:
                    flujo.eliminarUsuarioFlujo();
                    break;
                case 3:
                    flujo.modificarUsuarioFlujo();
                    break;
                case 4:
                    flujo.listarUsuarioFlujo();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
                    break;
            }
        }while (opcion != 5);
    }
}