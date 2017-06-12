// https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd

object Solution {

  def gcd(x: Int, y: Int): Int =
  {
    // You only need to fill up this function
    // To return the value of the GCD of x and y
    if(y%x==0) x
    else gcd(y%x,x)
  }

  /**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

  }
}


/*
# GCD
- Greatest Common Divisor
- 최대공약수
- 0이 아닌 두 정수나 다항식의 공통되는 약수 중에서 가장 큰 수를 말한다
- 주어진 두 값을 나눈 나머지가 0이 될때까지 반복, 그때 0이 아닌 가장 작은 나머지 값.
 */

// 방법 2.
def gcd(a: Int,b: Int): Int = {
  if(b ==0) a else gcd(b, a%b)
}