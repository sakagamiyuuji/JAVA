public class op_if2{

  public static void main(String[] args) {
    int nilai = Integer.parseInt(args [0]);
    if (nilai > 75){
        System.out.println("LULUS");
    }
    else if (nilai < 75) {
        System.out.println("TIDAK LULUS");
    }
    else{
      System.out.println("SELAMAT");
    }
  }
}
