package com.thinksys.mm.leetcode;

import com.thinksys.mm.leetcode.addTwoNumbers.ListNode;
import com.thinksys.mm.leetcode.addTwoNumbers.Solution;

public class TestAddTwoNumbers {

	public static void main(String[] args) {
		ListNode n1= new ListNode(0);
		ListNode n21= new ListNode(1);
		ListNode n22= new ListNode(8);
		n21.setNext(n22);
		Solution s = new Solution();
		ListNode r = s.addTwoNumbers(n1, n21);
		System.out.println("r.val==="+r.getVal());
		System.out.println("r.next.val==="+r.getNext().getVal());
		
	}

}
