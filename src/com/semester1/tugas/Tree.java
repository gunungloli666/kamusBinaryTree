package com.semester1.tugas;




public class Tree {
	private TreeNode root;

	
	public Tree() {
		root = null;
	} // end Tree no-argument constructor
	
	public String cariKata(String kata) {

		if (root != null) {

		}

		return null;
	}
	
	public void insertNode(String insertValue, String keterangan) {
		if (root == null)
			root = new TreeNode(insertValue , keterangan); 
		else
			root.insert(insertValue , keterangan); 
	} 

	
	public void preorderTraversal() {
		preorderHelper(root);
	} 

	
	private void preorderHelper(TreeNode node) {
		if (node == null)
			return;

		System.out.printf("%d ", node.data); 
		preorderHelper(node.leftNode); 
		preorderHelper(node.rightNode); 
	} 

	
	public void inorderTraversal() {
		inorderHelper(root);
	} 

	
	private void inorderHelper(TreeNode node) {
		if (node == null)
			return;

		inorderHelper(node.leftNode); 
		System.out.printf("%d ", node.data); 
		inorderHelper(node.rightNode); 
	} 

	
	public void postorderTraversal() {
		postorderHelper(root);
	} 

	
	private void postorderHelper(TreeNode node) {
		if (node == null)
			return;

		postorderHelper(node.leftNode); 
		postorderHelper(node.rightNode); 
		System.out.printf("%d ", node.data); 
	} 
} 
