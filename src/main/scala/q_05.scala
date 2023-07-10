//5. Write a recursive function to get the addition of all even numbers less than given n
import scala.io.StdIn.readInt
object q_05 {
  def main(Args: Array[String]): Unit = {
    println("enter number, to get the addition of all even numbers less than given number - ");
    val num = readInt();
    println(add_even_nums(num - 1));

  }

  def add_even_nums(num: Int): Int = {
    if (num <= 0) return 0;
    if (is_even(num)) num + add_even_nums(num - 2)
    else add_even_nums(num - 1)
  }

  def is_even(num: Int): Boolean = {
    if (num == 0) true;
    else is_odd(num - 1);
  }

  def is_odd(num: Int): Boolean = {
    if (num == 0) false;
    else is_even(num - 1);

  }
}
