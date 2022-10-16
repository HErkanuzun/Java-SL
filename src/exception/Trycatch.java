package exception;

public class Trycatch {
    public static void main(String[] args) {
        try{
            int n1 = 0;
            int n2 = 5;
            System.out.println(n2/1);

            func(-5);
        }
        catch (Exception e){
            System.out.println("Sayi sifira bolunemez");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Error");
        }

    }
    public static void func(int birthyear){
        if(birthyear<0){
            throw new IllegalArgumentException("Yanlis sayi");
        }
       System.out.println(2022-birthyear);

    }
}
