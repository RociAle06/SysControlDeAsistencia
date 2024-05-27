package Empleado;

public class Cargo
{
    public Cargo(int IdCargo, String Nombre, Double Salario){
        this.IdCargo = IdCargo;
        this.Nombre = Nombre;
        this.Salario = Salario;

    }
    //Propiedades
    private int IdCargo;
    private String Nombre;
    private Double Salario;

    public int getIdCargo()
    {
        return IdCargo;
    }
    public void setIdCargo(int IdCargo)
    {
        IdCargo = IdCargo;
    }
    public String  getNombre()
    {
        return Nombre;
    }
    public void setNombre(String Nombre)
    {
        Nombre = Nombre;
    }
    public Double getSalario()
    {
        return Salario;
    }
    public void setSalario(Double Salario)
    {
        Salario = Salario;
    }
}
