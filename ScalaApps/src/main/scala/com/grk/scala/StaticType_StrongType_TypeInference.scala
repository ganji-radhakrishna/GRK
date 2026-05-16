/*
* Created By : RadhaKrishna
* Project Name : GRK
*/

package com.grk.scala

object StaticType_StrongType_TypeInference {
  def main(args: Array[String]): Unit = {

    /*Static Typing
      A Statically typed language checks type correctness during compilation before execution
      What compiler checks : Is the variable/function declared with correct type?
                             and validates type declarations and assignments */

    // Valid Static Typing
    val age: Int = 36
    println(s"Age is $age")

    // Invalid Static Typing
    // val aNumber:Int="Twenty"
    /*Found: ("Twenty"  : String)
    Required: Int
    val aNumber: Int = "Twenty"
    */

    /* Strong Typing
       A Strongly typed language prevents unsafe operation between incompatible types.
       What compiler checks : Is this operation logically safe between these types?
                              Operation Between Types are meaningful/safe
     */
    // Ex:
    //val total=true + 100
    //val result = "Scala" / 2


    /* Type inference means:
      Scala compiler automatically determines types without explicitly writing them
     */
    // without type inference
    //val no:Int = 25
    //val numbers: List[Int] = List[Int](1, 2, 3)
      
    // with type inference
    val no = 25
    val numbers = List(1,2,3)
  }
}
