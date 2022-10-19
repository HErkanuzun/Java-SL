package compozısyon;

public class Akil {
    private Zeka zeka1;
    private Noron noron;

    public Akil(Noron noron){
        this.noron=noron;
    }
    public Akil(Zeka zeka1) {
        this.zeka1 = zeka1;
    }

    public Zeka getZeka1() {
        return zeka1;
    }

    public void setZeka1(Zeka zeka1) {
        this.zeka1 = zeka1;
    }

    public Noron getNoron() {
        return noron;
    }

    public void setNoron(Noron noron) {
        this.noron = noron;
    }
}
