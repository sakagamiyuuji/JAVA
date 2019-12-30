public class polymor{

  public static void main(String[] args) {
    Matematika obj1 = new Matematika();
    obj1.perkalian(2,7);
    //obj1.perkalian(2.5,2.2);
    obj1.perkalian(2.2,2.3,2.4);
  }
}

class Matematika{
  public void perkalian(int num1, int num2){
    int result = num1 * num2;
    System.out.println(result);
  }

  public void perkalian(double num1, double num2, double num3){
    double result = num1 * num2 * num3;
    System.out.println(result);
  }
}
