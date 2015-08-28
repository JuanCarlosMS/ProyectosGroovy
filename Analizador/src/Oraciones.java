/**
 * Created by Sintelti on 28/08/2015.
 */
public class Oraciones implements Analizable
{
    private String oracion;
    public Oraciones()
    {
        //oracion = entrada;
    }

    @Override
    public int contarPalabras() {
        return 0;
    }

    @Override
    public String[] separarPalabras(String texto)
    {
        String[] arregloPalabras = texto.split(" ");

        return arregloPalabras;
    }

    @Override
    public String[] separarOraciones(String texto) {
        return new String[0];
    }

    public String obtenerOracion()
    {
        return oracion;
    }
}
