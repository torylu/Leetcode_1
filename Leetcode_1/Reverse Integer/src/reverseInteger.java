
public class reverseInteger {
    public static int reverse(int x) {
    	Integer temp=Math.abs(x);
    	String str=temp.toString();
    	int length=str.length();
    	char s[]=new char[length];
    	for(int i=0;i<length;i++){
    		s[i]=str.charAt(length-i-1);
    	}
    	if(x>0)
    		return new Integer(String.valueOf(s)).intValue();
    	else
    		return -(new Integer(String.valueOf(s)).intValue());
    }
    public static void main(String []args){
    	System.out.println(reverse(-123));
    }
}
