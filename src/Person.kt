data class Person(val name: String, val age: Int, val post: String) {
    override fun toString(): String {
        return "Имя: $name, Возраст: $age, Должность: $post"
    }
}