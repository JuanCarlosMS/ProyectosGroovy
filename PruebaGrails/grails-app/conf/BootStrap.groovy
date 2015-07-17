import com.grails.prueba.Persona

class BootStrap {

    def init = { servletContext ->
        if (Persona.count() == 0) {
            new Persona(primerNombre: 'John', segundoNombre: 'Doe', edad: 20).save()
            new Persona(primerNombre: 'Jane', segundoNombre: 'Smith', edad: 18).save()
            new Persona(primerNombre: 'Scott', segundoNombre: 'Robinson', edad: 42).save()
        }
    }
    def destroy = {
    }
}
