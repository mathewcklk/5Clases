
package ec.edu.intsuperior.modelo;

public class Empleado {
   private String nombre;
    private int edad;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

}
