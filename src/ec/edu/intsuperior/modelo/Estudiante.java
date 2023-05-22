
package ec.edu.intsuperior.modelo;


public class Estudiante {
    private String nombre;
    private int edad;
    private String universidad;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String universidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }


}
