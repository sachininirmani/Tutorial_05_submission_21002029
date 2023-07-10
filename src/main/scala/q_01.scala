//1. Write a recursive function prime(n) that returns true for a prime number
//and false for the other? For example prime(5) should return true and
//prime(8) should return false

import scala.io.StdIn.readInt

object q_01 {
  def main(Args: Array[String]): Unit = {
    println("enter number, to check if it is a prime number - ");
    val num = readInt();
    println(check__is_prime(num));
  }

  def GCD(num_A: Int ,num_B: Int):Int =num_B match {
    case x if(x == 0) => num_A;
    case x if(x > num_A) => GCD(x, num_A);
    case _ => GCD(num_B, num_A%num_B);
  }
  def check__is_prime(num: Int, checker: Int = 2) :Boolean = checker match{
    case x if(x == num) => true;
    case x if(GCD(num, x) > 1) => false;
    case _ => check__is_prime(num, checker + 1);
  }

}
