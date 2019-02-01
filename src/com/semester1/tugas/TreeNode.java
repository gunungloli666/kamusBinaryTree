package com.semester1.tugas;

public class TreeNode {

	TreeNode leftNode;
	// int data;
	String data;
	TreeNode rightNode;
	String keterangan;

	public TreeNode(String nodeData, String nodeKeterangan) {
		data = nodeData;
		keterangan = nodeKeterangan;
		leftNode = rightNode = null;
	}

	public void insert(String insertValue, String keterangan) {

		if (insertValue.compareTo(data) > 0) {
			if (leftNode == null)
				leftNode = new TreeNode(insertValue, keterangan);
			else
				leftNode.insert(insertValue, keterangan);
		} else if (insertValue.compareTo(data) < 0) {

			if (rightNode == null)
				rightNode = new TreeNode(insertValue, keterangan);
			else
				rightNode.insert(insertValue, keterangan);
		}
	}

	public String search(String searchKeyWord) {
		if (this.data.equals(searchKeyWord)) {
			return "arti kata: "+ data + " adalah: "+keterangan;
		} else {
			if (searchKeyWord.compareTo(data) > 0) {
				if (leftNode != null) {
					return leftNode.search(searchKeyWord);
				}
			} else if (searchKeyWord.compareTo(data) < 0) {
				if (rightNode != null) {
					return rightNode.search(searchKeyWord);
				}
			}
		}
		return "not found";
	}
}
