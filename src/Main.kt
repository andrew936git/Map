//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println("==========================1==========================")
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    var map: MutableMap<Int, Int> = mutableMapOf()
    map = someFun(array)
    map.forEach { element -> println("${element.key} = ${element.value}") }
//2
    println("==========================2==========================")
    val people = mutableMapOf(
        1 to "Иван", 2 to "Петр", 3 to "Лида",
        4 to "Петр", 5 to "Анна"
    )
    people.delete(readln())
    people.forEach { element -> println("${element.key} = ${element.value}") }
//3
    println("==========================3==========================")
    val personHashMap: MutableMap<Int, Person> = mutableMapOf(
        1 to Person("Иван", 25, "Продавец"),
        2 to Person("Мария", 31, "Кадровик"),
        3 to Person("Алексей", 41, "Инженер")
    )
    personHashMap.forEach { i -> println("${i.key} = ${i.value.toString()}") }
}

fun <T> someFun(array: Array<T>): MutableMap<T, Int> {
    array.sort()
    val map: MutableMap<T, Int> = mutableMapOf()
    for (i in array) {
        var count = 0
        for (j in array) {
            if (i == j) count++
        }
        map[i] = count
    }
    return map
}

infix fun <K, V> MutableMap<K, V>.delete(value: String): MutableMap<K, V> {
    val newMap: MutableMap<K, V> = mutableMapOf()
    var count = 0
    for (name in this) {
        if (name.value == value) continue
        else newMap[name.key] = name.value
    }
    this.clear()
    for (name in newMap)
        this[name.key] = name.value

    return this
}



