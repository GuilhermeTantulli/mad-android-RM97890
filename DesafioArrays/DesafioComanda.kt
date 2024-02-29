fun main() {
    var valorCoxinha: Double = 5.00
    var qtdeCoxinha: Int = 3
    var totalCoxinha: Double = qtdeCoxinha * valorCoxinha
    var valorCerveja: Double = 15.00
    var qtdeCerveja: Int = 2
    var totalCerveja: Double = qtdeCerveja * valorCerveja
    var somatoria: Double = totalCoxinha + totalCerveja
    var taxa: Double = 0.1
    var valorTaxa: Double = somatoria * taxa
    var total = somatoria + valorTaxa
    

    println("--------------------")
    println(".: Lanchonete Gui :.")
    println("--------------------")
    println("$qtdeCoxinha coxinhas: R$ %.2f".format(totalCoxinha))
    println("$qtdeCerveja cervejas: R$ %.2f".format(totalCerveja))
    println("--------------------")
    println("Total: R$ %.2f".format(somatoria))
    println("Taxa: R$ %.2f".format(valorTaxa))
    println("--------------------")
    println("Final: R$ %.2f".format(total))
}