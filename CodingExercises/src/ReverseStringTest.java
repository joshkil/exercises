import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStringTest {

	@Test
	public void testReverseString() {
		
		{
			String s = "";
			assertEquals("Reverse: "+s, new StringBuilder(s).reverse().toString(), ReverseString.reverseString(s));
		}
		
		{
			String s = null;
			assertEquals("Reverse: "+s, null, ReverseString.reverseString(s));
		}
		
		{
			String s = "Josh";
			assertEquals("Reverse: "+s, new StringBuilder(s).reverse().toString(), ReverseString.reverseString(s));
		}
		
		{
			String s = "Josh is a big !!! Fat !!! ****Babby****";
			assertEquals("Reverse: "+s, new StringBuilder(s).reverse().toString(), ReverseString.reverseString(s));
		}
	}

}
