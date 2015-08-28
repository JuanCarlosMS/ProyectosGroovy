/**
 * Created by Sintelti on 28/08/2015.
 */
import java.util.Scanner;

public class LectorConsola
{
    Scanner entrada = new Scanner(System.in);
    public String leerEntrada()
    {
        System.out.print("Ingrese el texto: ");
        String texto = entrada.nextLine();
        //System.out.println("" + texto);

        return  texto;
    }
}
