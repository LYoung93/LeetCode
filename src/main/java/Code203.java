/**
 * @author liuyang
 * @date 2020/3/15 - 21:38
 */
// 203. 移除链表元素
/*
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
public class Code203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result=new ListNode(0);
        result.next=head;
        ListNode preNode=result,currNode=head;
        while(currNode!=null){
            if(currNode.val==val){
                preNode.next=currNode.next;
            }else {
                preNode=currNode;
            }
            currNode=currNode.next;
        }
        return result.next;
    }
}
