package business

import entity.Convite

class ConviteBusiness {
    //--------------------------------------------------------------------------------
    //função tipoValido() - retorna string
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    //função maiorDeIdade() - retorna inteiro
    fun maiorDeIdade(idade: Int) = idade >= 18

    //função codigoValido - Convite sendo referenciado pela classe Convite em grupo entity
    fun codigoValido(convite: Convite): Boolean = when (convite.tipo) {
            "comum" -> convite.codigo.startsWith("xt")

            //when permite comparar dois valores
            "premium", "luxo"-> convite.codigo.startsWith("xl")
            else -> false
            }
        }




