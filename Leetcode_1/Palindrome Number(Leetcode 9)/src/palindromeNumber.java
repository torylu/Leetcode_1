
public class palindromeNumber {
	
	public static boolean isPalindrome(int x){
		int reverse=0,temp=x;
		while(temp!=0){
			reverse=reverse*10+x%10;
			temp/=10;
		}
		return (reverse==x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=200;
		System.out.println(isPalindrome(121));
	}

}
