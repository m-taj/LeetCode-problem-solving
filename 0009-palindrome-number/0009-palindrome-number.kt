class Solution {
  fun isPalindrome(x: Int): Boolean {
 var isPalindrome = true
 val stringifiedNumber = x.toString()
 var firstPointer = 0
 var secondPointer = stringifiedNumber.lastIndex

 while (firstPointer < secondPointer) {
  if (stringifiedNumber[firstPointer] != stringifiedNumber[secondPointer]) {
   isPalindrome = false
   break
  }
  firstPointer++
  secondPointer--
 }

 return isPalindrome
}
}