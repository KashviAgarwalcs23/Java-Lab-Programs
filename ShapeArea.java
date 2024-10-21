import java.util.Scanner;
abstract class shape{
int a,b;
abstract double printArea();
void getvalue(){
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
}
void value(){
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
}
}
class Rectangle extends shape{
double printArea(){
return a*b;}
}
class Triangle extends shape{
double printArea(){
return a*b*0.5;}
}
class Circle extends shape{
double printArea(){
return a*a*3.14;}
}

class ShapeArea{
public static void main(String args[]){
Rectangle r = new Rectangle();
System.out.println("enter the values for length and breadth");
r.getvalue();
System.out.println("The area of the rectangle is " + r.printArea());
Triangle t = new Triangle();
System.out.println("enter the values for base and height");
t.getvalue();
System.out.println("The area of the triangle is " + t.printArea());
Circle c = new Circle();
System.out.println("enter the values for radius ");
c.value();
System.out.println("The area of the rectangle is " + c.printArea());
System.out.println("Name: Kashvi Agarwal");
System.out.println("USN: 1BM23CS142");
}
}
