// https://www.hackerrank.com/challenges/fp-array-of-n-elements

def f(num:Int) : List[Int] = {
  val list = List.fill(num)(1)// Write your code here

  print(list + "\n")
  return list
}

// 스칼라에서 List 만드는 5가지 방법

// 1. Lisp style
// val list = 1 :: 2 :: 3 :: Nil // List(1,2,3)

// 2. Java style
// val list = List(1,2,3) // List(1, 2, 3)

// 3. ‘range’ method
// val list =  List.range(1, 10) // List(1,2,3,4,5,6,7,8,9)
// val list = List.range(0, 10, 2) // List(0, 2, 4, 6, 8)


// 4. ‘fill’ method
// val list = List.fill(3)("foo") // List(foo, foo, foo)

// 5. ‘tabulate’ method
// val list = List.tabulate(5)(n => n * n) // List(0, 1, 4, 9, 16)

// 출처 : http://alvinalexander.com/scala/how-create-scala-list-range-fill-tabulate-constructors