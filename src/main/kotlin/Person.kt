class Person {
    var name:String = "Insert name"
    var surname:String = "Insert surname"
    var cpf:String = "Insert CPF"
    constructor()
}

fun main() {
    var eu = Person()
    eu.name = "Diogo"
    eu.surname = "Toto"
    println("Nome completo: ${eu.name} ${eu.surname} e CPF: ${eu.cpf}")
}