package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

//	Write a method that will receive a list of numbers and this method will return the text:
//		- "FizzBuzz" if i is divisible by 3 and 5.
//		- "Fizz" if i is divisible by 3.
//		- "Buzz" if i is divisible by 5.
//		- If none of the above conditions are true, then return the given number

	// @Test
	void contextLoads() {
	}

//	public int addNum(int num1, int num2) {
//		return num1 + num2;
//	}

	public String Divisible(int nums) {
		if ((nums % 3 == 0) && (nums % 5 == 0)) {
			return "FizzBuzz";
		} else if (nums % 3 == 0) {
			return "Fizz";
		} else if (nums % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(nums);

	}

	// @Test
//	void addNum() {
//		assertEquals(5, addNum(3, 2));
//
//	}

	@Test
	void Divisible() {
		int list[] = { 3, 5, 15 };
		assertEquals("FizzBuzz", Divisible(list[2]));
		assertEquals("Fizz", Divisible(list[0]));
		assertEquals("Buzz", Divisible(list[1]));

	}

}
