package com.grails.prueba

class HolaController {

    def index() {
        def list = []

        list << new Person(primerNombre:"Juan", segundoNombre:"Carlos", age:23 )
        list << new Person(primerNombre:"Jose", segundoNombre:"Raul", age:24 )
        list << new Person(primerNombre:"Brenda", segundoNombre:"Guadalupe", age:21 )

        //Person persona = new Person(primerNombre:"Juan", segundoNombre:"Carlos", age:23 )
        [list:list]
    }

    def desplegarInformacion(){
        Person persona = new Person(age:59)
        [persona:persona]
    }

    //prueba del layout prueba
    def pruebaTemplate(){

    }

    def saludo(){
        render (view:'index.gsp')
    }

}
