// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers

// 입력값 N 번째 피보나치 수열 값을 구하시오.
// (The Fibonacci sequence begins with  0 and 1.)

// 0 1 1 2 3 5 8 13 21 34...

object Solution {
  
  def fibonacci(x:Int):Int = {

    // Fill Up this function body
    // You can add another function as well, if required
    def FibonacciAcc(x: Int, prev: Int, next: Int): Int = x match {
      case 0 => prev
      case 1 => next
      case _ => FibonacciAcc(x - 1, next, (next + prev))
    }
    FibonacciAcc(x-1, 0 , 1)

  }

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(readInt()))

  }
}


// 참고 : http://alvinalexander.com/scala/scala-recursion-examples-recursive-programming