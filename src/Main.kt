//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Declaração da matriz 3x3
    val limits : Int = 3
    val matriz: Array<DoubleArray> = Array(limits) {DoubleArray(limits)}


    // Leitura dos valores da matriz
    for (i in 0 ..<limits) {
        for (j in 0..<limits) {
            print("Informe o valor da linha ${i + 1}, coluna ${j + 1}: ")
            matriz[i][j] = readLine()!!.toDouble()
        }
    }
    //Exibir a Matriz
    for (i in 0 ..<limits) {
        for (j in 0..<limits) {
            print(" [" + matriz[i][j] + "] ")
        }
        println(" ")
    }

    // Cálculo da soma dos elementos da matriz
    var soma = 0.0
    for (i in 0 ..<limits) {
        for (j in 0..<limits) {
            soma = soma + matriz[i][j]
        }

    }

    // Impressão da soma
    println("A soma dos elementos da matriz é: $soma")
}
