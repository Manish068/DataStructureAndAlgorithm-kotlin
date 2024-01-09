import kotlin.math.PI

class BasicAndStringProblems {

    fun factorial(n:Int):Int{
        if(n==1 || n==0)
            return 1
        return n*factorial(n-1)
    }

    fun power(num:Int,exp:Int): Int {
        if(exp==1)
            return num

        return num * power(num,exp-1)
    }
}


class Geometrics() : Area,Perimeter,Volume {
    
    fun allSolution(){

        println("Area of Circle ${areaOfCircle(10.0)}")
        println("Area of Triangle ${areaOfTriangle(20,10)}")
        println("Area of Rectangle ${areaOfRect(20,5)}")
        println("Area of isosceles triangle ${areaOfIsoscelesTriangle(20,15)}")
        println("Area of rhombus ${areaOfRhombus(20,10)}")
        println("Area of equilateral triangle ${areaOfEquilateralTriangle(20)}")

        println("Perimeter of Equilateral Triangle ${perimeterOfEquilateralTriangle(20)}")
        println("Perimeter of Parallelogram ${perimeterOfParallelogram(20)}")
        println("Perimeter of Rectangle ${perimeterOfRectangle(20,10)}")
        println("Perimeter of Square ${perimeterOfSquare(20)}")
        println("Perimeter of Circle ${perimeterOfCircle(10.0)}")
        println("Perimeter of Rhombus ${perimeterOfRhombus(20)}")
        println("Perimeter of Triangle ${perimeterOfTriangle(20,25,20)}")

        println("Volume of Cone ${volumeOfCone(10,20)}")
        println("Volume of Cylinder ${volumeOfCylinder(10.0,20.0)}")
        println("Volume of Pyramid ${volumeOfPyramid(10,20,20)}")
        println("Volume of Prism ${volumeOfPrismRectangle(10,20,20)}")
        println("Volume of Sphere ${volumeOfSphere(10.0)}")
        println("Volume of ${volumeOfCone(10,20)}")
    }
    override fun areaOfCircle(radius: Double): Double  = PI * radius * radius

    override fun areaOfTriangle(base: Int, height: Int): Double = 0.5 * base * height

    override fun areaOfRect(length: Int, breadth: Int): Int {
        return 2 * length * breadth
    }

    override fun areaOfIsoscelesTriangle(base: Int, height: Int): Double =
        1 / 2 * Math.cbrt((((height + base) * (height - base)) / 4).toDouble()) * base

    override fun areaOfParallelogram(side: Int, height: Int): Int = side * height
    override fun areaOfRhombus(d1: Int, d2: Int): Double = ((d1 * d2) / 2).toDouble()
    override fun areaOfEquilateralTriangle(side: Int): Double = Math.cbrt(3.0) / 4 * side * side

    override fun perimeterOfCircle(radius: Double): Double= 2 * PI * radius

    override fun perimeterOfEquilateralTriangle(side: Int): Int =3 * side

    override fun perimeterOfParallelogram(side: Int): Int = 2 * (side+side)

    override fun perimeterOfRectangle(length: Int, width: Int): Int = length * width

    override fun perimeterOfSquare(side: Int): Int = 4* side

    override fun perimeterOfRhombus(side: Int): Int = perimeterOfSquare(side)
    override fun perimeterOfTriangle(a: Int, b: Int, c: Int): Int = a+b+c
    override fun volumeOfCone(radius: Int, height: Int): Double = PI * radius * radius * height/3

    override fun volumeOfPrismRectangle(length: Int, width: Int, height: Int): Int =length * width * height

    override fun volumeOfCylinder(radius: Double, height: Double): Double  = PI * radius * radius * height

    override fun volumeOfSphere(radius: Double): Double  = 4/3 * PI * radius * radius * radius

    override fun volumeOfPyramid(length: Int, width: Int, height: Int): Double = ((length * width * height)/3).toDouble()


}

fun main() {
    val obj2 = BasicAndStringProblems()
    println("Factorial : ${obj2.factorial(3)}")
    println("Power : ${obj2.power(3,2)}")

}


interface Area {
    fun areaOfCircle(radius: Double): Double
    fun areaOfTriangle(base: Int, height: Int): Double
    fun areaOfRect(length: Int, breadth: Int): Int
    fun areaOfIsoscelesTriangle(base: Int, height: Int): Double
    fun areaOfParallelogram(base: Int, height: Int): Int
    fun areaOfRhombus(d1: Int, d2: Int): Double
    fun areaOfEquilateralTriangle(side: Int): Double

}

interface Perimeter{
    fun perimeterOfCircle(radius: Double):Double
    fun perimeterOfEquilateralTriangle(side: Int):Int
    fun perimeterOfParallelogram(side:Int):Int
    fun perimeterOfRectangle(length: Int,width:Int):Int

    fun perimeterOfSquare(side:Int):Int

    fun perimeterOfRhombus(side:Int):Int

    fun perimeterOfTriangle(a:Int,b:Int,c:Int):Int
}

interface Volume{
    fun volumeOfCone(radius:Int,height: Int):Double

    fun volumeOfPrismRectangle(length: Int,width: Int,height: Int) : Int

    fun volumeOfCylinder(radius: Double,height: Double):Double

    fun volumeOfSphere(radius: Double):Double

    fun volumeOfPyramid(length: Int,width: Int,height: Int):Double

}