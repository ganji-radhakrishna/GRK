/*
* Created By : RadhaKrishna
* Project Name : GRK
*/

package com.grk.scala

object TypeHierarchy {
  def main(args: Array[String]): Unit = {
    /** *
     * Scala Type Hierarchy
     * Any
     * ├── AnyVal
     * │   ├── Int
     * │   ├── Double
     * │   ├── Float
     * │   ├── Long
     * │   ├── Short
     * │   ├── Byte
     * │   ├── Char
     * │   ├── Boolean
     * │   └── Unit
     * │
     * └── AnyRef
     * ├── String
     * ├── List
     * ├── Map
     * ├── Set
     * ├── Array
     * ├── Option
     * ├── Some
     * ├── None
     * ├── Exception
     * ├── RuntimeException
     * └── User Defined Classes
     * ├── Employee
     * ├── Student
     * └── Customer
     *
     * Null
     * └── subtype of all AnyRef types only
     *
     * Nothing
     * └── subtype of ALL Scala types
     */

    val id: Any = 10
    val name: Any = "Radha"
    val salary: Any = 100.50

  }

  /*Why does getClass show java.lang.Object instead of Any ?

  Because:
    getClass works at JVM runtime level.
    JVM does not know Scala ’s Any type.
    Scala’s AnyRef maps to java.lang.Object.
    Any exists mainly in Scala’s compiler / type system, not as a JVM runtime class.*/
}

