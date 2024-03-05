fun main (){
    print("Digite sua idade: ")
    var idadeInput = readLine()
    
    if (idadeInput == null) {
        println("Entrada inválida!")
        return
    }

    val idade = idadeInput.toIntOrNull()

    if (idade == null) {
        println("Entrada inválida! Digite apenas números.")
        return
    }

    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }
}