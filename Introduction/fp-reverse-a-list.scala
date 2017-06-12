// https://www.hackerrank.com/challenges/fp-reverse-a-list

def f(arr:List[Int]):List[Int] = arr.reverse

/*
  reverse : List[A] -  배열을 거꾸로 다시 리턴
  def	reverseMap [B](f : (A) => B) : List[B] - 거꾸로된 배열에 대한 map
  def	reverse_::: [B >: A](prefix : List[B]) : List[B] - prefix를 reverse 한 다음 List 앞에 붙혀준다

  val list = List(1,2,3)
  val res1 = list.reverse // List(3,2,1)
  val res2 = list.reverseMap(println(_)) // 3,2,1
  val res3 = list.reverse_:::(List(4,5)) // List(5, 4, 1, 2, 3)
 */