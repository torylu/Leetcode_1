
public class minimumDepth {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	
	public static int minHeight(TreeNode root){
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		return Math.min(minHeight(root.left),minHeight(root.right))+1;
	}
	
	public static int minDepth(TreeNode root){
		if(root.left==null&&root.right==null)
			return 1;
		return Math.min(minHeight(root.left),minHeight(root.right))+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		System.out.println(minDepth(root));
	}

}
