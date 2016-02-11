
public class mergeTwoSortedLists {
	
	 public static class ListNode{
		 int val;
		 ListNode next;
		 ListNode(int x){
			 val=x;
		 }
	 }
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1==null)
	            return l2;
	        else if(l2==null)
	            return l1;
	        ListNode newList=new ListNode(0),tail=newList,temp;
	        while(l1!=null&&l2!=null){
	            if(l1.val<=l2.val){
	                temp=new ListNode(l1.val);
	                l1=l1.next;
	            }
	            else{
	                temp=new ListNode(l2.val);
	                l2=l2.next;
	            }
	            tail.next=temp;
	            tail=tail.next;
	        }
	        if(l1==null){
	            while(l2!=null){
	                temp=new ListNode(l2.val);
	                tail.next=temp;
	                tail=tail.next;
	                l2=l2.next;
	            }
	        }
	        if(l2==null){
	            while(l1!=null){
	                temp=new ListNode(l1.val);
	                tail.next=temp;
	                tail=tail.next;
	                l1=l1.next;
	            }
	        }
	        return newList.next;
	    }
	
	public static void main(String []args){
		ListNode l1=new ListNode(1),tail1=l1;
		ListNode l2=new ListNode(2),tail2=l2;
		int []list1={1};
		int []list2={2};
		for(int i=0;i<list1.length;i++){
			ListNode temp=new ListNode(list1[i]);
			tail1.next=temp;
			tail1=tail1.next;
		}
		for(int i=0;i<list2.length;i++){
			ListNode temp=new ListNode(list2[i]);
			tail2.next=temp;
			tail2=tail2.next;
		}
		ListNode newList=mergeTwoLists(l1.next,l2.next);
		while(newList!=null){
			System.out.println(newList.val);
			newList=newList.next;
		}
	}
}
