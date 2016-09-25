import java.util.Date;

public class FindLargestRectUnderHistogram {

	public static void main(String[] args) {
		int[] hist1 = new int[10000];
		
		for(int i = 0; i < hist1.length; i++){
			hist1[i] = (int)(1000*Math.random());
		}
		
		Date v1Start = new Date();
		System.out.println("Results: " + findLargestRect(hist1));
		Date v1End = new Date();
		long v1Time = v1End.getTime() - v1Start.getTime();
		System.out.println("V1 Time (ms): " + v1Time);
		
		Date v2Start = new Date();
		System.out.println("Results: " + findLargestRect_v2(hist1));
		Date v2End = new Date();
		long v2Time = v2End.getTime() - v2Start.getTime();
		System.out.println("V2 Time (ms): " + v2Time);
	}
	
	public static int findLargestRect(int[] hist){
		int maxArea = 0;
		int location = 0;
		for(int i = 0; i < hist.length; i++){
			for(int j = i; j>=0; j--){
				int minHeight = hist[i];
				for(int k = i; k >= j; k--){ // find local min between i and j
					if(hist[k] < minHeight) minHeight = hist[k];
				}
				int maxAreaBetweenJnK = (i-j+1)*minHeight;
				if(maxArea < maxAreaBetweenJnK) {
					maxArea = maxAreaBetweenJnK; 
					location = i;
				}
			}
		}
		System.out.println("@"+location);
		return maxArea;
	}
	
	public static int findLargestRect_v2(int[] hist){
		int maxArea = 0;
		int location = 1;
		
		//find max height of any bar, we need to know the max height to build our array of max heights
		int maxHeight = 0;
		for(int i = 0; i < hist.length; i++){
			if(hist[i]>maxHeight) maxHeight = hist[i];
		}
		
		//declare 2d array to hold max areas. for rectangles originating at x of height h max areas is in [x][h]
		int[][] maxAreaAtHeight = new int[hist.length][maxHeight];
		for(int i = 0; i < maxAreaAtHeight.length; i++){
			for(int j = 0; j < maxAreaAtHeight[0].length; j++){
				maxAreaAtHeight[i][j] = 0;
			}
		}
		
		// initialize maxAreaAtHeight for first element
		for(int i = 0; i < hist[0]; i++){
			maxAreaAtHeight[0][i] = i+1;
			if(maxAreaAtHeight[0][i] > maxArea) maxArea = maxAreaAtHeight[0][i]; // this is silly but elegant
		}
		
		for(int i = 1; i < hist.length; i++){
			for(int j = 0; j < hist[i]; j++){
				maxAreaAtHeight[i][j] = maxAreaAtHeight[i-1][j] + (j+1);
				if(maxAreaAtHeight[i][j] > maxArea) {
					maxArea = maxAreaAtHeight[i][j];
					location = i;
				}
			}
		}
		System.out.println("@" + location);
		return maxArea;
	}

}
