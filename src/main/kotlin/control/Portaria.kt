//aponta para a classe ConviteBusiness() para validar

package control

import business.ConviteBusiness
import entity.Convite

/*do modo que está sendo construido, está sendo retirado tudo da
função portaria() e passando tudo há orientação a objetos
*/

/*Classe Portaria - responsavel por coordenar as coisas no programa Portaria*/
class Portaria {

    /*Instancia a variavel conviteBusiness para que a classe ConviteBusiness
     seja RESPONSAVEL por executar a função de validar o tipo do convite*/
    private val conviteBusiness = ConviteBusiness()

    /*init retira a necessidade de chamar a função controle como subchamada do main
     não há necessidade de incluir this.controle() porque só existe uma função controle()*/
    init {
        println("Portaria inicializada")
        println(controle())
    }

    /*cria a VARIAVEL console - só a classe Portaria tem acesso a variavel console
    private val console = Console()*/

    /*ATENÇÃO COMENTÁRIO LINHA 56 - para função abaixo validação se o tipo NÃO FOR VALIDO -
    O USO DA FUNÇÃO ESTÁ DUPLICADO E ERRADO,
    // MAS MUITO TEMPO PARADO PARA RESOLVER O PROBLEMA IMPEDINDO O ANDAMNETO DO CURSO

    função controle - como não tem nenhum objeto chamado o controle externamente
     pode-se deixar ela (a função) em modo privado*/
    private fun controle(): String {

        //INICIALIZAÇÃO PRINCIPAL DO PROGRAMA
        val idade = Console.readLine("Qual sua idade?")


        //9º validação de entrada de dados na função portaria() - controle de fluxo - SIMPLIFICOU O CÓDIGO UM POUCO COM A ALTERAÇÃO REALIZADA
        if (idade < 18) {
            return "Negado. Menores de idade não são permitidos."
        }

        //Código1
        val tipoConvite = Console.readString("Qual é o tipo de convite? ")

        //validação se o tipo NÃO FOR VALIDO
        if (!conviteBusiness.tipoValido(tipoConvite)) {
            return "Negado. Convite inválido."
        }

        //validação tipo de convite por categoria | comum xt | premium, luxo xl
        val codigo = Console.readString("Qual o código do convite? ")
        val convite = Convite(tipoConvite, codigo)

        if (!conviteBusiness.codigoValido(convite)){
            return "Negado. Convite inválido."
        }

        return "Welcome :)"
    }
}

//Função portaria usada para consulta
fun portaria() {

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    //3º validação de entrada de dados na função portaria() - controle de fluxo
    if (tipoConvite != null && tipoConvite != "") {
        /*
    tipoConvite = tipoConvite.lowercase()


    //4º Validação do tipo de convite - controle de fluxo
    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
    println("Negado. entity.Convite inválido.")

    //esse return só faz parar a execução do programa
    return
    }
    */

        print("Qual o código do convite? ")
        var codigo = readLine()

        //5º validação de entrada de dados na função portaria() - controle de fluxo
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()


            //recorte de código 6ºvalidação para classe ConviteBusiness()
        }
    }
}
