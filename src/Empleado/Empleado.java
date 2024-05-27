package Empleado;

public class Empleado
{
    public Empleado(int idEmpleado, String nombre, String telefono) {
        IdEmpleado = idEmpleado;
        Nombre = nombre;
        Telefono = telefono;
    }

    //propiedades
    private int IdEmpleado;
    private String Nombre;
    private String Telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        IdEmpleado = idEmpleado;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

}
