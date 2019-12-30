public class coba_prima{

    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int z;
        boolean pr = true;
        int input2 = input/2;

        for (int x = 1; x < input2; x++){ // x=pembagi
            z = input%x;
            pr = false;
            break;
          }

            if(pr && ((input > 0) && (input != 1))){
              System.out.println("PRIMA");
            }
            else
              System.out.println("Bukan PRIMA");
}
}
