 // imolementation of the linked list , be pracitcaly associated
 class linkedlist{
    node head ;
    class node{
        int data;
        node next;
        node (int data){
            this.data=data;
            this.next=null;
        }
    }
    // implementation of the insertion at the end in the linked list 
    public void insertAtend(int newdata){
        node newnode = new node (newdata);
        //checking wheatherthe node is empty or not 
        // list is empty 
        if (head ==null){
           head = newnode; // now head is pointing to the node we created 
           return ;
        }
        // linked list is not empty 
        newnode.next = null;
        node temp = head ; // created the new temp refernce variable of type node which assigh the value which head has 
        while(temp.next != null)// till we reached the last node
        {
           //increment of the node 
           temp= temp.next ;
        }
        // now the temp is at the end 
        temp.next = newnode;
        return;
    }
// insertion at the beginning 
public void insertAtbeggin(int newdata){
   node newnode = new node(newdata);
    newnode.next=head;
    head= newnode;

}
// function to display the list 
public void displayll(){
    node current= head;
    while (current !=null)
    {
        System.out.print(current.data +"  "); // displaying the elments of the list 
        current=current.next; //incrementation 

    }
    System.out.println();
}
    
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtend(6);
        list.insertAtend(2);
        list.insertAtend(2);
        list.insertAtbeggin(5);
        list.insertAtbeggin(10);
        list.displayll();
        
    }
 }