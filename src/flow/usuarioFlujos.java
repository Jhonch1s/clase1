package flow;

import dao.usuarioDAO;
import model.usuario;

import java.util.Scanner;

public class usuarioFlujos {
    public void agregarUsuarioFlujo(){
        String nombre = "";
        String email = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el email del usuario: ");
        email= sc.nextLine();

        usuario usr = new usuario(nombre, email);
        usuarioDAO dao = new usuarioDAO();
        dao.agregarUsuario(usr);
    }
    public void modificarUsuarioFlujo(){
        int id = 0;
        String nombre = "";
        String email = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del usuario a modificar: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nuevo nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el nuevo email del usuario: ");
        email= sc.nextLine();

        usuarioDAO dao = new usuarioDAO();
        dao.modificarUsuario(id, nombre, email);
    }
    public void eliminarUsuarioFlujo(){
        int id = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del suario eliminar: ");
        id = sc.nextInt();

        usuarioDAO dao = new usuarioDAO();
        dao.eliminarUsuario(id);
    }
    public void listarUsuarioFlujo(){
        usuarioDAO dao = new usuarioDAO();
        dao.listarUsuarios();
    }
}
