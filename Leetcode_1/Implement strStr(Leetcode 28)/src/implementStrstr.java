
public class implementStrstr {

	public static int strStr(String haystack,String needle){
		
		if(needle.equals(""))
			return -1;
		int length=haystack.length();
		int needleLength=needle.length();
		for(int i=0;i<length;i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				if(i+needleLength>=length)
					return -1;
				else{
					if(haystack.substring(i,i+needleLength).equals(needle))
						return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","issip"));
	}

}
