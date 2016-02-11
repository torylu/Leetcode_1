

public class balancedBinaryTree {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	
	public static int height(TreeNode root,int level){
		if(root==null)
			return level;
		return Math.max(height(root.left,level+1),height(root.right,level+1));
	}
	
	public static boolean isBalanced(TreeNode root){
		if(Math.abs(height(root.left,0)-height(root.right,0))>1)
			return false;
		else{
			if(root.left==null||root.right==root)
				return true;
			else if(isBalanced(root.left)&&isBalanced(root.right))
				return true;
			else 
				return false;
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		System.out.println(isBalanced(root));
	}

}
