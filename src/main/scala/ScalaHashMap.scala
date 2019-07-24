object ScalaHashMap extends App {


  print("*************Hash Map Example ***********")

  val map = Map(1 -> "Vidit",
                2-> "Singh",
                 3 -> "Chauhan")

  println(map(3))
  map.foreach(println)

}
