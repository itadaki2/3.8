fun main() {
    val kilometry = 53 // константы
    val futy = 228228
    val kilometryvmetrah = kilometry * 1000 // перевод километров в метры
    val futyvmetrah = futy * 0.305 // перевод футов в метры
    println("Километры: $kilometry") // вывод километров
    println("Футы: $futy") // вывод футов
    if (kilometryvmetrah < futyvmetrah) {
        println("расстояние в километрах меньше") // вывод если километры меньше
    } else {
        println("расстояние в футах меньше") // вывод если футы меньше
    }
}
