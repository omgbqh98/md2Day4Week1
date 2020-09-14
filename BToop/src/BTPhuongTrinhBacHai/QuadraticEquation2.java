package BTPhuongTrinhBacHai;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        double a = scanner.nextDouble();
        System.out.println("input b: ");
        double b = scanner.nextDouble();
        System.out.println("input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation Quadratic = new QuadraticEquation(a,b,c);
        if (Quadratic.getDelta() > 0) {
            System.out.println("co 2 nguyem la: " + Quadratic.getRoot1()+" va: " + Quadratic.getRoot2());
        } else if (Quadratic.getDelta() == 0) {
            System.out.println("co 1 ng la: " + Quadratic.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }


}
