
public class removeDuplicate {

	
	public static int removeDuplicates(int []nums){
		int length=0;
		int start=0;
		for(int i=0;i<nums.length;i++){
			nums[start]=nums[i];
			if(i+1==nums.length){
				length++;
				break;
			}
			if(nums[i]!=nums[i+1])
				length++;
			else{
				int j=i+1;
				int temp=nums[j];
				while(nums[i]==nums[j]){
					j++;
					if(j==nums.length)
						break;
				}
				length++;
				i=j-1;
			}
			start++;
		}
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,1,2,3,3,3,4,4,4};
		int len=removeDuplicates(nums);
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.println(nums[i]);
		}
	}

}
