package model;

public class usuario {
    private String nUsuario;
    private String eUsuario;

    public usuario(String n, String e) {
        this.nUsuario = n;
        this.eUsuario = e;
    }

    public String getNombre() {
        return nUsuario;
    }
    public String getEmail() {
        return eUsuario;
    }
}
