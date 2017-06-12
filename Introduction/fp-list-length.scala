// https://www.hackerrank.com/challenges/fp-list-length
// 배열의 크기를 구하시오 (count, size or length 사용하지 말고)

def f(arr:List[Int]):Int = arr.foldLeft(0)((x,y) => x + 1 )

// # foldLeft & foldRight
// arr.foldLeft(초기값)( (누적값, elem) => {} )

/*

scala> numbers.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }
m: 0 n: 1
m: 1 n: 2
m: 3 n: 3
m: 6 n: 4
m: 10 n: 5
m: 15 n: 6
m: 21 n: 7
m: 28 n: 8
m: 36 n: 9
m: 45 n: 10
res0: Int = 55

*/

// 참고 : https://twitter.github.io/scala_school/ko/collections.html#fold

// 방법 2.
def f(arr:List[Int]):Int = arr.map(_=>1).sum