// https://www.hackerrank.com/challenges/fp-list-replication

def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num)(_))

// # flatmap 
// - flatMap은 map과 flatten을 합성한 것이다. 
//   내포 리스트에 적용할 수 있는 함수를 중첩된 리스트 안의 각 리스트에 적용해서 나온 결과를 하나의 리스트로 합쳐준다.
// - ref : https://twitter.github.io/scala_school/ko/collections.html#flatMap