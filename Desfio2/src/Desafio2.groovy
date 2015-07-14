/**
 * Created by Sintelti on 14/07/2015.
 */
class Desafio2 implements Solucion
{

    //constructor
    Desafio2(cadena)
    {
        convertir(cadena)
    }//fin del constructor

    //metodo a implementar
    String convertir(String entrada)
    {
        String cadenaResultante = ""
        int incremento = 1
        println "La cadena que entro en el construcotor ${entrada}"
        for(int i = 0; i < entrada.length(); i++)
        {
            //String cadena = entrada.indexOf('o', i)
            String cadena = entrada.substring(i, incremento++)
            //String palabra = cadena.substring(i,decremento--)
            if(cadena == 'o' || cadena == 'O')
            {

                cadenaResultante = cadenaResultante + 'x'
            }else{
                cadenaResultante = cadenaResultante + cadena
            }
        }
        println "Cadena que sale: ${cadenaResultante}"

    }//fin del metodo convertir

}
