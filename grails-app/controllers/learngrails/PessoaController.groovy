package learngrails

import grails.converters.JSON

class PessoaController {
    def obterTodasPessoa(){
        def pessoa = Pessoa.getAll()
        respond pessoa

    }

    //sava
    def save(Pessoa pessoa){
        //sempre informações chega no params
        println(pessoa.nome)

        //flush - persiste no banco
        pessoa.save(flush:true)
        //equivale ao return
        respond "deu certo"
    }
}

