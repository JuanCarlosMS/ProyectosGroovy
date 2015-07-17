package com.grails.prueba

class HolaController {

    def index() {
        def personas = Persona.list()
        [personas:personas]
    }

    def desplegarInformacion(){

    }

    //prueba del layout prueba
    def pruebaTemplate(){

    }

    def saludo(){
        render (view:'index.gsp')
    }

}
