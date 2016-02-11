
public class addBinary {
	
	public static String addBinary(String a,String b){
		int overflow=0;
		int firstLength=a.length();
		int secondLength=b.length();
		int max=Math.max(firstLength,secondLength);
		char []outcome=new char[max];
		for(int i=0;i<max;i++){
			if(i<firstLength&&i<secondLength){
				if(Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))+overflow==0){
					outcome[max-i-1]='0';
					overflow=0;
				}
				else if(Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))+overflow==1){
					outcome[max-i-1]='1';
					overflow=0;
				}
				else if(Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))+overflow==2){
					outcome[max-i-1]='0';
					overflow=1;
				}
				else if(Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))+overflow==3){
					outcome[max-i-1]='1';
					overflow=1;
				}
			}
			else{
				if(firstLength>secondLength){
					if(overflow==1){
						if(overflow+Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))==1){
							overflow=0;
							outcome[max-i-1]='1';
						}
						else if(overflow+Integer.parseInt(a.substring(firstLength-1-i,firstLength-i))==2){
							overflow=1;
							outcome[max-i-1]='0';
						}
					}
					else{
						outcome[max-i-1]=a.charAt(firstLength-1-i);
					}
				}
				else{
					if(overflow==1){
						if(overflow+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))==1){
							overflow=0;
							outcome[max-i-1]='1';
						}
						else if(overflow+Integer.parseInt(b.substring(secondLength-1-i,secondLength-i))==2){
							overflow=1;
							outcome[max-i-1]='0';
						}
					}
					else{
						outcome[max-i-1]=b.charAt(secondLength-1-i);
					}
				}
			}
		}
		if(overflow==1){
			return '1'+new String(outcome);
		}
		return new String(outcome);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addBinary("10","110010"));
	}

}
