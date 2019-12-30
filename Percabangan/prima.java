public class prima{

    /*Cara menetukan Bilangan Prima
      1. Hanya memiliki 2 faktor, dirinya sendiri dan angka1

    */

    public static void main(String[] args) {

  try{
        int bil = Integer.parseInt(args[0]);
        int faktor = 0;
        int i;

        for(i=1;i<=bil;i++){
          if(bil%i == 0){
            faktor++;
          }
        }
        if(faktor==2){
          System.out.println(" == PRIMA ==");
        }
        else{
          System.out.println(" == BUKAN PRIMA == ");
        }
      }

      catch (Exception e){
          System.out.println (" -------------- NILAI TIDAK VALID ----------------");
      }
}
}
