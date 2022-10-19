package compozısyon;

public class Kafa {
    public static void main(String[] args) {
        Zeka Z1 = new Zeka(94);
        Noron n2 = new Noron("Duvari");
        Akil A1 = new Akil(Z1);
        A1.getZeka1().getValue();

        Insan insan1=new Insan(A1);
        insan1.getAkil().getZeka1().getValue();



        Akil A2 = new Akil(Z1);
        Akil A3 =new Akil(n2);

        insan1.getAkil().getNoron().getHucre();

        Insan insan2=new Insan(A2);

    }
}
