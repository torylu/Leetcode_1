import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zigzag {

	public static String convert(String s,int numRows){
		List<String> temp=new ArrayList<String>();
		int theCurrentRow=0;
		int direction=0;//0 stands for increase of the row, 1 stands for decrease of the row.
		for(int i=0;i<numRows;i++){
			temp.add("");
		}
		for(int i=0;i<s.length();i++){
			String str = temp.get(theCurrentRow);
			str=str+s.charAt(i);
			temp.set(theCurrentRow,str);
			if(theCurrentRow<numRows-1&&direction==0){
				theCurrentRow++;
				if(theCurrentRow==numRows-1)
					direction=1;
			}
			else if(theCurrentRow>0&&direction==1){
				theCurrentRow--;
				if(theCurrentRow==0)
					direction=0;
			}
		}
		Iterator i=temp.iterator();
		String result="";
		while(i.hasNext()){
			String j=(String) i.next();
			result+=result+j;
		}
		return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=convert("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers."
,55);
		System.out.println(result);
	}

}
