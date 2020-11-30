public class Q1 {
    public static void main(String[] args){
        int[] testData = {1,2,3,4,5};
        IntLinkList list = new IntLinkList(testData);
        System.out.println(list.toString());
        IntLinkList emptyList=new IntLinkList();
        System.out.println(emptyList.empty());
        System.out.println(list.empty());
        System.out.println(list.first());
        System.out.println(emptyList.first());

        int[] testData2 = {1,2,3,4,5};
        IntLinkList list2 = new IntLinkList(testData2);
        list2.removeFirst();
        System.out.println(list2.toString());

        IntLinkList clone1=list.clone();
        IntLinkList clone2=list2.clone();
        System.out.println(clone1.toString());
        System.out.println(clone2.toString());

        int[] testData3 = {1,2,3,4,5};
        IntLinkList list3 = new IntLinkList(testData3);
        int[] testData4 = {2,3,4,5};
        IntLinkList list4 = new IntLinkList(testData4);
        System.out.println(list.equals(list3));
        System.out.println(list.equals(list4));
        System.out.println(clone2.equals(list4));

    }
}
