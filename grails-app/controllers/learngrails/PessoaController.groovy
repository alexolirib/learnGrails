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
        respond pessoa
    }

    //remove
    def delete(int id){
        def pessoa = Pessoa.get(id)
        pessoa.delete(flush: true)
        render "Deletado com sucesso"
    }


    def removePorId(int id){
        def pessoa = Pessoa.get(id)
        pessoa.delete(flush: true)
        render "Deletado com sucesso"
    }

    def alterarDadosPessoa(Pessoa pessoa){
        try {
            def p1 = Pessoa.findById(pessoa.id)
                save(pessoa)
        } catch (Exception e){
            render(status: 400, text: "não existe")
        }

    }
}

