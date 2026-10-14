fun main() {
    println("Пожалуйста, зарегистрируйтесь")
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    println("Регистрация пройдена, авторизуйтесь")

    while (true) {
        println("Введите имя пользователя: ")
        val username = readln()
        println("Введите пароль: ")
        val pass = readln()
        if (username != login || pass != password) {
            println("Неверные данные для входа. Попробуйте снова.")
            continue
        }
        break
    }
    println("Авторизация прошла успешно")
}