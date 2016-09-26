package com.searattled.exercises;
import static org.junit.Assert.*;

import org.junit.Test;


public class ConvertToRomanNumeralTest {

	@Test
	public void testConvert() {
		assertEquals("537", "DXXXVII", ConvertToRomanNumeral.convert(537));
		assertEquals("3888", "MMMDCCCLXXXVIII", ConvertToRomanNumeral.convert(3888));
		
	}

}
