/**
 * Created by Sintelti on 10/07/2015.
 */
class LeerArchivo{

    FileReader fr;

    def caracteresMin = []
    def caracteresMay = []
    int contadorene = 0;

    def texto = """"""

    int caracter


    //constructor
    LeerArchivo(nombre) {

        fr = new FileReader(nombre)
        caracter = fr.read();
        inciar()
        contarLetras(caracter+32)
        texto = texto + (char)caracter
        texto.toLowerCase()
        while( caracter != -1 )
        {
            caracter = fr.read()
            //String letra = "" + caracter

            //println "Caracater:${caracter}"
            if( caracter >= 65 && caracter <= 90 )
            {
                //texto = texto + "ñ"
                contarLetras(caracter + 32)
                println "$caracter"
            } else if( caracter >= 97 && caracter <= 122 ){
                //texto = texto + (char)caracter
                contarLetras(caracter)
            }else if(caracter == 65533){
                contadorene++
            }

        }
        //imprimirTexto()
        imprimrlista()
        imprimirOrdenada()

    }// fin del constructor

    void contarLetras(int caracter)
    {
        def contador = 1;
        caracteresMin[caracter] = caracteresMin[caracter] + contador
    }

    def imprimirTexto = {
        println texto.toLowerCase()
    }

    def inciar = {
        for(int i = 97; i <= 122; i++)
        {
            caracteresMin[i] = 0
        }
    }

    def imprimrlista = {
        for(int i = 97; i <= 122; i++)
        {
            println "Caracter ${(char)i}: ${caracteresMin[i]}"
        }
        println "Caracter ñ: ${contadorene}"
    }

    def imprimirOrdenada = {
        caracteresMin.sort().each {println it}
    }

}

new LeerArchivo("C:/Prueba/encirp2.txt")