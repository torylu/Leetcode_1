
public class mergeSortedArray {

	public static void merge(int []nums1,int m,int []nums2,int n){
		int index1=m-1;
		int index2=n-1;
		for(int i=m+n-1;i>=0;i--){
			if(index1>=0&&index2>=0){
				if(nums1[index1]>nums2[index2]){
					nums1[i]=nums1[index1];
					index1--;
				}
				else{
					nums1[i]=nums2[index2];
					index2--;
				}
			}
			else if(index1>=0){
				nums1[i]=nums1[index1];
				index1--;
			}
			else{
				nums1[i]=nums2[index2];
				index2--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1={2,0};
		int []nums2={1};
		merge(nums1,1,nums2,1);
	}

}
