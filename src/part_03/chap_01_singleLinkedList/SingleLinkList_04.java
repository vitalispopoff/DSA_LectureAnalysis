package part_03.chap_01_singleLinkedList;

public class SingleLinkList_04 {

    protected SingleLinkNode_04 head = null;

//    public SingleLinkList_04() {}

    public boolean isEmpty() {
        return head == null;
    }

    public Object first() {
        return head.info;
    }

    public void printAll(java.io.PrintStream out) {
        for (SingleLinkNode_04 temporal = head; temporal != null; temporal = temporal.next)
            out.print(temporal.info);   // info is an Object object - we avoid casting.
    }

    public void add(Object element) {
        head = new SingleLinkNode_04(element, head);
    }

    public Object find(Object element) {
        SingleLinkNode_04 temporal = head;
        for (; temporal != null && !element.equals(temporal.info); temporal = temporal.next) ;
        if (temporal == null)
            return null;
        else return temporal.info;
    }

    public Object deleteHead(){
        Object element = head.info;
        head = head.next;
        return element;
    }

    public void delete (Object element){
        if (head != null)
            if (element.equals(head.info))
                head = head.next;
            else{
                SingleLinkNode_04 precursor = head, temporal = head.next;
                for(; temporal != null && !(temporal.info.equals(element));
                    precursor = precursor.next, temporal = temporal.next);
                if(temporal !=null)
                    precursor.next = temporal.next;
            }
    }



}
