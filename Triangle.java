public class Triangle implements Shape{

  String kind = "Triangle";
  int id;
  int side1;
  int side2;
  int side3;
  String color;

  public Triangle(int i, int s1, int s2, int s3, String c){
    id = i;
    side1 = s1;
    side2 = s2;
    side3 = s3;
    color = c;
  }
  public String toString(){
    return kind+" (ID# "+id+")";
  }
  public String getKind(){
    return kind;
  }
  public String getDetailString(){
    return toString()+"\nSide1: "+side1+"\nSide2: "+side2+"Side3: "+side3+"\nColor: "+color+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
  }
  public int getID(){
    return id;
  }
  public double findArea(){
    double p = (1/2)*findPerimeter();
    return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
  }
  public int findPerimeter(){
    return side1+side2+side3;
  }
}
