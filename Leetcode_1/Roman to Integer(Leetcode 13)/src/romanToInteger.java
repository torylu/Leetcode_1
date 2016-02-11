
public class romanToInteger {
	/* I stands for 1
	 * V stands for 5
	 * X stands for 10
	 * L stands for 50
	 * C stands for 100
	 * D stands for 500
	 * M stands for 1000
	*/
	public int romanToInt(String s){
		int result=0;
		int length=s.length();
		for(int i=0;i<length;i++){
			char next;
			if(i+1<length)
				next=s.charAt(i+1);
			else
				next=' ';
			switch(s.charAt(i)){
			case 'I':
				if(next=='V'){
					result+=4;
					i++;
				}
				else if(next=='X'){
					result+=9;
					i++;
				}
				else
					result+=1;
				break;
			case 'V':
				result+=5;
				break;
			case 'X':
				if(next=='L'){
					result+=40;
					i++;
				}
				else if(next=='C'){
					result+=90;
					i++;
				}
				else
					result+=10;
				break;
			case 'L':
				result+=50;
				break;
			case 'C':
				if(next=='D'){
					result+=400;
					i++;
				}
				else if(next=='M'){
					result+=900;
					i++;
				}
				else
					result+=100;
				break;
			case 'D':
				result+=500;
				break;
			case 'M':
				result+=1000;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
