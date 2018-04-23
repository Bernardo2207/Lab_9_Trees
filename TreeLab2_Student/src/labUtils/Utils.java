package labUtils;

import java.util.Iterator;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 1
		t.addRoot(4);
		Position<Integer>c1L=t.addChild(t.root(), 9);
		Position<Integer>c1R=t.addChild(t.root(), 20);
		t.addChild(c1L, 7);
		t.addChild(c1L, 10);
		
		Position<Integer> c2L=t.addChild(c1R, 15);
		Position<Integer> c2R=t.addChild(c1R, 21);
		t.addChild(c2L, 12);
		Position<Integer>c3R=t.addChild(c2L, 17);
		t.addChild(c3R, 19);
		
		Position<Integer>c4R=t.addChild(c2R, 40);
		t.addChild(c4R, 30);
		t.addChild(c4R, 45);
		
		
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer>c1L=t.addLeft(t.root(), 9);
		Position<Integer>c1R=t.addRight(t.root(), 20);
		t.addLeft(c1L, 7);
		t.addRight(c1L, 10);
		
		Position<Integer> c2L=t.addLeft(c1R, 15);
		Position<Integer> c2R=t.addRight(c1R, 21);
		t.addLeft(c2L, 12);
		Position<Integer>c3R=t.addRight(c2L, 17);
		t.addLeft(c3R, 19);
		
		Position<Integer>c4R=t.addRight(c2R, 40);
		t.addLeft(c4R, 30);
		t.addRight(c4R, 45);
		
		
		
		
		return t; 
	}


}
