public class array2{

  public static void main(String[] args) {
      int[] data= {10,34,5,23,6,7,55,20,260,273,333};

      for (int i = 0; i < data.length; i++){
        int x = data[i];
        if (x%2 != 0){
          System.out.println(x);

        }
      }
  }
}
