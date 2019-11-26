package io.turntabl.scalagettingstarted

object MyApp extends App {
  println("Hello, World!")

  //Task 2
  val firstName = "Isaac"
  val placeOfBirth = "Mampomg"
  println(s"$firstName was born in $placeOfBirth")

  //Task3
  def threeTimes(word: String) = print(word * 3)

  threeTimes("hello")

  //Task4
  def even(num: Int) = if (num % 2 == 0) true else false

  //Task5
  def odd(num: Int) = !even(num)

  //Task6
  def wordsToLower(word: String*) = word map (_.toLowerCase())

  //Task7
  def even2 (num: Int) = num match {
    case i if(i%2 == 0) => true
    case _ => false
  }

  //Task8
  def isWeekendDay(day:String)= day match {
    case "friday" | "Saturday" | "Sunday" => true
    case _ => false
  }

  //Task9
  def areWeekendDays(day:String*) = day map(isWeekendDay(_))

  //Task10
  areWeekendDays("friday", "Saturday", "Sunday") foreach(println)

  //Task11
  def stringAndInt(word:String, num:Int) = print(word * num)

}

