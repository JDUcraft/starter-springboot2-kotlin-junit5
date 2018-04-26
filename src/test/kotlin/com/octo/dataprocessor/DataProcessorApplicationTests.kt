package com.octo.dataprocessor

import com.nitorcreations.matchers.ReflectionEqualsMatcher.reflectEquals
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Fizzbuzz Application")
class DataProcessorApplicationTests {
    @Test
    @DisplayName("Fizzbuzz of 3 should return 'fizz'")
    internal fun fizzBuzzOf3() {
        assertThat(arrayOf("fizz"), reflectEquals((fizzbuzzOf(numberArray = arrayOf(3)))))
    }

    @Test
    @DisplayName("Fizzbuzz of 5 should return 'buzz'")
    internal fun fizzBuzzOf5() {
        assertThat(arrayOf("buzz"), reflectEquals((fizzbuzzOf(numberArray = arrayOf(5)))))
    }

    private fun fizzbuzzOf(numberArray: Array<Int>): Array<String> {
        return numberArray.map { number: Int ->
            when {
                ifMultipleOf(number, 3) -> "fizz"
                ifMultipleOf(number, 5) -> "buzz"
                else -> {
                    number.toString()
                }
            }
        }.toTypedArray()
    }

    private fun ifMultipleOf(n: Int, i: Int): Boolean {
        return (n % i) == 0
    }
}
