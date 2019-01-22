package main

import anagram.AnagramChecker

fun main(arrays: Array<String>){
    val anagramChecker1 = AnagramChecker("EAT", "tar")
    val anagramChecker2 = AnagramChecker("bleat", "tablE")
    val anagramChecker3 = AnagramChecker("hello", "olleh")

    anagramChecker1.check()
    anagramChecker2.check()
    anagramChecker3.check()
}