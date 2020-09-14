package BTPhuongTrinhBacHai;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a,double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDelta() {

        return  (this.b * this.b) - (4 * this.a * this.c);
    }

    double getRoot1() {

        return  ((-this.b) + Math.sqrt((this.getDelta())))/(2*this.a);
    }

    double getRoot2() {

        return ((-this.b) - Math.sqrt(this.getDelta()))/(2*this.a);
    }


}

