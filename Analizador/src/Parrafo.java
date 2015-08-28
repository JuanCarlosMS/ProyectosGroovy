import java.util.ArrayList;

/**
 * Created by Sintelti on 28/08/2015.
 */
public class Parrafo implements Analizable
{
    private String texto;
    private String contadorPalabras;

    public Parrafo(String entrada)
    {
        ArrayList<Oraciones> oraciones = new ArrayList<Oraciones>();
        Oraciones oracion = new Oraciones();
        texto = entrada;
        String[] arregloOraciones = separarOraciones(texto);

        for (int i = 0; i < arregloOraciones.length; i++)
        {

        }

        System.out.printf("%s", texto);


    }

    @Override
    public int contarPalabras() {
        return 1;
    }

    @Override
    public String[] separarPalabras(String texto) {
        return new String[0];
    }

    @Override
    public String[] separarOraciones(String texto)
    {
        String[] oraciones = texto.split("\n");
        return oraciones;
    }

    // devuelve elt exto
    public String obtenerTexto()
    {
        return texto;
    }
    public String obtenerContadorPalabras()
    {
        return contadorPalabras;
    }
}
