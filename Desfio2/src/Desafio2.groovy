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
        String cadenaFinal = ""
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
            }else if(cadena == ' '){
                //println "Hay esapcios"
                cadenaResultante = cadenaResultante + cadena
                cadenaFinal = agregarX(cadenaResultante)

            }else{
                cadenaResultante = cadenaResultante + cadena
                cadenaFinal = agregarX(cadenaResultante)
            }
        }
        println "Cadena que sale: ${cadenaFinal}"

    }//fin del metodo convertir

    //agrega x dependiendo de las ocurrencias en la palabra
    String agregarX(String entrada)
    {
        int contadorX = 0
        int incrementos = 1;
        String cadena
        String cadenaResultante = ""
        //println "Lo que entro: ${entrada}"

        for(int i = 0; i < entrada.length(); i++)
        {
            cadena = entrada.substring(i,incrementos++)
            if(cadena == 'x' || cadena == 'X')
            {
                contadorX++
                cadenaResultante = cadenaResultante + ponerX.call(contadorX)
            }
            cadenaResultante = cadenaResultante + cadena
            //println "${cadena}"
        }
        //cadenaResultante = cadenaResultante + ponerX.call(contadorX)

        //println "La cadena ${entrada} tiene ${contadorX} x"
        //println "La cadena final:${cadenaResultante}"
        return cadenaResultante
    }//fin del metodo agregarX

    //closures para poner x
    def ponerX = { contador ->
        String cadena = ""

        for (int i = 0; i < contador - 1; i++)
        {
            cadena = cadena + 'x'
        }

        return cadena;

    }//fin del closure

}
