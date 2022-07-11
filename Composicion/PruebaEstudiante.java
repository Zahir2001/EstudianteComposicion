public class PruebaEstudiante
{
    public static void main(String[] args)
    {
        Clase clase1 = new Clase(95.34);
        Clase clase2 = new Clase(56.12);
        Clase clase3 = new Clase(79.89);
        Estudiante estudiante =  new Estudiante("1234", "Jose", clase1, clase2, clase3);

        System.out.println(estudiante); 
    }
}