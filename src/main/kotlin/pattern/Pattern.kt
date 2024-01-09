package pattern

fun main() {
    patternA()
    println()
    patternB()
    println()
    patternC()
    println()
    patternD()
    println()
    patternE()
    println()
    patternF()
    println()
    patternG()
    println()
    patternH()
    println()
    patternI()
    println()
    patternJ()
    println()
    patternK()
    println()
    patternL()
    println()
    rowColPattern()
    println()
    rightAnglePattern()
    println()
    rightAnglePatternWithNumber()
    println()
    reverseRightAnglePattern()
    println()
    reverseRightAnglePatternWithNumber()
    println()
    pyramidPattern()
    println()
    reversePyramidPattern()
    println()
    diamondPattern()
    println()
    printSymmetricalRightAnglePattern()
    println()
    printBitPattern()
    println()
    printPattern12()
    println()
    printCountPattern()
    println()
    printAlphabetPattern()
}

fun printAlphabetPattern(){
    val height = 5

    for(i in 0 until height){
        //for capital A
        var alphaAscii =65
        for (j in 0 .. i){
            val char = alphaAscii.toChar()
            print("$char")
            alphaAscii++
        }
        println()
    }
}


fun printCountPattern(){
    val height = 5
    var count =1
    for(i in 0 until height){
        for (j in 0 .. i){
            print("${count++} ")
        }
        println()
    }
}

fun printPattern12(){
    val height =4
    var space =2*(height-1)
    for (i in 1 .. height){
        for (j in 1 .. i){
            print("$j")
        }

        for (j in 1 .. space) {
            print(" ")
        }

        for (j in i downTo 1){
            print("$j")
        }

        println()
        space-=2
    }
}

fun printBitPattern() {
    val height = 5
    for (i in 0 until height) {
        var start =if (i % 2 == 0)  1 else  0
        for (j in 0 .. i){
            print("$start")
            start = 1 - start
        }
        println()
    }

}

fun printSymmetricalRightAnglePattern() {
    val height = 5
    for (i in 1..2 * height) {
        var stars = i
        if (i > height) stars = 2 * height - i
        for (j in 1..stars) {
            print("*")
        }
        println()
    }
}


fun diamondPattern() {
    pyramidPattern()
    reversePyramidPattern()
}

fun pyramidPattern() {
    val height = 5
    for (i in 0 until height) {
        for (j in 0 until height - i - 1) {
            print(" ")
        }

        for (j in 0 until 2 * i + 1) {
            print("*")
        }

        for (j in 0 until height - i - 1) {
            print(" ")
        }
        println()
    }
}

//[0,9,0]
//[1,7,1]
//[2,5,2]

fun reversePyramidPattern() {
    val height = 5
    for (i in 0 until height) {
        for (j in 0 until i) {
            print(" ")
        }

        for (j in 0 until 2 * height - (2 * i + 1)) {
            print("*")
        }

        for (j in 0 until i) {
            print(" ")
        }
        println()
    }
}

fun reverseRightAnglePattern() {
    val height = 5
    for (i in height downTo 0) {
        for (j in i downTo 0) {
            print("* ")
        }
        println()
    }
}

fun reverseRightAnglePatternWithNumber() {
    val height = 5
    for (i in height downTo 1) {
        for (j in 0 until i) {
            print("${j + 1}")
        }
        println()
    }
}

fun rightAnglePattern() {
    val height = 5
    for (i in 0 until height) {
        for (j in 0..i) {
            print("* ")
        }
        println()
    }
}

fun rightAnglePatternWithNumber() {
    val height = 5
    for (i in 0 until height) {
        for (j in 0..i) {
            print("${i + 1} ")
        }
        println()
    }
}


fun rowColPattern() {
    val height = 5
    for (i in 0 until height) {
        for (j in 0 until height) {
            print("* ")
        }
        println()
    }
}


fun patternA() {
    val row = 5
    for (i in 0 until row) {
        for (j in 0 until row * 2) {
            if (j == row - i || j == row + i || (i == row / 2 && j > row - i && j < row + i)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun patternB() {
    val row = 8
    for (i in 0 until row / 2 + 1) {
        if (i == 0 || i == row / 2) {
            for (j in 0 until row) {
                print("*")
            }
        } else {
            for (j in 0 until row) {
                if (j == 0 || j == row - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
        println()
    }

    for (i in row / 2 - 1 downTo 0) {
        if (i == 0) {
            for (j in 0 until row) {
                print("*")
            }
        } else {
            for (j in 0 until row) {
                if (j == 0 || j == row - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
        println()
    }
}

fun patternC() {
    val row = 8
    for (i in 0 until row) {
        if (i == 0 || i == row - 1) {
            for (j in 0 until row) print("*")
        } else {
            for (j in 0 until row) {
                if (j == 0) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
        println()
    }
}

fun patternD() {
    val row = 8
    for (i in 0 until row) {
        for (j in 0 until row)
            if (i == 0 || i == row - 1 || j == 0 || j == row - 1) {
                print("*")
            } else {
                print(" ")
            }
        println()
    }
}

fun patternE() {
    val row = 8
    for (i in 0 until row / 2 + 1) {
        if (i == 0 || i == row / 2) {
            for (j in 0 until row) print("*")
        } else {
            for (j in 0 until row) if (j == 0) print("*") else print(" ")
        }
        println()
    }


    for (i in row / 2 - 1 downTo 0) {
        if (i == 0) {
            for (j in 0 until row) print("*")
        } else {
            for (j in 0 until row) if (j == 0) print("*") else print(" ")
        }
        println()
    }
}

fun patternF() {
    val row = 5
    for (i in 0 until row) {

        when (i) {
            0 -> {
                for (j in 0 until row) {
                    print("*")
                }
            }

            row / 2 -> {
                for (j in 0 until i + 1) {
                    print("*")
                }
            }

            else -> {
                for (j in 0 until row) {
                    if (j == 0) print("*") else {
                        print(" ")
                    }
                }
            }
        }
        println()
    }
}

fun patternG() {
    val row = 8
    for (i in 0 until row) {
        if (i == 0) {
            for (j in 0 until row) {
                print("*")
            }
        } else if (i < row / 2) {
            print("*")
        } else if (i == row / 2) {
            for (j in 0..row) {
                if (j == 0 || j >= row / 2) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        } else if (i == row - 1) {
            for (j in 0..row) {
                if (j < row / 2 + 1 || j == row) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        } else {
            for (j in 0..row) {
                if (j == 0 || j == row / 2 || j == row) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
        println()

    }
}

fun patternH() {
    val row = 8
    for (i in 0 until row) {
        if (i == row / 2) {
            for (j in 0 until row) {
                print("*")
            }
        } else {
            for (j in 0 until row) {
                if (j == 0 || j == row - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }

        println()
    }
}

fun patternI() {
    val row = 7
    for (i in 0 until row) {
        if (i == 0 || i == row - 1) {
            for (j in 0 until row) {
                print("*")
            }
        } else {
            for (j in 0 until row) {
                if (j == row / 2) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
        println()
    }
}

fun patternJ() {
    val row = 8
    for (i in 0 until row) {
        if (i == 0) {
            for (j in 0 until row) {
                print("*")
            }
        } else if (i == row - 1) {
            for (j in 0 until row / 2 + 1) {

                print("*")

            }
        } else {
            for (j in 0 until row) {
                if (j == row / 2) print("*") else print(" ")
            }
        }
        println()
    }
}

fun patternK() {
    val row = 5
    for (i in 0 until row) {
        for (j in 0..row) {
            if (j == 0 || j == row - i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    for (i in row downTo 1) {
        for (j in 0..row) {
            if (j == 0 || j == row - i + 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun patternL() {
    val row = 5
    for (i in 0 until row) {
        if (i == row - 1)
            for (j in 0 until row) {
                print("*")
            }
        else
            for (j in 0 until row) {
                if (j == 0) {
                    print("*")
                }
            }

        println()
    }
}

fun patternM() {
    val height = 5

    for (i in 0 until height) {
        for (j in 0 until height * 2) {
            if (j == 0 || j == height * 2 - 1 || (i == j / 2 && j < height * 2 - 1) || (i + j == height - 1 && j < height)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}




