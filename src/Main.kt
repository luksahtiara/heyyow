

fun main () {
    name()
    friends()
    tempat()
}
fun name() {
    val name = "nama aku Filzah"
    println(name)
}
fun friends(){
    val friends = mutableListOf("chika", "sasa", "fatin")
    friends.add("khansa")
    println(friends)
}
fun tempat(){
    val kota = mutableMapOf(
        "JKT" to " Jakarta",
        "BTH" to "Batam",
    )
    println(kota)
}

