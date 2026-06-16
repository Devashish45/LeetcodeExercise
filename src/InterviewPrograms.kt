fun interviewPrograms() {
    println("===== Palindrome ====")
    println("The pattern is Palindrome = ${checkPalindrome(121)}")
    println("===== Anagram ====")
    println("is Anagram = ${isAnagram("abcer", "bcare")}")
    println("===== max substring ====")
    println("max substring = ${lengthOfLongestSubstring("abcabcbb")}")
    println("===== Has duplicate in array ====")
    val array = intArrayOf(1, 2, 3, 4, 5, 6)
    println("Has duplicate in array = ${hasDuplicateInArray(array)}")
    println("===== Two Sum ====")
    val twoSumArray = intArrayOf(2,1,5,3,7)
    println("Two Sum = ${twoSum(twoSumArray,12).contentToString()}")

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

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val charArray = IntArray(26)
    for (i in str1.indices) {
        charArray[str1[i] - 'a']++
    }
    println(charArray.contentToString())
    for (j in str2.indices) {
        charArray[str2[j] - 'a']--
        if (charArray[str2[j] - 'a'] < 0) return false
    }
    return true

//
//    return str1.toCharArray().sorted() ==
//            str2.toCharArray().sorted()
}

//  https://www.youtube.com/watch?v=U2ppEzBaMck&list=PLEHBnWmMP--zQnyq4d2_Nj-d3nMKW5QcG&index=8
fun lengthOfLongestSubstring(s: String): Int {
    val charSet = mutableSetOf<Char>()
    var left = 0
    var maxLength = 0
    for (right in s.indices) {
        while (charSet.contains(s[right])) {
            charSet.remove(s[right])
            left++
        }
        charSet.add(s[right])
        maxLength = maxOf(maxLength, right - left + 1)
    }
    return maxLength
}

fun hasDuplicateInArray(nums: IntArray): Boolean {
    val numMap = hashMapOf<Int, Int>()
    for (index in nums.indices) {
        if (numMap.containsKey(nums[index])) {
            return true
        }
        numMap[nums[index]] = index
        println(numMap.entries)
    }
    return false
}


/**
 * Given an array of integers nums and an integer target, return the indices i and j such that
 * nums[i] + nums[j] == target and i != j.
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 * Return the answer with the smaller index first.
 * */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = hashMapOf<Int, Int>()
    val indexArray = IntArray(2)
    for (index in nums.indices) {
        val difference = target - nums[index]
        if (numMap.containsKey(difference)) {
            indexArray[0] = numMap[difference] ?: -1
            indexArray[1] = index
            return indexArray
        }
        numMap[nums[index]]=index
        println(numMap.entries)
    }
    return indexArray
}

