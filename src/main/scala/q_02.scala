//2. Write a recursive function primeSeq(n) that prints all prime number
//which less than n? For example prime(10) should print 2,3,5, and 7 on the
//terminal.
import scala.io.StdIn.readInt

object q_02 {
  def main(Args: Array[String]): Unit = {
    println("enter number, to get all prime numbers less than that number - ");
    val num = readInt();
    prime_seq(num);
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

  def prime_seq(num: Int): Unit = {
    if(num == 1) return
    prime_seq(num - 1)
    if(check__is_prime(num)) println(num);

  }

}
