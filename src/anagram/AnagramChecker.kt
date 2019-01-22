package anagram

import java.util.*

class AnagramChecker(
    private var str1: String,
    private var str2: String
) {

    fun check(){

        val status =
            if(str1.length != str2.length){
                false
            }
            else{
                val arrayStr1 = str1.toLowerCase().toCharArray()
                val arrayStr2 = str2.toLowerCase().toCharArray()

                Arrays.sort(arrayStr1)
                Arrays.sort(arrayStr2)

                Arrays.equals(arrayStr1, arrayStr2)
            }

        if(status)
            println("$str1 and $str2 are anagrams")
        else
            println("$str1 and $str2 are not anagrams")

    }

}