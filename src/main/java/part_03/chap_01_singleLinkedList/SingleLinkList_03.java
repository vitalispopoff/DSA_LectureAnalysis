package main.java.part_03.chap_01_singleLinkedList;

public class SingleLinkList_03 extends SingleLinkList_01 {

    @Override
    public int deleteFromHead() throws NullPointerException{

        try{
            int result = head.info;
            if(head==tail)
                head=tail=null;
            else head = head.next;
            return result;
        } catch (NullPointerException e){
            System.out.println("the list was empty");
            return 0;
        }
    }

    public static void main(String[] args) {



    }

}
