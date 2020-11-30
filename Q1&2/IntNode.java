public class IntNode{
    public int data;//data to store in a Node
    public IntNode next;//reference to next node

    public IntNode(int data,IntNode node){
        this.data=data;//initializes the consructor
        this.next=node;
    }
    public IntNode getLink(){
        return next;// returns next Node
    }

    public int getData() {
        return data;
    }
    public void setData(int x){
        this.data=x;
    }

    public String toString(){
        return data+"";//prints its data
    }
}