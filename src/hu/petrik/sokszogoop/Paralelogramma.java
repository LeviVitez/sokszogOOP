package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog{
    private double b;
    private double alfa;

    public Paralelogramma() {

        super(Math.random() * 10 + 5);
        this.b = Math.random() * 10 + 5;
        this.alfa = Math.random() * 178 + 1;
    }

    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.b = b;
        this.alfa = alfa;
    }

    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if (this.alfa < 90.0 || this.alfa > 180.0) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }
    public double getAlfa() {

        return this.alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A paralelogramma nem szerkeszthető!");
        }
    }

    public double getKerulet() {
        return 2.0 * (this.getA() + this.b);
    }

    public double getTerulet() {
        return this.getA() * this.b * Math.sin(Math.toRadians(this.alfa));
    }

    public String toString() {
        return String.format("Paralelogramma: a = %-10.3f b = %-10.3f %s", this.getA(), this.b, super.toString());
    }

}