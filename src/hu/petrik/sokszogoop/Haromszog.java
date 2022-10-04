package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    private boolean isSzerkesztheto(){
        boolean szerkesztheto= true;
        if ((this.getA()+this.b)<=this.getC() ||
                (this.getA()+this.getC())<=this.getB() ||
                (this.getB()+this.getC())<= this.getC()){
            szerkesztheto=false;
        }

        return szerkesztheto;
    }

    public  double getKerulet(){
    return this.getA()+this.getB()+this.getC();
    }

    private double getS(){
        return getKerulet()/2;
    }

    public double getTerulet(){
        return Math.sqrt(this.getS()*(this.getS()-this.getA())*(this.getS()-this.getB())*(this.getS()-this.getC()));
    }

    @Override
    public String toString() {
        //TODO: to string hozzáadása
        return "";
    }
}
