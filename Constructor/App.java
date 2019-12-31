public class App{
      public static void main(String[] args) {
          Box box2 = new Box(1,2,3);
          Box box1 = new Box();
          Box box3 = new Box("BAHAN PEMBUATAN");
          Box box4 = new Box("BAHAN PEMBUATAN", 5,4,6);

          System.out.println(box1.length);
          //System.out.println(box1.length + " dan " + box2.length);
          System.out.println(box4.text + " " + box4.length + " " + box4.height + " " + box4.width);

      }
}

class Box{
    double length, height, width;
    String text;

    public Box(double length, double height, double width){
      this.length = length;
      this.height = height;
      this.width = width;
    }

    public Box(){

    }

    public Box(String text){
      this.text = text;
    }

    public Box(String text, double length, double height, double width){
      this.text = text;
      this.length = length;
      this.height = height;
      this.width = width;
    }
}
