package learngrails

class PessoaController {
    def obterTodasPessoa(){
        def pessoa = Pessoa.getAll()
        pessoa.each {p ->
            println(p.nome)
            render "meu nome é " + p.nome
        }

    }
}

