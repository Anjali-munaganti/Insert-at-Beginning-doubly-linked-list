class DLL{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            prev=null;
            next=null;
        }
    }
    
    public void InsertintoBeginning(int data){
        Node newNode= new Node(data);
        if(head!=null)
        {
            newNode.next=head;
            head.prev=newNode;
        }
        head=newNode;
    }
   public void display()
   {
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
       System.out.println();
   }
   public static void main(String args[])
   {
       DLL list= new DLL();
       list.InsertintoBeginning(100);
       list.InsertintoBeginning(200);
       list.InsertintoBeginning(300);
       list.display();
   }
   
   
    
}