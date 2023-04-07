import java.util.Scanner
import kotlin.math.abs

fun main() {
    var menu = true
    while (menu) {
        print(
            """
            1.Square
            2.Left-side Triangle
            3.Right-side Triangle
            4.Upside Down Triangle
            5.Midpoint Triangle
            6.Ascending-Descending Triangle
            7.Right-side Upside Down Triangle
            8.Upside Down Midpoint Triangle
            9.Right-side Ascending-Descending Triangle
            10.Exit 
            
        """.trimIndent()
        )
        val input = Scanner(System.`in`)
        println("Enter your choice and break a space then a number: ")
        val choice = input.nextInt()
        val noOfStar = input.nextInt()

        when (choice) {
            1 -> square(noOfStar)
            2 -> leftTriangle(noOfStar)
            3 -> rightTriangle(noOfStar)
            4 -> upsideTriangle(noOfStar)
            5 -> midpointTriangle(noOfStar)
            6 -> ascDesTriangle(noOfStar)
            7 -> rightUpsideTriangle(noOfStar)
            8 -> upsideMidpointTriangle(noOfStar)
            9 -> rightAscDesTriangle(noOfStar)
            10 -> menu = false
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

fun leftTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun rightTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        for (j in noOfStar downTo i) {
            print("  ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun upsideTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        for (j in noOfStar downTo i) {
            print("* ")
        }
        println()
    }
}

fun midpointTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        var blank = noOfStar - i
        for (j in 1..blank) {
            print("  ")
        }
        var star = i * 2 - 1
        for (j in 1..star) {
            print("* ")
        }
        println()
    }
}

fun ascDesTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        var mid = noOfStar / 2 + 1
        if (i < mid) {
            for (j in 1 until 2 * i) {
                print("* ")
            }
        } else if (i > mid) {
            for (j in 1..2 * (noOfStar - i) + 1)
                print("* ")
        } else {
            for (j in 1..noOfStar) {
                print("* ")
            }
        }
        println()
    }
}

fun rightUpsideTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        for (j in 1 until i) {
            print("  ")
        }
        for (j in noOfStar downTo i) {
            print("* ")
        }
        println()
    }
}

fun upsideMidpointTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        var star = 2 * (noOfStar - i) + 1
        for (j in 1 until i) {
            print("  ")
        }
        for (j in 1..star) {
            print("* ")
        }
        println()
    }
}

fun rightAscDesTriangle(noOfStar: Int) {
    for (i in 1..noOfStar) {
        var mid = noOfStar / 2 + 1
        val space = abs(mid - i) * 2
        if (i < mid) {
            for (j in 1 .. space) {
                print("  ")
            }
            for (j in 1..noOfStar-space){
                print("* ")
            }
        } else if (i > mid) {
            for (j in 1..space) {
                print("  ")
            }
            for (j in 1..noOfStar-space){
                print("* ")
            }
        } else {
            for (j in 1..2 * (noOfStar - i) + 1)
                print("* ")

        }
        println()

    }
}