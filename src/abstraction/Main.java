package abstraction;

public class Main {
    public static void main(String[] args) {
        AbstactChhild a1=new AbstactChhild();
        AbstractTest a2=new AbstactChhild();

        System.out.println(a1);
        a1.delete();
        a1.create();

    }
}
