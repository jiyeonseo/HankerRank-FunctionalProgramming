// https://www.hackerrank.com/challenges/pascals-triangle?h_r=next-challenge&h_v=zen
/*
# 파스칼 트라이앵글

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
....

The value at the n row and r column of the triangle is equal to "n!/(r!*(n-r)!)"  where indexing starts from .

입력값 만큼의 줄(row)의 파스칼 트라이앵글을 프린트하시오

파스칼 트라이앵글 설명 : https://www.youtube.com/watch?v=ZyZD6yEbR_I

*/

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    //      val rows = args[0].toInt
    val rows = readInt()
    for (row <- 0 to rows-1) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}