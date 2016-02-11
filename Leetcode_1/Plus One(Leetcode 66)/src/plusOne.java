
public class plusOne {

	public static int[] plusOne(int []digits){
		int len=digits.length;
		int i=len-1;
		if(len==1){
			if(digits[0]==9){
				int []newDigits=new int[2];
				newDigits[0]=1;
				return newDigits;
			}
			digits[0]++;
			return digits;
		}
		for(;i>0;i--){
			if(digits[i]==9)
				digits[i]=0;
			else{
				digits[i]++;
				break;
			}
		}
		if(i==0){
			int []newDigits=new int[len+1];
			newDigits[0]=1;
			return newDigits;
		}
		else
			return digits;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []digits={9,9};
		int []number=plusOne(digits);
		for(int i=0;i<number.length;i++){
			System.out.println(number[i]);
		}
	}

}
