/**
 * Created by Sintelti on 07/08/2015.
 */
class Fibonacci{

    int tope;

    Fibonacci(int limite)
    {
        tope = limite
        //recorrido(tope)
        serieFibonacci(tope)
    }

    public serieFibonacci(int tope)
    {
        int serie = 0
        int primero = 0;
        int segundo = 1
        for(int i = 0; i < tope; i++)
        {
            serie = primero + segundo
            primero = segundo;
            segundo = serie;

            print serie + '\n'
        }
    }

}

