// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements
// 주어진 리스트에서 홀수인 element 총합을 구하시오

def f(arr:List[Int]):Int = arr.filter(_ % 2 != 0).sum

/*
  # 총 합 구하는 방법

  1. sum
    arr.sum

  2. foldLeft
    arr.foldLeft(0)(_ + _)
 */