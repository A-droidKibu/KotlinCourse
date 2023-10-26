package controlStatement

// the control statements
fun control() {
    // variable count to check on the state
    var count = 0
    do {
        count += 1
        println("THE STATES ARE $count")
    } while (count < 10)
}

fun addInt() {
    var age = 18
    when(age) {
        0 -> "When born still infant"
        in 1..13 -> "Still a kid"
        18 -> "The kid matures to an adult"
        else -> "That is life"

    }
}

fun main() {
    // call the method
    control()
}