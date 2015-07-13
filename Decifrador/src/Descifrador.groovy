/**
 * Created by Sintelti on 10/07/2015.
 */
class LeerArchivo{

    FileReader fr;

    def caracteresMin = []

    int contadorene = 0;

    def texto = """"""
    def textoTraducido = """"""

    int caracter

    String cadenaEjemplo = "Ynkxquip"
    def mapaAbecedario = ['a':'u', 'b':'v', 'c':'w', 'd':'x', 'e':'y', 'f':'z', 'g':'a', 'h':'b','i':'c', 'j':'d', 'k':'e', 'l':'f',
                          'm':'g', 'n':'h', '65533':'i', 'o':'j','p':'k', 'q':'l', 'r':'m', 's':'n', 't':'ñ', 'u':'o', 'v':'p', 'w':'q',
                          'x':'r', 'y':'s', 'z':'t']


    //constructor
    LeerArchivo(nombre) {

        fr = new FileReader(nombre)
        caracter = fr.read();
        iniciar()
        contarLetras(caracter+32)
        texto = texto + (char)caracter
        textoTraducido = textoTraducido + (char)caracter
        texto.toLowerCase()

        //recorre caracter por caracter del texto hasta su final
        while( caracter != -1 )
        {
            caracter = fr.read()
            //String letra = "" + caracter

            //println "Caracater:${caracter}"
            //para las minusculas
            if( caracter >= 65 && caracter <= 90 )
            {
                contarLetras(caracter + 32)
                textoTraducido = textoTraducido + (char)caracter

            } else if( caracter >= 97 && caracter <= 122 ){//para las mayusculas

                contarLetras(caracter)
                textoTraducido = textoTraducido + (char)caracter

            }else if(caracter == 65533){//para la ñ
                contadorene++

                textoTraducido = textoTraducido + (char)caracter
                //almacena el texto traducido
            }else{//para el resto del texot
                //almacena el texto traducido
                textoTraducido = textoTraducido + (char)caracter
            }

        }//fin del while

        //imprimirTextoTraducido(textoTraducido)
        //prueba()
        //def llave = ""+cadenaEjemplo.charAt(1)
        //println mapaAbecedario.containsKey(llave)
        traducirTexto(textoTraducido)


    }// fin del constructor


    //cambiar la letra del texto por la que esta contenida en la list mapaAbecedario
    void traducirTexto(String frase)
    {
        def fraseT = []
        for (int i = 0; i < frase.length(); i++)
        {
            def llave = ""+frase.charAt(i)
            if(mapaAbecedario.containsKey(llave.toLowerCase()))
            {
                //fraseT[i] = fraseT[i] + mapaAbecedario.get(llave)
                fraseT.add(mapaAbecedario.get(llave.toLowerCase()))
            }else{
                fraseT.add(frase.charAt(i))
            }
            //println frase.charAt(i)
        }
        //imprimer el arreglo
        for (int i = 0; i < fraseT.size(); i ++)
        {
            print fraseT[i]
        }
    }// fin de traducirTexto


    //incializa el arreclo caracteresMin en ''
    void iniciar()
    {
        for (int i = 97; i <= 122; i++ )
        {
            caracteresMin[i] = ''
        }
    }// fin de inciar

    //cuenta el total de letras del abecedario que hay en el texto
    void contarLetras(int caracter)
    {
        def contador = 1;
        caracteresMin[caracter] = caracteresMin[caracter] + contador
    }//fin de contarLetras


    //closure que imprime los elementos contenidos en el arreglo caracterMin
    def imprimrlista = {
        for(int i = 97; i <= 122; i++)
        {
            println "Caracter ${(char)i}: ${caracteresMin[i]}"
        }
        println "Caracter ñ: ${contadorene}"
    }//fin de imprimir lista

    //imprime el arreglo ordenado de menor a mayo
    def imprimirOrdenada = {
        caracteresMin.sort().each {println it}
    }//fin de closure imprimirOrdenada


}//fin de la clase


new LeerArchivo("C:/Users/JC/Documents/Codigo.txt")