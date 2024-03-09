/** SISTEMA DE REGISTROS DE FUNCIONÁRIOS
 *
 * Desenvolva um sistema de registro de funcionários para uma empresa.
 * O sistema deverá permitir registrar diferentes tipos de funcionários e apresentar suas informações.
 *
 * Alguns passos abaixo:
 *
 * 1.Crie uma classe base chamada Funcionario com as seguintes propriedades:
 * - Nome (string): o nome do funcionário.
 * - Idade (int): a idade do funcionário.
 *
 * 2.Crie uma classe Gerente que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Setor (string): o setor em que o gerente trabalha.
 *
 * 3.Crie uma classe Desenvolvedor que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Linguagem (string): a linguagem de programação que o desenvolvedor utiliza.
 *
 * 4.Crie uma classe Analista que herda da classe Funcionario e adicione uma propriedade adicional:
 * - Area (string): a área de especialização do analista.
 *
 * 5.Imprima uma mensagem informando que um novo funcionário foi registrado, juntamente com o nome e a idade do
 * funcionário. (Lembre-se do init)
 *
 * 6. Crie um método na classe Funcionario chamado Apresentar que imprima uma mensagem de apresentação do funcionário,
 * incluindo o nome e a idade.
 *
 * 7. Crie uma lista de funcionários e adicione diferentes tipos de funcionários (gerentes, desenvolvedores e analistas)
 * à lista.
 *
 * 8. Utilize o typecast (is e as) para verificar o tipo de cada funcionário na lista e chamar o método Apresentar
 * correspondente.
 */

abstract class Funcionario(var nome: String, var idade: Int) {
    init {
        println("Funcionario $nome de idade $idade cadastrado com sucesso!")
    }

    fun apresentar() {
        println("Olá! Me chamo $nome e tenho $idade anos.")
    }
}

class Gerente(nome: String, idade: Int, var setor: String): Funcionario(nome, idade)

class Desenvolvedor(nome: String, idade: Int, var linguagem: String): Funcionario(nome, idade)

class Analista(nome: String, idade: Int, var area: String): Funcionario(nome, idade)

fun main() {
    val listaFuncionarios: MutableList<Funcionario> = mutableListOf()
    listaFuncionarios.add(Gerente("Joao", 50, "A"))
    listaFuncionarios.add(Gerente("Maria", 40, "B"))

    listaFuncionarios.add(Desenvolvedor("Ian", 24, "Kotlin"))
    listaFuncionarios.add(Desenvolvedor("Rebeca", 40, "Java"))

    listaFuncionarios.add(Analista("Maxwell", 30, "Sistemas"))
    listaFuncionarios.add(Analista("Leonidas", 60, "Redes"))

    for(item in listaFuncionarios) {
        when(item) {
            is Gerente -> {
                print("Gerente disse: ")
                item.apresentar()
            }
            is Analista -> {
                print("Analista disse: ")
                item.apresentar()
            }
            is Desenvolvedor -> {
                print("Desenvolvedor disse: ")
                item.apresentar()
            }
        }
    }
}