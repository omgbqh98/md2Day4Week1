import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input width:");
        double width = scanner.nextDouble();
        System.out.println("input height:");
        double height = scanner.nextDouble();
        THLopHinhChuNhat hinhChuNhat = new THLopHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.getArea());
    }
}
