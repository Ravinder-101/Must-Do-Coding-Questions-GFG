class Solution
{
    int getMiddle(Node head)
    {
         Node slow = head;
         Node fast = head;
         while(fast.next!=null && fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
         }
         Node temp = head;
         int size =0;
         while(temp!=null){
             temp = temp.next;
             size++;
         }
         if(size%2==0){
           return  slow.next.data;
         }else{
             return slow.data;
         }
    }
