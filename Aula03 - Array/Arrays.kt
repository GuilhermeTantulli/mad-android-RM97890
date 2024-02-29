//Exercicio 1: Soma dos elementos

fun main(){
    //Trabalhando com arrays (Vetores, Coleções, Listas)
    // val numbers = intArrayOf(5, 10, 15, 20, 25) // imutavel
    // val values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0)
    val names = arrayOf("Mariana", "Beatriz", "Kaue", "Lucas")
    val searchName = "Kaue" // elemento a ser buscado
    var found = false // Variável para verificar se o elemento foi encontrado
    // var sum1 = 0 // mutavel
    // var sum2 = 0.0
    // var max = numbers[0] //instanciado como 0 para substituir futuramente
    // var min = numbers[0]

    //loop para encontrar o maior/menor número do array
    // for (number in numbers) {
    //     if (number < min) {
    //         min = number
    //     }
    //     else if (number > max) {
    //         max = number
    //     }
    //     sum1 += number
    // }

    // for (value in values) {
    //     sum2 += value
    // }
    //     val average = sum2 / values.size

    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }
    if (found) {
        println("$searchName foi encontrado no array")
    } else {
        println("$searchName não foi encontrado no array")
    }
        
    // prints
    // println("A soma dos elementos é $sum1")
    // println()
    // println("O primeiro elemento da lista é: " + numbers[0])
    // println()
    // println("O segundo elemento da lista é: " + numbers[1])
    // println()
    // println("O terceiro elemento da lista é: " + numbers[2])
    // println()
    // println("O maior elemento é: $max")
    // println()
    // println("O menor elemento é: $min")
    // println()
    // println("A média de valores desse array é: $average")
}