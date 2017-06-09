// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list


def f(arr:List[Int]):List[Int] = {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
  arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
}

/*
 # zipWithIndex
 - collection 에서 element와 index를 모두 사용하고 싶을때!
 - (elem, idx) 모양의 tuple로 collection을 생성

 val list = List("a", "b", "c")
 list.view.zipWithIndex foreach {case (value,index) => println(value,index)}
 // ("a",0)
 // ("b",1)
 // ("c",2)

*/

// 참고 : http://daily-scala.blogspot.kr/2010/05/zipwithindex.html