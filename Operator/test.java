public class test{

    public static void main(String[] args) {

    try {

    int input = Integer.parseInt(args[0]);

    if (input >= 85  && input <= 100){
        System.out.println("Grade A");
    }
    else if (input >=75 && input <= 84){
        System.out.println("Grade B");
    }
    else if (input >=65 && input <= 74){
        System.out.println("Grade C");
    }
    else if (input >=45 && input<= 64){
        System.out.println("Grade D");
    }
    else if (input >=0 && input <= 44){
        System.out.println("Grade E");
    }
    else{
        System.out.println ("NILAI TIDAK VALID");
      }
    }
    catch(Exception e){
        System.out.println ("NILAI TIDAK VALID");
      }

    }
  }
