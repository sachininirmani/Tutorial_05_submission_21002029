//3. Write a recursive function returns the addition of numbers from1 to n?
//For example sum(5) should print 15

import scala.io.StdIn.readInt
object q_03 {
  def main(Args: Array[String]): Unit = {
    println("enter number, to get the addition of numbers from 1 to n - ");
    val num = readInt();
    println(sum(num));
  }

  def sum(num: Int):Int = {
    if (num == 1) return 1;
    num + sum(num - 1);
  }

}
