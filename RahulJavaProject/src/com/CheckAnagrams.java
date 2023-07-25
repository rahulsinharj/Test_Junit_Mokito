package com;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

	public static void main(String[] args) {

		char[] s1 = "listen".toCharArray();
		char[] s2 = "silent".toCharArray();

		System.out.println(areAnagram_HashMapApproach(s1, s2));
	}

	public static boolean areAnagram_HashMapApproach(char[] s1, char[] s2) 
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length; i++) 
		{
			char ch1 = s1[i];
			char ch2 = s2[i];

			map.put(ch1, map.getOrDefault(ch1, 0) + 1);
			map.put(ch2, map.getOrDefault(ch2, 0) - 1);

		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> m : map.entrySet()) 
		{
			if (m.getValue() != 0)
				return false;
		}
		return true;

	}
}
