public class prima2{

    /*Cara menetukan Bilangan Prima
      1. Hanya memiliki 2 faktor, dirinya sendiri dan angka1
int[] data = {3, 10, 7, 11,15,16,23,50};
    */

    public static void main(String[] args) {
    int[] data = {3, 10, 7, 11,15,16,23,50};

    for(int index=0; index < data.length; index++){
      int a =data[index];
      boolean prime = true;

        for(int i=2; i<a; i++){
          if(a%i == 0){
            prime =false;
            break;

          }
        }

        if (prime == true && a > 1){
          System.out.println(a+ " adalah BILANGAN PRIMA");
        }

    }
  }
}
