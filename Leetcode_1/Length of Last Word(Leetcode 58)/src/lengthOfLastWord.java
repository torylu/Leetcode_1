
public class lengthOfLastWord {

	public static int lengthOfLastWord(String s){
		int len=s.length();
		if(len==0)
			return 0;
		int start=0,end=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)!=' '){
				start=i;
				int temp=i;
				while(temp<len){
					if(s.charAt(temp)!=' ')
						temp++;
					else
						break;
				}
				i=end=temp-1;
			}
		}
		return end-start+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}

}
