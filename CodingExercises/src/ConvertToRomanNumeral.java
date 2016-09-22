
public class ConvertToRomanNumeral {
	
	public static String convert(int val){
		if(val > 3888) return "";
		String roman = "";
		
		//how many thousands
		if (val / 1000 > 0) {
			for (int i = 0; i < val / 1000; i++) {
				roman = roman.concat("M");
			}

			val = val % (1000 * (val / 1000));
		}
		
		// how many 500
		if(val/500 > 0){
			if(val%500 > 400){
				roman = roman.concat("CM");
				val = val%900;
			}else {
				roman = roman.concat("D");
				val = val%500;
			}
		}
		
		// how many 100's
		if(val/100 > 0){
			if(val%100 > 400){
				roman = roman.concat("CD");
				val = val%400;
			}else {
				for(int i = 0; i < val/100; i++){
					roman = roman.concat("C");
				}
				val = val%(100*(val/100));
			}
		}
		
		// how many 50
		if (val / 50 > 0) {
			if (val % 50 > 40) {
				roman = roman.concat("XC");
				val = val % 90;
			} else {
				roman = roman.concat("L");
				val = val % 50;
			}
		}
		
		//how many 10
		if(val/10 > 0){
			if(val%10 > 40){
				roman = roman.concat("XL");
				val = val%40;
			}else {
				for(int i = 0; i < val/10; i++){
					roman = roman.concat("X");
				}
				val = val%(10*(val/10));
			}
		}
		
		// how many 5
		if (val / 5 > 0) {
			if (val % 5 > 3) {
				roman = roman.concat("IX");
				val = val % 9;
			} else {
				roman = roman.concat("V");
				val = val % 5;
			}
		}
		
		
		// how many 1
		if (val / 1 > 0) {
			if (val % 1 > 3) {
				roman = roman.concat("IV");
				val = val % 4;
			} else {
				for (int i = 0; i < val / 1; i++) {
					roman = roman.concat("I");
				}
				val = val % (1 * (val / 1));
			}
		}
		
		if(val != 0) System.err.println("Something went wrong: " + val);
		System.out.println(roman);
		return roman;
	}

}
