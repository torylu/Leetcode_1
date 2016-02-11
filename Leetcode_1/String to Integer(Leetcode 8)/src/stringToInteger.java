

public class stringToInteger {
	
	public static int myAtoi(String str){
		int length=str.length();
		int start=0,sign=0,end=length;
		float sum=0;
		for(int i=0;i<length;i++){
			char c=str.charAt(i);
			if(' '==c)
				;
			else if('+'==c){
				sign=1;
				start=i+1;
				break;
			}
			else if('-'==c){
				sign=-1;
				start=i+1;
				break;
			}
			else if(c>=48&&c<=57){
				start=i;
				break;
			}
			else
				return 0;
		}
		for(int i=start;i<length;i++){
			char c=str.charAt(i);
			if(c<48||c>57){
				end=i;
				break;
			}
		}
		int lengthOfInteger=end-1-start;
		for(int i=start;i<end;i++){
			char c=str.charAt(i);
			sum+=Math.pow(10,lengthOfInteger)*(new Integer(str.substring(i,i+1)));
			lengthOfInteger--;

		}
		if(sign==-1)
			return (int)-sum;
		else
			return (int)sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("-2147483647"));
	}

}
