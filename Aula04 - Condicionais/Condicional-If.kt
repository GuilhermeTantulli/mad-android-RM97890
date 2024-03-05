// fun main (){
//     print("Digite sua idade: ")
//     var idadeInput = readLine()
    
//     if (idadeInput == null) {
//         println("Entrada inválida!")
//         return
//     }

//     val idade = idadeInput.toIntOrNull()

//     if (idade == null) {
//         println("Entrada inválida! Digite apenas números.")
//         return
//     }

//     if (idade >= 18) {
//         println("Você é maior de idade.")
//     } else {
//         println("Você é menor de idade.")
//     }
//

// fun main () {
//     //  Classificação Numérica

//     val numero = 7

//     if (numero > 0) {
//         println("O número é positivo")
//     } else if (numero = 0) {
//         println("O número é 0")
//     } else {
//         println("O número é negativo")
//     }
// }

// fun main () {
//     // Par ou Impar

//     var num = 10

//     if (num % 2 == 0) {
//         println("Esse número é par")
//     } else {
//         println("Esse número é impar")
//     }
// }

fun main () {
    // Verificar acesso

    val usuario = "vinicius"
    val senha = "senha123"

    if (usuario == "vinicius" && senha == "senha123") {
        println("Acesso concedido.")
    } else {
        println("Acesso negado.")
    }
}
