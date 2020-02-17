package part_03.chap_06_sparseTable.example_01_initialExample;

public class Lecture {

    String name;
    String shortCut;
    Lecture prev, next;
    GradeList gradesOfTheLecture;

    public Lecture(String name, String shortCut) {
        this(name, shortCut, null, null);
    }

    public Lecture(String name, String shortCut, Lecture prev, Lecture next) {
        this.name = name;
        this.shortCut = shortCut;
        this.prev = prev;
        this.next = next;
        this.gradesOfTheLecture = new GradeList();
    }

    public boolean matchLecture(String name, String shortCut) {
        return shortCut == null ?
                this.name.equalsIgnoreCase(name) :
                this.shortCut.equalsIgnoreCase(shortCut);
    }

    public boolean matchLecture(String name) {
        return matchLecture(name, null);
    }

    int compareTo(Lecture lecture) {
        if (shortCut == null || lecture.shortCut == null) return name.compareToIgnoreCase(lecture.name);
        else return shortCut.compareToIgnoreCase(lecture.shortCut);
    }

    public static void main(String[] args) {

    }

}
