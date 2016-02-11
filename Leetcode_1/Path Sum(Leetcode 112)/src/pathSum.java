import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;




public class pathSum {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	
	public static boolean hasPathSum(TreeNode root,int sum){
		Queue <TreeNode>q=new LinkedList<TreeNode>();
		q.add(root);
		List<Integer> list=new ArrayList<Integer>();
		while(q.peek()!=null){
			TreeNode temp=q.poll();
			if(temp.left!=null){
				temp.left.val+=temp.val;
				q.add(temp.left);
			}
			if(temp.right!=null){
				temp.right.val+=temp.val;
				q.add(temp.left);
			}
			if(temp.left==null&temp.right==null)
				list.add(temp.val);
		}
		Iterator i=list.iterator();
		while(i.hasNext()){
			int compare=(int) i.next();
			if(sum==compare)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(-2);
		root.right=new TreeNode(-3);
		System.out.println(hasPathSum(root,-5));
	}

}
