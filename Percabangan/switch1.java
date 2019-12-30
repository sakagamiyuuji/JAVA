public class switch1{

    public static void main(String[] args) {
      String bulan ="Selasa";

      switch(bulan){
        case "Senin":
        System.out.println("upacara");
        break;
        case "Selasa":
        System.out.println("olahraga");
        break;
        default:
        System.out.println("LIBUR");
        break;
      }
    }
}
