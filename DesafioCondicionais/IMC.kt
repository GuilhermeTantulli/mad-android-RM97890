fun coletarDados() {
    println("Digite seu peso em quilogramas: ")
    var pesoInput = readLine()
    println("Digite sua altura em metros: ")
    var alturaInput = readLine()

    val peso = pesoInput?.toDoubleOrNull()
    val altura = alturaInput?.toDoubleOrNull()

    // if (peso == null || altura == null) {
    //     println("Entrada inválida! Digite apenas números.")
    //     return
    // } else {
    //     var imc = peso / (altura * altura)
    //     if (imc < 18.5) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que você está com excesso de magreza.")
    //     } else if (18.5 <= imc && imc < 25) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que seu peso está normal.")
    //     } else if (25 <= imc && imc < 30) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que você está com excesso de peso.")
    //     } else if (30 <= imc && imc < 35) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que você tem obesidade grau I.")
    //     } else if (35 <= imc && imc < 40) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que você tem obesidade grau II.")
    //     } else if (imc >= 40 ) {
    //         println("Seu imc é: %.2f.".format(imc) + " Isso indica que você tem obesidade grau III.")
    //     }

        if (peso == null || altura == null) {
        println("Entrada inválida! Digite apenas números.")
        return
    } else {
        var imc = peso / (altura * altura)
        if (imc < 18.5) {
            println("Seu imc é: %.2f. Isso indica que você está com excesso de magreza.".format(imc))
        } else if (imc < 25) {
            println("Seu imc é: %.2f. Isso indica que seu peso está normal.".format(imc))
        } else if (imc < 30) {
            println("Seu imc é: %.2f. Isso indica que você está com excesso de peso.".format(imc))
        } else if (imc < 35) {
            println("Seu imc é: %.2f. Isso indica que você tem obesidade grau I.".format(imc))
        } else if (imc < 40) {
            println("Seu imc é: %.2f. Isso indica que você tem obesidade grau II.".format(imc))
        } else if (imc >= 40) {
            println("Seu imc é: %.2f. Isso indica que você tem obesidade grau III.".format(imc))
        }

    }
}

fun main(){
    coletarDados()
}

// para rodar: java -jar IMC.jar - após rodar o arquivo .kt