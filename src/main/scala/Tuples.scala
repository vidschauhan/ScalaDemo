object Tuples extends App {

  println("*************** Tuple Example ****************")

  /** Tuples can be used to return more than one value from methods.
    * This is Tuple2[] type as it contains only 2 objects.
    * Tuples are immutable in nature. */

  val tuple = ("Hello",123)
  println("obj1 :" + tuple._1 + "," + "obj2 : "+ tuple._2)



}