
public class LongestPallendrome {
	public static int findLongestPallendrome(String s){
		int maxLength = 1;
		for(int i = 0; i < s.length(); i++){
			for(int j = s.length()-1; j > i; j--){
				int beg = i;
				int end = j;
				while(beg<=end){
					if(s.charAt(beg) == s.charAt(end)){
						beg++;
						end--;
					} 
					else{
						break;
					}
				}
				if(beg>end){
					if(j-i > maxLength){
						maxLength = j-i+1;
					}
				}
			}
		}
		return maxLength;
	}
	
	public static int findLongestPallendrome_v2(String s){
		int maxLength = 1;
		for(int i = 0; i < s.length(); i++){
			// consider the length of a palindrom centered at this character.
			int currentLength = 0;
			int left = i;
			int right = i;
			// First collapse even length
			if((right+1)<s.length() && s.charAt(left) == s.charAt(right+1)){
				right++;
			}else{
				currentLength = 1;
				left--;
				right++;
			}
			
			while(left >= 0 && right < s.length()){
				if(s.charAt(left) == s.charAt(right)){
					currentLength += 2;
					left--;
					right++;
				}else {
					break;
				}
			}
			
			if(currentLength > maxLength){
				maxLength = currentLength;
			}
		}
		return maxLength;
	}
}
