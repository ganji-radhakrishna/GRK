/*
* Created By : RadhaKrishna
* Project Name : GRK
*/

package com.grk.scala

case class Money(amount: Int) {
  def +(m: Money): Money = {
    Money(amount + m.amount)
  }
}

object ScalaOperators {
  def main(args: Array[String]): Unit = {
    /*
    In Scala Operators are simply methods with symbolic names

    1) Arithmetic Operators --> + - * / %
    2) Relational Operators --> < <= > >= == !=
       == behaviour
       a == b
       if (a eq null)
          b eq null
       else
          a.equals(b)

    3) Logical Operators    --> && || !
    4) Bitwise Operator     --> & | ^ ~ << >> >>>
    5) Assignment Operator  --> = += -+ *= /=
    6) Special Operator     --> :: -> <-
       :: (List prepend)
       -> (Tuple creation)
       <- (Generators in for loop)
    */

    println(s"addition value 10.+(20)  : ${10.+(20)}")
    println(s"substraction 20.-(10)    : ${20.-(10)}")
    println(s"multiplication {10.*(10) : ${10.*(10)}")
    println(s"Integer Division 101/10  : ${101 / 10}")
    println(s"Float Division 101.0/10  : ${101.0 / 10}")
    println(s"modulus 10%3             : ${10 % 3}")

    println(s"10 > 5  :${10 > 5}")
    println(s"10 < 5  :${10 < 5}")
    println(s"10 == 10: ${10 == 10}")
    println(s"10 != 5 : ${10 != 5}")

    val s1 = "Scala"
    val s2 = "Scala"
    println(s1 == s2)

    println(s"true && true  : ${true && true}")
    println(s"true && false : ${true && false}")
    println(s"true || false : ${true || false}")
    println(s"!true         : ${!true}")

    println(s"5 & 3   : ${5 & 3}")
    println(s"5 | 3   : ${5 | 3}")
    println(s"5 ^ 3   : ${5 ^ 3}")
    println(s"5 << 3  : ${5 << 3}")
    println(s"5 >> 3  : ${5 >> 3}")

    val name:String=null
    val name1:String=null
    println(name.==("radha"))
    println(name == name1)


    val m1 = Money(100)
    val m2 = Money(200)
    println(m1 + m2)

    val l1 = 1 :: 2 :: 3 :: Nil
    println(l1)

    val map = Map("Maths" -> 95)
    println(map)

    for (i <- 1 to 10) println(i)

    // Even or odd number check
    val number: Int = 120
    val result = if (number % 2 == 0) "Even" else "Odd"
    println(s"number 120 is : ${result}")

    // find biggest number
    val n1 = 10
    val n2 = 20
    println(s"number n1 is ${n1} and n2 is ${n2} and the big number is : ${if (n1 > n2) n1 else n2}")
  }
}
