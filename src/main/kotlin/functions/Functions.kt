package functions

// function - a block of code that performs a specific task
/**
 * My first function in python
 */
fun myFunc() {
    println("Hi, this is my first function in python")
}




/**
 * function to add 2 integers and return the value
 * function returns Integer as the output
 * use return keyword
 */
fun addInt(num1: Int, num2: Int) : Int {
    return num1 + num2
}

// main function
fun main() {
    // call the functions
    // call the function and pass arguments
    myFunc()
    println("${addInt(4, 6)}")
    println("${multiplyNumber()}")
}

/**
 * function to multiply 2 numbers
 * return the result
 */
fun multiplyNumber(): Int {
    val a: Int = 6
    val b: Int = 7
    return a * b
}

// assignment
/**
 * Create the function to Convert the Binary To Decimal
 * The function should allow the user take input from the user
 * The input should binary
 * Function should convert the input to decimal number like 45
 * Then output like 15
 */