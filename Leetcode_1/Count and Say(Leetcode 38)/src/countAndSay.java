
public class countAndSay {

	public static String countAndSay(int n){
		String result="1";
		for(int i=n-1;i>0;i--){
			int length=result.length();
			String temp="";
			for(int j=0;j<length;j++){
				char c=result.charAt(j);
				int count=1;
				if(j+1==length||c!=result.charAt(j+1)){
					temp+="1";
					temp+=c;
				}
				else{
					int k=j+1;
					while(k!=length){
						if(result.charAt(k)==c){
							count++;
							k++;
						}
						else
							break;
					}
					temp+=count;
					temp+=c;
					if(k==length)
						j=length-1;
					else
						j=k;
				}
			}
			result=temp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(6));
	}

}
