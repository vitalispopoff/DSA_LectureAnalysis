package part_03.chap_06_sparseTable.example_01_initialExample;

public class Lecture {

    String name;
    String shortCut;
    Lecture prev, next;
    Grade head, tail;

    public Lecture(String name){
        this(name, null, null, null, null, null);
    }

    public Lecture(String name, String shortCut){
        this(name, shortCut, null, null, null, null);
    }

    public Lecture(String name, Lecture prev) {
        this(name, null, prev, null, null, null);
    }

    public Lecture(String name, String shortCut, Lecture prev) {
        this(name, shortCut, prev, null, null, null);
    }

    public Lecture(String name, String shortCut, Lecture prev, Lecture next, Grade head, Grade tail) {
        this.name = name;
        this.shortCut = shortCut;
        this.prev = prev;
        this.next = next;
        this.head = head;
        this.tail = tail;
    }

    public boolean matchLecture(String name, String shortCut){
        return shortCut == null?
                this.name.equalsIgnoreCase(name) :
                this.shortCut.equalsIgnoreCase(shortCut) ;
    }

    public boolean matchLecture(String name){
        return matchLecture(name, null);
    }
}
