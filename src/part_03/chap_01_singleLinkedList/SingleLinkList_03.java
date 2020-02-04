package part_03.chap_01_singleLinkedList;

public class SingleLinkList_03 extends SingleLinkList_01 {

    @Override
    public int deleteFromHead() throws NullPointerException{
        int result = 0;
        try{
//            result = deleteFromHead();
            {result = head.info;
            if(head==tail)
                head=tail=null;
            else head = head.next;}
        } catch (NullPointerException e){
            System.out.println("the list was empty");
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
