fun somaDosQuadrados(a: Int, b: Int): Int{
    return (a * a) + (b * b)
}
    
fun main() {
    val a = 3
    val b = 4
    val resultado = somaDosQuadrados(a,b)
    println("Soma dos quadrados $a e $b é igual à $resultado")
}