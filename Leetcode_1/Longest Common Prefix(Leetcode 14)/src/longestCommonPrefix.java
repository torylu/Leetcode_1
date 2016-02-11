import java.lang.reflect.Array;


public class longestCommonPrefix {
	
	public static String longestCommonPrefix(String []strs){
		int length=Array.getLength(strs);
		if(length==0)
			return "";
		else if(length==1)
			return strs[0];
		String longestPrefix=strs[0];
		for(int i=1;i<length;i++){
			if("".equals(strs[i]))
				return "";
			int len=Math.min(strs[i].length(),longestPrefix.length());
			for(int j=0;j<len;j++){
				if(strs[i].charAt(j)!=longestPrefix.charAt(j)){
					longestPrefix=longestPrefix.substring(0,j);
					break;
				}
				if(j==len-1){
					if(strs[i].length()<longestPrefix.length())
						longestPrefix=strs[i];
				}
			}
		}
		return longestPrefix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s={"abab","aba",""};
		System.out.println(longestCommonPrefix(s));
	}

}
