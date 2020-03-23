package com.thinksys.mm.leetcode.addTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode o= l1;
        ListNode p= l2;
        
        ListNode newListNode = new ListNode(0);
       
        if(o==null&&p==null){
            return newListNode;
        }
        if(o==null&&p!=null){
            return p;
        }
        if(p==null&&o!=null){
            return o;
        }

        ListNode curr = newListNode;
        int c = 0;
        int x=0;
        int y=0;
        int sum = 0;
        while (o!=null&&p!=null){
            x=o.getVal();
            y=p.getVal();
            sum=x+y+c;
            if(sum>=10) {
                sum=x+y+c-10;                
                c=1;
            } else{
                sum = x+y+c;                
                c=0;
            } 
            curr.setNext(new ListNode(sum));
            curr = curr.getNext();
            o=o.getNext();
            p=p.getNext();
        }
        if(o==null&&p!=null)
        {
            if(c==0){
                curr.setNext(p);
            }
            else{
                while (p!=null){
                    y=p.getVal();
                    sum=y+c;
                    if(sum>=10) {
                        sum=y+c-10;                
                        c=1;
                    } else{
                        sum = y+c;                
                        c=0;
                    } 
                    curr.setNext(new ListNode(sum));
                    curr = curr.getNext();
                    p=p.getNext();
                }
            }
        }

        if(o!=null&&p==null)
        {
            if(c==0){
                curr.setNext(o);
            }
            else{
                while (o!=null){
                    y=o.getVal();
                    sum=y+c;
                    if(sum>=10) {
                        sum=y+c-10;                
                        c=1;
                    } else{
                        sum = y+c;                
                        c=0;
                    } 
                    curr.setNext(new ListNode(sum));
                    curr = curr.getNext();
                    o=o.getNext();
                }
            }
        }

        if(p==null&&o==null&&c==1){
            curr.setNext(new ListNode(1));
        }
        return newListNode.getNext();
    }
}
