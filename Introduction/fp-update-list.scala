// https://www.hackerrank.com/challenges/fp-update-list
// 배열 내 모든 값을 절대값으로 바꾸시오
def f(arr:List[Int]):List[Int] = arr.map(_.abs)

/*
 	val num = -5
  val numAbs = num.abs // 절대값 >> 5
  val max5or7 = numAbs.max(7) // 5(numAbs)와 7 사이의 최대값 >> 7
  val min5or7 = numAbs.min(7) // 5(numAbs)와 7 사이의 최소값 >> 5
 */

// 참고 : http://tryhelloworld.co.kr/courses/30%EB%B6%84-scala/lessons/%EC%88%AB%EC%9E%90-%EB%8B%A4%EB%A3%A8%EA%B8%B0