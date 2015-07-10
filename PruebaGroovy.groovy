/**
 * Created by Sintelti on 09/07/2015.
 */

//pruebas de groovy
def cadena = "Este se una cadena"

def cadena2 = "Este es cadena2"

println cadena.class

println cadena2.class

//cadena con comillas dentro de comillas dobles

def cadenaComillas = "Esto es una 'cadena'"

println cadenaComillas

//Cadenas tipo Gstring
def saldo = 2.1254

def mensaje = "Tu saldo a fecha ${new Date()} es: ${saldo}"

println mensaje

println "Este mensaje: ${mensaje} \n esta detro de toro mensaje!!!"

//vericar que Gstrin no es un string
def str = "mensjae"
def gstr = "${str}"

println str.equals(gstr)
println str.equals(gstr.toString())

//Cadenas Heredoc para guardar cadenas multilineas

def cadenaMultiliena = """
Primera linea
Segunda linea
Tercera linea con 'cadena' y "Cadena"  """

println cadenaMultiliena

//Heredoc no son un tipo sino una caracteristicas
println '''heredoc con comillas simples'''.class
println """heredoc con comillas dobles""".class
println """heredoc con comillas dobles y expresión embebida: ${new Date()}""".class

//clousure

def saludar = {println "Hola desde closure"}

saludar();


//clousres con parametros it
def saludar2 = {println "Hola ${it} desde closure"}
saludar("juan")


//clousres con parametros explicitos
def saludar3 ={nombre -> println"Hola ${nombre} desde closure con parametros explicitos"}

saludar3.call("Juan")

//closure con mas de un parametro explicito
def saludar4 = { nombre, apellido ->
    println "Hola ${nombre} ${apellido} desde closure con mas de un parametro"}

saludar4("Juan Carlos","Molina")

//Tecnica Curry para pre-cargar valores a un closure
def hola = {nombre -> println "Hola ${nombre}" }

//alancenas el resultado del closure hola en una variable persona
def persona = hola.curry("anonimo")

//mandamos allamar a closure
persona()

println hola.curry("Anonimo")

//un ejemplo mas practico sobre el currying
def multiplicar = { valor1, valor2 ->
    valor1 * valor2
}

//crea 2 closures y hace currying a multiplicar
def doble = multiplicar.curry(2)
def triple = multiplicar.curry(3)

// se manda a llmar pasandole un argumento restante
println doble(7)
println triple(7)

//closure como parametros en un metodo

def repetirMiNombre(int numeroRepeticiones, Closure closure)
{
    for (int i = 0; i <= numeroRepeticiones; i++)
    {
        closure.call( i, "Juan" )
    }
}

// hacemos un closre
def closure = {iteracion, nombre -> println "Mi nombre ${iteracion} es ${nombre}"}

//mandamos a llmar al metodo
repetirMiNombre(5, closure)

//*****rangos en Groovy******

//definimos una lista con valores de 1 al 10
def rango = 1..10

//mostrar sus elementos con el metodo echa()
rango.each { println "Elemento: ${it}"}


//otra forma de mostrar los elementos de un lista
for (int contador in rango)
{
    println "Eelemento ${contador}"
}

//atributos delos ranglos
def rango2 = 1..10

println rango.from
println rango.to
println rango.contains(4)
println rango.size()
println rango.get(3)
println rango[3]

//mostrar los elemetos de un rango usando los atribusots de los rangos
for (int i = 0; i < rango2.size(); i++)
{
    println "Elelemto ${i} de la lista es: ${rango.get(i)}"
}

//mostrando los elementos cde rango de forma invertida
def rango3 = 10..15
def inverso = rango3.reverse()
inverso.each {
    println it
}

//ejemploo de que casi cualquier cosas puede ser un rago
def hoy = new Date();
def unaSemanaDespues = hoy + 7

def rangoDeDias = hoy..unaSemanaDespues

//muestra  los elementos
rangoDeDias.each {println it}

//otro ejemplo
def rangoLetrasMinusculas = 'a'..'z'

def rangoLetrasMayusculas = 'A'..'Z'

def rangoInversoLetras = rangoLetrasMayusculas.reverse()

//muestra los elementos
rangoLetrasMinusculas.each{println it}
rangoInversoLetras.each {println it}

//******Listas en Groovy*******

//creamos una lista
def lista =[]
println lista.class

//crea lista con 3 edlemtos
def nombres = ["Juan", "Carlos", "Roberto"]
//mustra el numero de elementos que contiene
println nombres.size()

//agregamos elementos a la list de 2 maneras
nombres << "Brenda"

nombres.add("Giovanii")

//mosramos la lista
println nombres

//acceder a los elemtos de unalist
//como array
println nombres[2]
//con elmetodo getAt()
println nombres.getAt(1)

//insertar un nuevo elemetno
nombres[8] = "Ramon"

println nombres

//eleminar elmentos
def eleminado1 = nombres.remove(4)
def eliminado2 = nombres.remove("Roberto")

//impirmir los eliminados
println eleminado1
println eliminado2

//mostramos de nuevo la lista
println nombres

//eleiminado pasanod un objeto
def eliminar3 = nombres.remove("Sara")

println eliminar3

//elminar
3.times {
    nombres.remove(null)
}

println nombres

nombres << "Rogelio"

//mostramso la lista para ver si seagrego el elemetno
println nombres

//elimnar el ultimo elemtno o con el indice mas alto con el metodo POP
def eliminadoPop = nombres.pop()

println eliminadoPop
println nombres


//Añadir/sustar  un alista a/de otra mediante operadores + -
def pares = [2, 4, 6, 8]
def impares = [1, 3, 5, 7, 9]
pares += impares
//imprime la lista depues de juntarlas
println pares
//las acomoda
pares.sort()
//imprime de nuevo la lsita despues de acomodarla de menor a mayor
println pares
//sustra la lista de impare de pares
pares -= impares
//imprime de nuevo la lista
println pares

//unhir los valoresde una lista a una cadena de texto
def abc = ['a', 'b', 'c']
//une la cadenano la modifica
println "lista con el join(abc.join()) = ${abc.join()}"
//mostramos la cadena para verficar
println "Lista sin el join(abc) = ${abc}, no se modifica"

//une la cadenano la modifica
println "lista con el join(abc.join(-)) = ${abc.join("-")}"
//mostramos la cadena para verficar
println "Lista sin el join(abc) = ${abc}, no se modifica"

//******Mapas en Groovy********

//definimos un mapa con elemtenso en ella por clave-valor
def articulos = ['0001':"Shampoo", '0002':"Jabon", '0003':"Desodorante"]
//mostramso el mapa
println articulos

//accedr a un valor mediante su clave con estos metodos
//mediante el metodo get
println articulos.get('0001')
//mediante la notacion de punto en forma mapa.clave
println articulos.'0001'
//mediante notacion array
println articulos['0001']

//agreagr eleemtnos a mapas
//mediante el metodo puts
articulos.put('0004', "Leche")
//mediante notacion de puntos
articulos.'0005' = "Lapiz"
//mediante notacion Array
articulos['0006'] = "Taza"

//mostramos la lista para verficar que se hayan agregad0
println articulos

//borrar una pareja clave-valor
articulos.remove('0006')

//mostrar mapa
articulos.each {println it}

articulos.each {
    println it.key
}


//devolver una lista con todas laas claves de un mapa
def noArticulo = articulos.keySet()

noArticulo.each {
    println "Clave: ${it}"
}

/////***********OBJECTOS EN GROOVY****************/////////


class automovil{
    private String marca;
    String modelo;
    int año;
    int kilometraje;

    //devueleve l marca del coche en mayusculasz
    String getMarca()
    {
        return marca.toUpperCase()
    }// fin de getMarca



}

coche = new automovil();

coche.marca = "Nissa"

println "Marca ${coche.marca}"

class Tienda{
    int numeroTienda;
    String tienda;
    String permisoOfficial

    Tienda(int numero, String nombreTienda = 'Sin nombre', String permiso = 'Sin permiso')
    {
        numeroTienda = numero;
        tienda = nombreTienda;
        permisoOfficial = permiso;
    }

    String getformatoMayusculasPermiso()
    {
        return permisoOfficial.toUpperCase()
    }
}// fin de la clase Tienda

def parametrosConstructor = [numero:45, nombreTienda:'Juan', permiso:'aza10101']

def comercio = new Tienda(45, "Juan");

println "Tiendas de Queretaro"

println "Numero de la tienda: ${comercio.numeroTienda}"
println "Permiso: ${comercio.permisoOfficial}"

//comercio.permisoOfficial = "srte1010"

println comercio.tienda;
println comercio.permisoOfficial


/////7****************Meta-programing***************////
//String.interfaces.each { println it }
//String.constructors.each { println it }
//String.methods.each { println it }


//mostrar las propiedades de un objeto
def s = new String("SuperCadena")
s.properties.each { propiedad ->
    println propiedad
}


//metaclass

class Articulo{
    String descripicon
    double precio
}

def boligrafo = new Articulo(descripicon: "no tan bueno", precio: 0.48)


println boligrafo.class
println "Descripcion: ${boligrafo.descripicon}"
println "Precio: ${boligrafo.precio}"

//si el objeto boilgrafo contiene  una propiedad
if(boligrafo.metaClass.hasProperty(boligrafo, "descripicon")){
    println "Si lo tiene"
    println boligrafo.getProperty("descripicon")
}else{
    println "No tiene nada"
}

//si el objeto boligrafo contien un metodo
if( boligrafo.metaClass.respondsTo(boligrafo, "getDescripicon") ){
    println "si lo tiene"
    println "Metodos: ${Articulo.methods.each {println it}}"
}else{
    println "No lo tiene"
}


//Puntero Groovy :) :)
def listaNombres = []
def agregarElemento = listaNombres.&add
agregarElemento "Juan"
agregarElemento "Carlos"
agregarElemento "Raul"

//mostrar la lista
listaNombres.each {println it}

//**********Expando en Groovy *************
//expando es como un objeto en blanco al cual podemos añadirle metodo y propiedades
def perimetro = new Expando()

perimetro.base = 10
perimetro.altura = 6

println "La base del rectangulo es: ${perimetro.base}"
println "La altura del rectangulo es: ${perimetro.altura}"

//creando un metodo con expando

perimetro.diferencia = { nuevaBase, nuevaAlturar ->
    """Existe una diferencia de perimeto
        Primer Perimetro: ${2*(perimetro.base + perimetro.altura)}
        Segundo Perimetro ${2*(nuevaBase + nuevaAlturar)}"""

}

perimetro.diferencia(20, 12 )

//creadno una clase que podra leer y escribir propiedades dinamicamiente
class ArticuloMejorado{
    String descripcion
    double precio
    def propiedades = [:]

    void setProperty(String nombre, Object valor) {
        propiedades[nombre] = valor
    }

    Object getProperty(String nombre) {
        propiedades[nombre]
    }

}

def articuloM = new ArticuloMejorado()
articuloM.descripcion = "Eficaz y sencillo de usdar"
articuloM.codigoPN = 0001

println "Descripcion ${articuloM.descripcion}"
println "Codigo: ${articuloM.codigoPN}"


class Carro {
    String descripcion
    double precio

    Object invokeMethod(String nombre, Object args) {
        println "Invocado método ${nombre}() con los argumentos ${args}"
    }
}

def articulo = new Carro()
articulo.operacionInexistente('abc', 123, true)


class SimpleLogger {
    def logInicio(String metodo, args) {
        println "Iniciado el método ${metodo}() con los argumentos ${args}"
    }

    def logFin(String metodo, resultado) {
        println "Finalizando el método ${metodo}() con el resultado ${resultado}"
    }
}

class ArticuloLogger implements GroovyInterceptable {
    String descripcion
    double precio
    SimpleLogger logger

    void añadirDescuento(double porcentajeDescuento){
        precio = (precio * (100 - porcentajeDescuento) / 100)
    }

    def invokeMethod(String nombre, args) {
        logger.logInicio(nombre, args)
        def metaMetodo = ArticuloLogger.metaClass.getMetaMethod(nombre, args)
        def resultado = metaMetodo?.invoke(this, args)
        logger.logFin(nombre, resultado)
    }
}

def logger = new SimpleLogger()
def articulologger = new ArticuloLogger(descripcion:'Libreta', precio:1.40)
articulologger.logger = logger

articulologger.añadirDescuento(15)
println articulologger.precio





