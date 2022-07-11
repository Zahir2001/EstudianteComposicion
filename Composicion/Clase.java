public class Clase
{
    private String codigo;
    private String nombre;
    private Float nota;

    public Clase(String codigo, String nombre, Float nota)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notac = nota;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getCodigo()
    {
        return codigo;
    }

      public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

      public void setNota(Float nota)
    {
        this.nota = nota;
    }

    public Float getNota()
    {
        return nota;
    }
}