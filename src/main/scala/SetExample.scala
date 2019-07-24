
import scala.collection.immutable.HashSet
import scala.collection.mutable

object SetExample extends App {


  /** sets.contains("Vidit") returns True */

  val v = Set("Hello","World")
  print(v.contains("Hi"))


  val mutableHashSet = mutable.HashSet("Tomatoes", "Chilies")
  mutableHashSet += "Vidit"
  println(mutableHashSet)

  val immutableHashSet = HashSet("Hello","World")

/**  immutableHashSet += "there" will throw error as the hashset is immutable*/







}


