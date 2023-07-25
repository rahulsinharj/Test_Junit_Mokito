package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {

	@Test
	public void JunitTestMethod()
	{
		System.out.println("Testing");

		char[] s1 = "listen".toCharArray();
		char[] s2 = "silent".toCharArray();
		
		boolean ansReceived = CheckAnagrams.areAnagram_HashMapApproach(s1, s2);
		assertEquals(true, ansReceived);
		
	}
	

}
