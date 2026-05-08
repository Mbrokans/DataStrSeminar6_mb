package service;

import dataStr.MyBST;

public class mainService {

	public static void main(String[] args) {
		MyBST<Integer> bStForInt = new MyBST<Integer>();
		try{
			bStForInt.add(12);
			bStForInt.add(75);
			bStForInt.add(20);
			bStForInt.add(35);
			bStForInt.add(10);
			bStForInt.add(23);
			bStForInt.add(57);
			bStForInt.print();
			
			System.out.println("vai koka ir 88? "+ bStForInt.findElement(88));
			System.out.println("Vai ir 10? "+ bStForInt.findElement(10));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
