import java.util.*;

public class BinarySearchLogic{
	public static void main(String[] args){
		System.out.println("BinarySearchLogic ");
		int[] numbers= new int[]{1,34,567,8907};
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Prompt a number : ");
		int searchNumber = inputScanner.nextInt();
		int resultIndex = getSearchElementFoundIndex(numbers,searchNumber);
		System.out.println(((resultIndex>=0)?("The search element found at index : "+resultIndex):" Number not found"));
	}
	
	
	private static int getSearchElementFoundIndex(int[] nums, int searchNum){
		int first=0;
		int last=nums.length-1;
		int mid = (first+last)/2;
		while(first<=last){
			if(nums[mid]<searchNum){
				first = mid+1;
			}else if(nums[mid]==searchNum){
				System.out.println("Found at : "+mid);
				return mid;
			}else if (nums[mid]>searchNum){
				last = mid-1;
			}
			mid= (first+last)/2;
		}
		
		return -1;
		
	}
}