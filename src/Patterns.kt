fun printAllPatterns() {
    println("=====Square")
    printSquare(5)
    println("===== printTriangleNumber ====")
    printTriangleNumber(5)
    println("===== Triangle-1 =====")
    printTriangle1(5)
    println("===== Triangle1 - Reverse =====")
    printTriangle1Reverse(5)
    println("===== Triangle-2 =====")
    printTriangle2(5)
    println("===== Triangle-2 Reverse=====")
    printTriangle2Reverse(5)
    println("===== printPyramid =====")
    printPyramid(5)
    println("===== printReversePyramid =====")
    printReversePyramid(5)
    println("===== printDiamond =====")
    printDiamond(5)
}

fun printSquare(n: Int) {
    for (i in 1..n) {
        for (j in 1..n) {
            print("#  ")
        }
        println()
    }
}

fun printTriangleNumber(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("$i ")
        }
        println()
    }
}

fun printTriangle1(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun printTriangle1Reverse(n: Int) {
    for (i in 1..n) {
        for (j in n - i downTo 1) print("  ")
        for (j in 1..i) print(" *")
        println()
    }
}

fun printTriangle2(n: Int) {
    for (i in 1..n) {
        for (j in i..n) {
            print("* ")
        }
        println()
    }
}

fun printTriangle2Reverse(n: Int) {
    for (i in 1..n) {
        for (j in 1 until i) {
            print("  ") // add leading spaces (2 spaces for alignment)
        }
        for (j in i..n) {
            print("* ")
        }
        println()
    }
}

fun printPyramid(n: Int) {
    for (i in 1..n) {
        for (j in n - i downTo 1) print(" ")
        for (j in 1..i) print("* ")
        println()
    }
}

fun printReversePyramid(n: Int) {
    for (i in n downTo 1) {
        for (j in n - i downTo 1) print(" ")
        for (j in 1..i) print("* ")
        println()
    }
}

fun printDiamond(n: Int) {
    for (i in 1..n) {
        for (j in n - i downTo 1) print(" ")
        for (j in 1..i) print("* ")
        println()
    }
    for (i in n-1 downTo 1) {
        for (j in n - i downTo 1) print(" ")
        for (j in 1..i) print("* ")
        println()
    }
}