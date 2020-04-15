package KeThua.BaiTap;

 class Circle {
     double radius;
     String color;

     public Circle() {

     }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public Circle(double radius, String color) {
         this.radius = radius;
         this.color = color;
     }
     double getArea(){
         return Math.pow(this.radius,2)*Math.PI;
     }
     void display(){
         System.out.printf("Hinh Tron Co Ban Kinh: %f Va Mau: %s\nDien Tich: %f\n",this.radius,this.color,this.getArea());
     }
 }
 class Cylinder extends Circle {
     double height;
     public Cylinder(double radius, String color, double height) {
         super(radius, color);
         this.height = height;
     }
     public Cylinder(){
     }
     double getVolume(){
         return this.getArea()*this.height;
     }

     @Override
     void display() {
         System.out.printf("Hinh Tru Co Ban Kinh: %f, Chieu Cao: %f Va Mau: %s\nDien Tich Day: %f\nThe Tich: %f"
                 ,this.radius,this.height,this.color,this.getArea(),this.getVolume());
     }

     public static void main(String[] args) {
         Circle circle = new Circle(6,"red");
         circle.display();
         Cylinder cylinder = new Cylinder(5,"blue",10);
         cylinder.display();
     }
 }
