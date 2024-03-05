fun main () {
    // Exemplo While
    
    var opcao: Char

    println("O que você deseja comprar?")

    do {
        println("\n\t[1] iPad")
        println("\n\t[2] iPhone")
        println("\n\t[3] iPod")
        println("\n\t[4] Sair")
        println("----> ")

        opcao = readLine()?.get(0)?.toUpperCase() ?: ' '

        when(opcao) {
            '1' -> println("Você comprou um iPad!")
            '2' -> println("Você comprou um iPhone!")
            '3' -> println("Você comprou um iPod!")
            '4' -> {
                println("Saindo!")
                return
            }
        }
    }
}