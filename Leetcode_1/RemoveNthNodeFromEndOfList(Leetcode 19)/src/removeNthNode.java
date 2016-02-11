
public class removeNthNode {
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head,int n){
		ListNode temp=head;
		int actualLocation=0,length=0;
		while(temp!=null){
			temp=temp.next;
			length++;
		}
		actualLocation=length-n+1;
		temp=head;
		
		if(1==actualLocation){
			if(length==1)
				return null;
			else{
				return head.next;
			}
		}
		
		int count=1;
		while(count!=actualLocation-1){
			temp=temp.next;
			count++;
		}
		ListNode deleteNode=temp.next;
		if(deleteNode!=null)
			temp.next=deleteNode.next;
		else
			temp=null;
		deleteNode=null;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arg={1};
		ListNode head=new ListNode(0);
		ListNode tail=head;
		for(int i=0;i<arg.length;i++){
			tail.next=new ListNode(arg[i]);
			tail=tail.next;
		}
		removeNthFromEnd(head.next,1);
		ListNode temp=head.next;
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
