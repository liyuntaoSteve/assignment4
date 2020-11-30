/**
 * A class to hold a list of int data, by
 * storing them as a linked list.
 */
public class IntLinkList {
  
  private IntNode top; //The reference to the first Node

  public IntLinkList(int[] data){
    for(int i=data.length-1;i>=0;i--){
      add(data[i]);//add them from the last to get exact results
    }
  }
  public boolean empty(){
    return top==null;//return true in top is null
  }
  public int first(){
    if(top!=null)
      return top.data;//return first integer if not null
    else
      return -1;//else return -1
  }
  public void removeFirst(){
    if(top!=null){
      top=top.next;//remove the first item but making top point to next
    }
  }
  public IntLinkList clone(){
    IntLinkList newNodeList=new IntLinkList();
    IntNode next=top;
    while(next!=null){//while node is not null
      newNodeList.ordInsert(next.data);//order Insert to new list
      next=next.getLink();//iterate to next pointer
    }
    return newNodeList;//returns the new list
  }
  public void ordInsert(int newItem){

    IntNode curr;
    IntNode temp=new IntNode(newItem,null);//make 2 pointers
    if(top==null || top.getData()>=newItem){
      //set top to it
      temp.next=top;
      top=temp;
    }else{
      curr=top;
      while(curr.next!=null && curr.next.getData()<temp.getData()){
        curr=curr.next;//find the perfect location
      }
      //set the temps and curr to it
      temp.next=curr.next;
      curr.next=temp;
    }
  }
  public boolean equals(IntLinkList other){return equals(top,other.top);}

  private boolean equals(IntNode top1, IntNode top2) {
    if(top1==null && top2==null){
      return true;//if both poijnt to null
    }
    if(top1!=null && top2!=null){
      //if they match, and proceed to next
      return top1.data==top2.data && equals(top1.next,top2.next);
    }
    return false;
  }

  //=========== Supplied code =============================
  
  public IntLinkList() {
    //A constructor that creates an empty list.
    top = null;
  }
  
  public void add(int newItem) {
    //Add the newItem at the FRONT of the list.
    top = new IntNode(newItem,top);
  }//add
  
  public String toString() {
    String answer = "<<";
    IntNode next = top;
    while(next!=null){
      answer += next.getData()+" ";
      next = next.getLink();
    }
    return answer+">>";
  }

  // just ignore this, its part of the marking process. 
  public void mult2(){
    IntNode next = top;
    while(next!=null){
      next.setData(2*next.getData());
      next = next.getLink();
    }//while
  }//mult2()
  
}

