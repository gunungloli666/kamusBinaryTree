package com.semester1.tugas;

import java.util.Random;

public class TreeTest {

	public TreeTest() {
		Tree tree = new Tree();

		String makan = "makan"; String artiMakan = "memasukkan sesuatu ke dalam mulut";
		String minum = "minum"; String artiMinum = "memasukkan air ke dalam mulut";
		String mandi = "mandi"; String artiMandi = "menyiram air ke seluruh badan";
		String mencuci = "mencuci"; String artiMencuci = "membersihkan pakaian dengan air";
		String lari = "lari"; String artiLari = "berjalan dengan cepat di mana kaki melayang";
		String melompat = "melompat"; String artiMelompat = "meninggalkan pijakan di atas tanah";
		String kamus = "kamus"; String artiKamus = "komparasi kata dan arti kata";
		
		
		String ubi = "ubi"; String artiUbi = "tumbuhan yang mirip akar dan rasanya gurih kalo digoreng"; 
		String santan = "santan"; String artiSantan = "sari kelapa berwarna putih seperti susu"; 

		TreeNode root = new TreeNode(kamus, artiKamus);
		root.insert(makan, artiMakan);
		root.insert(minum, artiMinum);
		root.insert(mandi, artiMandi);
		root.insert(mencuci, artiMencuci);
		root.insert(lari, artiLari);
		root.insert(melompat, artiMelompat);
		
//		preorderHelper(root);
//		System.out.println();
		
		String test = root.search(mencuci); 
		System.out.println(test);
	}
	
	
	
	public void preorderHelper(TreeNode node) {
		if (node == null)
			return;
//		System.out.printf("% |%w |", node.data); 
		System.out.print(node.data + "|"); System.out.println(node.keterangan);
		preorderHelper(node.leftNode); 
		preorderHelper(node.rightNode); 
	}
	
	
	

	public static void main(String args[]) {
		
		new TreeTest();

		// int value;
		// Random randomNumber = new Random();
		//
		// System.out.println("Inserting the following values: ");
		//
		// // insert 10 random integers from 0-99 in tree
		// for (int i = 1; i <= 10; i++) {
		// value = randomNumber.nextInt(100);
		// System.out.print(value + " ");
		// tree.insertNode(value);
		// }
		//
		// System.out.println("\n\nPreorder traversal");
		// tree.preorderTraversal();
		//
		// System.out.println("\n\nInorder traversal");
		// tree.inorderTraversal();
		//
		// System.out.println("\n\nPostorder traversal");
		// tree.postorderTraversal();
		// System.out.println();
	}

}
