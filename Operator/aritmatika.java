public class aritmatika{

    public static void main(String[] args) {
      //deklarasi
        int tambah, kurang, kali, bagi, mod, plusplus;
        int a = 10;
        int b = 5;
        int c = 11;

      //rumus
        tambah = a + b;
        kurang = a - b;
        kali   = a * b;
        bagi   = a / b;
        mod    = c % b;


      //Execute
        System.out.println("a + b = " + tambah);
        System.out.println("a - b = " + kurang);
        System.out.println("a x b = " + kali);
        System.out.println("a / b = " + bagi);
        System.out.println("c mod b = " + mod);
        System.out.println();
        System.out.println("a ++ ="  + ++a);
        System.out.println(a);


    }
}
