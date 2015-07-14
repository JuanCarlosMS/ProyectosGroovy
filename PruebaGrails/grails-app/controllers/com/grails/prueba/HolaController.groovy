package com.grails.prueba

class HolaController {

    def index() {
    }
    def saludo(){
        render (view:'index.gsp')
    }
}
