/**
 * Created by Sintelti on 10/07/2015.
 */
class LeerArchivo{

    FileReader fr;

    def caracteresMin = []
    def caracteresMay = []
    int contadorene = 0;

    def texto = """"""
    def textoTraducido = """"""

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
                contarLetras(caracter + 32)
                textoTraducido = textoTraducido + (char)caracter

            } else if( caracter >= 97 && caracter <= 122 ){

                contarLetras(caracter)
                textoTraducido = textoTraducido + (char)caracter

            }else if(caracter == 65533){
                contadorene++

                textoTraducido = textoTraducido + (char)caracter
                //almacena el texto traducido
            }else{
                //almacena el texto traducido
                textoTraducido = textoTraducido + (char)caracter
            }

        }

        imprimirTextoTraducido(textoTraducido)
        //prueba()

    }// fin del constructor



    void contarLetras(int caracter)
    {
        def contador = 1;
        caracteresMin[caracter] = caracteresMin[caracter] + contador
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

    void imprimirTextoTraducido(String textoEntrada)
    {
        def arreglo = []
        for (int i = 0; i < textoEntrada.length(); i++)
        {
            arreglo.add(textoEntrada.charAt(i))
        }

        for (int i = 0; i < arreglo.size(); i ++)
        {
            arreglo[i] = traducirCaracter(arreglo[i])
        }

        //imprime

        for (int i = 0; i < arreglo.size(); i ++)
        {
            print arreglo[i]
        }

    }

    String traducirCaracter(Character letra)
    {
        String letraCambiada
        switch (letra)
        {
            case 'a':
            case 'A':
                letraCambiada = 'u'
                break;
            case 'b':
            case 'B':
                letraCambiada = 'v'
                break;
            case 'c':
            case 'C':
                letraCambiada = 'w'
                break;
            case 'd':
            case 'D':
                letraCambiada = 'x'
                break;
            case 'e':
            case 'E':
                letraCambiada = 'y'
                break;
            case 'f':
            case 'F':
                letraCambiada = 'z'
                break;
            case 'g':
            case 'G':
                letraCambiada = 'a'
                break;
            case 'h':
            case 'H':
                letraCambiada = 'b'
                break;
            case 'i':
            case 'I':
                letraCambiada = 'c'
                break;
            case 'j':
            case 'J':
                letraCambiada = 'd'
                break;
            case 'k':
            case 'K':
                letraCambiada = 'e'
                break;
            case 'l':
            case 'L':
                letraCambiada = 'f'
                break;
            case 'm':
            case 'M':
                letraCambiada = 'g'
                break;
            case 'n':
            case 'N':
                letraCambiada = 'h'
                break;
            case '�':
            case '�':
                letraCambiada = 'i'
                break;
            case 'o':
            case 'O':
                letraCambiada = 'j'
                break;
            case 'p':
            case 'P':
                letraCambiada = 'k'
                break;
            case 'q':
            case 'Q':
                letraCambiada = 'l'
                break;
            case 'r':
            case 'R':
                letraCambiada = 'm'
                break;
            case 's':
            case 'S':
                letraCambiada = 'n'
                break;
            case 't':
            case 'T':
                letraCambiada = 'ñ'
                break;
            case 'u':
            case 'U':
                letraCambiada = 'o'
                break;
            case 'v':
            case 'V':
                letraCambiada = 'p'
                break;
            case 'w':
            case 'W':
                letraCambiada = 'q'
                break;
            case 'x':
            case 'X':
                letraCambiada = 'r'
                break;
            case 'y':
            case 'Y':
                letraCambiada = 's'
                break;
            case 'z':
            case 'Z':
                letraCambiada = 't'
                break;


            default:
                letraCambiada = letra;


        }

        return letraCambiada;
    }



}


new LeerArchivo("C:/Users/JC/Documents/Codigo.txt")