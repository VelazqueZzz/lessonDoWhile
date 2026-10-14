import kotlin.random.Random

fun main() {
    val maxAttempts = 3
    var attempts = 0

    println("Докажите, что вы не бот. Решите пример.")

    while (attempts < maxAttempts) {
        val a = Random.nextInt(1, 10)   // 1..9
        val b = Random.nextInt(1, 10)   // 1..9
        val correct = a + b
        print("Сколько будет $a + $b? ")
        val answer = readln().toInt()
        attempts++
        if (answer == correct) {
            println("Добро пожаловать!")
            return   // успех — выходим из main
        }
        println("Неверно. Осталось попыток: ${maxAttempts - attempts}")
    }
    println("Доступ запрещен")
}