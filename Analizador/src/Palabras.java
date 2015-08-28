/**
 * Created by Sintelti on 28/08/2015.
 */
public class Palabras implements Analizable
{
    private String texto;

    public Palabras(String entrada)
    {
        int contador = 0;

        for (int i = 0; i< 10; i++)
        {
            contador += contarPalabras();
            System.out.println(contador);
        }
        
    }

    public int contarPalabras()
    {

        return 1;
    }

    public String[] separarPalabras(String texto)
    {
        String[] arreglo = texto.split(" ");

        return arreglo;
    }

    @Override//separa las oraciones de un parrafo
    public String[] separarOraciones(String texto)
    {
        return new String[0];
    }

    public String obtenerTexto()
    {
        return texto;
    }
}
