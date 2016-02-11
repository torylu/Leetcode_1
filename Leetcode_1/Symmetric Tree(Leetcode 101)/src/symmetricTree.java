
public class symmetricTree {

	public static class TreeNode{
		String val;
		TreeNode left,right;
		TreeNode(String x){
			val=x;
		}
	}
	
	public void reverse(TreeNode root){
		if(root==null)
			return ;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		reverse(root.left);
		reverse(root.right);
	}
	
	public static boolean compareNode(TreeNode root1,TreeNode root2){
		if(root1==null&&root2==null)
			return true;
		else if(root1==null||root2==null)
			return false;
		if(root1.val==root2.val){
			boolean leftResult=compareNode(root1.left,root2.left);
			boolean rightResult=compareNode(root1.right,root2.right);
			if(leftResult==true&&rightResult==true)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean isSymmetric(TreeNode root){
		if(root==null)
			return true;
		if(root.left==null&&root.right==null)
			return true;
		else if(root.left==null||root.right==null)
			return false;
		boolean result=compareNode(root.left,root.right);
		return result;
	}
	
	public static void preOrder(TreeNode root){
		if(root==null)
			return ;
		else{
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []nums={"1","2","2",null,"3",null,"3"};
		TreeNode root=new TreeNode(nums[0]);
		TreeNode temp=root;
		for(int i=0;i<nums.length;i++){
			if(2*i+2<nums.length){
				temp.left=new TreeNode(nums[2*i+1]);
				temp.right=new TreeNode(nums[2*i+2]);
			}
			else if(nums.length>2*i+1)
				temp.left=temp.right=null;
			else if(nums.length==2*i+2){
				temp.left=new TreeNode(nums[2*i+1]);
				temp.right=null;
			}
		}
		preOrder(root);
		System.out.println(isSymmetric(root));
	}

}
