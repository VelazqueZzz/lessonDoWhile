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

        if (username != login) {
            println("Не зарегистрирован. Пробуйте снова.")
            continue
        }
////dfkfdslnlskdngsdg

        while (true) {
            println("Введите пароль: ")
            val pass = readln()

            if (pass != password) {
                println("Неверный пароль, пробуйте снова")
                continue
            }

            break
        }

        break
    }

    println("Авторизация прошла успешно")
}