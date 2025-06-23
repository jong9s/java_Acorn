package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 	in javaScript
		 * 
		 *  let nums = [10, 20, 30, 40, 50];
		 *  
		 *  nums[0]
		 *  nums[1]
		 *  .
		 *  .
		 *  
		 *  in java
		 *  
		 *  int[] nums={10, 20, 30, 40, 50};
		 *  
		 *  nums[0]
		 *  nums[2]
		 *  .
		 *  .
		 *  
		 */
		
		int[] nums = {10, 20, 30, 40, 50};
		
		/*
		 * 	"김구라", "해골", "원숭이", "주댕이", "덩어리" 5개의 문자열을 배열에 담고
		 * 	그 참조값은 names 라는 변수에 대입해보세요.
		 */
		
		String[] names = {"김구라", "해골", "원숭이", "주댕이", "덩어리"};
		
		// nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for 문)
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// names 배열에 저장된 문자열을 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for 문)
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
