public class op_if3 {

    public static void main(String[] args) {
        boolean merah = false;
        boolean biru = true;
        boolean hijau = true;


        if (merah ^ biru){
            System.out.println("Silahkan Pergi");
        }
        else if (merah && biru){
            System.out.println("tunggu dulu");
        }
        else {
            System.out.println("tidak boleh pergi");
        }
    }
}
