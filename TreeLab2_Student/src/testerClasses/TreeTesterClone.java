package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTesterClone {

	public static void main(String[] args) throws CloneNotSupportedException { 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		LinkedBinaryTree<Integer> tcopy=t.clone();
		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		Utils.displayTree("The structure of the COPY is: ", tcopy);
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
	}

}
