object Scala1 {
  // VALUES are immutable constants. You can't change them once defined.
  val hello: String = "Hi!"                       //> hello  : String = Hi!
  println(hello)                                  //> Hi!

  // VARIABLES are mutable
  var helloThere: String = hello                  //> helloThere  : String = Hi!
  helloThere = hello + " There!"
  println(helloThere)                             //> Hi! There!

  // We could have done the same thing like this:
  val immutableHelloThere = hello + "There!"      //> immutableHelloThere  : String = Hi!There!
  println(immutableHelloThere)                    //> Hi!There!

  // Some other types
  val numberOne : Int = 1                         //> numberOne  : Int = 1
  val truth : Boolean = true                      //> truth  : Boolean = true
  val letterA : Char = 'a'                        //> letterA  : Char = a
  val pi : Double = 3.14159265                    //> pi  : Double = 3.14159265
  val piSinglePrecision : Float = 3.14159265f     //> piSinglePrecision  : Float = 3.1415927
  val bigNumber : Long = 1234567890l              //> bigNumber  : Long = 1234567890
  val smallNumber : Byte = 127                    //> smallNumber  : Byte = 127

  // String printing tricks
  // Concatenating stuff with +:
  println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)
  //  //> Here is a mess: 1truea3.141592651234567890

  // printf style:
  println(f"Pi is about $piSinglePrecision%.3f")  //> Pi is about 3.142
  println(f"Zero padding on the left: $numberOne%05d")
  //> Zero padding on the left: 00001


  // Dealing with booleans
  val isGreater = 1 > 2                           //> isGreater  : Boolean = false
  val isLesser = 1 < 2                            //> isLesser  : Boolean = true
  val impossible = isGreater & isLesser           //> impossible  : Boolean = false
  val anotherWay = isGreater && isLesser          //> anotherWay  : Boolean = false

  val picard: String = "Picard"                   //> picard  : String = Picard
  val bestCaptain: String = "Picard"              //> bestCaptain  : String = Picard
  val isBest: Boolean = picard == bestCaptain     //> isBest  : Boolean = true

}