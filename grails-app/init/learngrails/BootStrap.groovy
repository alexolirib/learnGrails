package learngrails

class BootStrap {

    def init = { servletContext ->
        def p = new Pessoa(nome :"Goku")
        p.save(flush: true)

    }
    def destroy = {
    }
}
