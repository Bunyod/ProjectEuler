package problems


//Multiples of 3 and 5
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object Solution1 {
  val sum = (1 to 1000).filter(n => n%3==0 || n%5==0).sum
  assert(sum == 233168) // 7 ms
  //  sum: Int = 233168

  //  Problem 2
  //  Find the sum of all the even-valued terms in the Fibonacci sequence which do not exceed four million. *

//  lazy val fs: Stream[Int] = 0 #:: fs.scanLeft(1)(_ + _)
//  val res = fs.view.takeWhile(_ <= 4000000).filter(_ %2 ==0)
}
