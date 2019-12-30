/*Buatlah program java untuk menentukan suatu bilangan yang dapat diinput
  ketika program di jalankan  adalah bilangan genap atau ganjil */

  public class tugas{

      public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        String read = nilai%2 == 0 ? "Genap" : "Ganjil";
            System.out.println("Ini adalah bilangan " + read );
      }
  }
