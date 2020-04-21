object Functions{

  def squareIt(x: Int) : Int = {
    x * x
  }                                               //> squareIt: (x: Int)Int

  def cubeIt(x: Int): Int = {x * x * x}           //> cubeIt: (x: Int)Int

  println(squareIt(2))                            //> 4

  println(cubeIt(2))                              //> 8

  // Functions can take other functions as parameters

  def transformInt(x: Int, f: Int => Int) : Int = {
    f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int

  val result = transformInt(2, cubeIt)            //> result  : Int = 8
  println (result)                                //> 8

  // "Lambda functions", "anonymous functions", "function literals"
  // You can declare functions inline without even giving them a name
  // This happens a lot in Spark.
  transformInt(3, x => x * x * x)                 //> res0: Int = 27

  transformInt(10, x => x / 2)                    //> res1: Int = 5

  transformInt(2, x => {val y = x * 2; y * y})    //> res2: Int = 16

}