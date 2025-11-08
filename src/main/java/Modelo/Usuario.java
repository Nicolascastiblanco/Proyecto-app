package modelo;

public class Usuario {
    // Atributos
    private String nombre;
    private String contraseña;

    // Constructor vacío (por si lo necesitas)
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    // Getters y Setters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método opcional para mostrar información del usuario
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
