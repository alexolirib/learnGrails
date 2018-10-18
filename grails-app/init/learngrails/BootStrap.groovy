package learngrails

class BootStrap {

    def init = { servletContext ->
        def p = new Pessoa(nome :"Alexandre")
        p.save(flush: true)

    }
    def destroy = {
    }
}
