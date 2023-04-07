import java.util.Scanner

fun main() {
    var menu = true
    while (menu) {
        print("""
            1.Square
            2.Left-side Triangle
            3.Right-side Triangle
            4.Upside Down Triangle
            5.Midpoint Triangle
            6.Ascending-Descending Triangle
            7.Exit 
            
        """.trimIndent())
        val input = Scanner(System.`in`)
        println("Enter your choice and break a space then a number: ")
        val choice = input.nextInt()
        val noOfStar = input.nextInt()

        when (choice) {
            1 -> square(noOfStar)
            7 -> menu = false
            else -> println("Please enter a number in menu. \n")
        }

    }
}

fun square(noOfStar: Int) {
    for (i in 1..noOfStar) {
        for (j in 1..noOfStar) {
            print("* ")
        }
        println()
    }
}