package part_01.chap_08_exercises.exc_06;

class SomeInfo {

    private int n;

    SomeInfo(int n){
        this.n = n;
    }

    @Override
    public boolean equals(Object obj) {return super.equals(obj);}

    public boolean equals(SomeInfo si){
        return n == si.n;
    }

    public static void main(String[] args) {
        int i = 0, j = 1;
        SomeInfo a = new SomeInfo(i), b = new SomeInfo(i), c = new SomeInfo(j);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
    }

}
