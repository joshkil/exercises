import static org.junit.Assert.*;

import org.junit.Test;


public class TestLongestPallendrome {

	@Test
	public void testFindLongestPallendrome() {
		
		{
			String test = "aba";
			int expect = 3;
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome(test));
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome_v2(test));
		}
		
		{
			String test = "aaaaaa";
			int expect = 6;
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome(test));
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome_v2(test));
		}
		
		{
			String test = "abcdefg";
			int expect = 1;
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome(test));
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome_v2(test));
		}
		
		{
			String test = "abaabbaaba";
			int expect = 10;
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome(test));
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome_v2(test));
		}
		
		{
			String test = "abaabbaabe";
			int expect = 8;
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome(test));
			assertEquals("Longest pallendrome in '" + test + "' is '" + expect
					+ "'", expect,
					LongestPallendrome.findLongestPallendrome_v2(test));
		}
		
		
		
		
	}

}
