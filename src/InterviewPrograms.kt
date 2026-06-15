fun interviewPrograms() {
    println("===== Palindrome ====")
    println("The pattern is Palindrome = ${checkPalindrome(121)}")
    println("===== Anagram ====")
    println("is Anagram = ${isAnagram("abc", "bca")}")
}

fun <T> checkPalindrome(x: T): Boolean {
    val input = x.toString()
    var left = 0
    var right = input.length - 1
    while (left < right) {
        if (input[left] != input[right]) {
            return false
        }
        left++
        right--
    }
    return true
//    var reversed = ""
//    for(i in input.length - 1 downTo 0) {
//        reversed += input[i]
//    }
//    return input == reversed
}

fun twoSum(nums: MutableList<Int>?, target: Int): MutableList<Int>? {
    // your code
    return null;
}
fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    return str1.toCharArray().sorted() ==
            str2.toCharArray().sorted()
}

fun lengthOfLongestSubstring(s: String) {

}

