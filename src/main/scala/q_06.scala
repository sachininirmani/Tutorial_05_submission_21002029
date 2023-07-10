//6. The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .
//Each subsequent number is the sum of the previous two. Write a recursive function print first n Fibonacci numbers for given n.

import scala.io.StdIn.readInt
object q_06 {
    def main(Args: Array[String]): Unit = {
    println("enter number, to print first n Fibonacci numbers for given n - ");
    val num = readInt();
    fibonacciSeq(num);
  }

  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciSeq(n: Int): Unit = {
    if (n > 0) fibonacciSeq(n - 1)
    println(fibonacci(n))
  }

}
