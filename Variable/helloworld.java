public class helloworld {
    public static void main(String args[]){
        System.out.println("Halo Dunia !");
        mobil bmw = new mobil();
        bmw.merk = "Mobil BMW i3000";
        bmw.maju();

        mobil FordShelby = new mobil();
        FordShelby.merk = "Mobil Fordshelby";
        FordShelby.maju();

        if(args.length == 0){
            System.out.println("No Input Detected");
        }
        else
            {System.out.println(args[1}args[0]);
        }
    }
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+"Maju... !!! Brmmm...");

    }
}
