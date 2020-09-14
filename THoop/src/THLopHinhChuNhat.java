public class THLopHinhChuNhat {
    private double width;
    private double height;

    THLopHinhChuNhat (double width,double height){
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width*this.height;
    }

     double getPerimeter() {
        return (this.width + this.height)*2;
    }

    public String display() {
        return "Hinhchunhat {" + "width=" + width + "height=" + height;
    }




}

