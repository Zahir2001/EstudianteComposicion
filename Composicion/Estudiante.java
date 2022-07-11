public class Estudiante
{
    private String cuenta;
    private String nombre;
    private Clase clase1;
    private Clase clase2;
    private Clase clase3;

    public Estudiante(String cuenta, String nombre, Clase clase1, Clase clase2, Clase clase3)
    {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.clase1 = clase1;
        this.clase2 = clase2;
        this.clase3 = clase3;
    }

    public String toString()
    {
        return String.format("Cuenta: %s Nombre: %s Clase1: %s Clase2: %s Clase3: %s ", cuenta, nombre, clase1, clase2, clase3);
    }
}