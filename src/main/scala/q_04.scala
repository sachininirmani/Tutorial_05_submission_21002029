//4. Write a recursive function to determine even and odd numbers?
import scala.io.StdIn.readInt
object q_04 {
  def main(Args: Array[String]): Unit = {
    println("enter number, to determine if it is an odd number or an even number - ");
    val num = readInt();
    if (is_even(num)) println(num + " is even");
    else println(num + " is odd");

  }

  def is_even(num: Int):Boolean = {
    if (num == 0) true;
    else is_odd(num - 1);
  }

  def is_odd(num: Int): Boolean = {
    if (num == 0) false;
    else is_even(num - 1);

  }
}
