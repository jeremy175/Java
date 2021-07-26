package domain;

public class Persona {
    private int idClientes; 
    private String nombre;
    private String desayunos;
    private String almuerzos;
    private String cenas;

    public Persona() {
    }

    public Persona(int idClientes) {
        this.idClientes = idClientes;
    }

    public Persona(String nombre, String desayunos, String almuerzos, String cenas) {
        this.nombre = nombre;
        this.desayunos = desayunos;
        this.almuerzos = almuerzos;
        this.cenas = cenas;
    }

    public Persona(int idClientes, String nombre, String desayunos, String almuerzos, String cenas) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.desayunos = desayunos;
        this.almuerzos = almuerzos;
        this.cenas = cenas;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesayunos() {
        return desayunos;
    }

    public void setDesayunos(String desayunos) {
        this.desayunos = desayunos;
    }

    public String getAlmuerzos() {
        return almuerzos;
    }

    public void setAlmuerzos(String almuerzos) {
        this.almuerzos = almuerzos;
    }

    public String getCenas() {
        return cenas;
    }

    public void setCenas(String cenas) {    
        this.cenas = cenas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idClientes=" + idClientes + ", nombre=" + nombre + ", desayunos=" + desayunos + ", almuerzos=" + almuerzos + ", cenas=" + cenas + '}';
    }
    
}
