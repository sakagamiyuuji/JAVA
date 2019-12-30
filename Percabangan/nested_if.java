public class nested_if{

    public static void main(String[] args) {
       boolean hujan = false;
       boolean adaPayung = false;

       if(hujan == true){
          if (adaPayung == true){
            System.out.println("silahkan pergi");
          }
          else {
            System.out.println("cari payung");
          }
        }
        else{
          if (adaPayung == true){
            System.out.println("gak efek");
          }
          else {
            System.out.println("aman");
        }

       }
    }
}
