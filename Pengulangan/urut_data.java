public class urut_data{

  public static void main(String[] args) {
      int[] data= {3,10,5,50,51,2,4,-2, 6};
      /* Langkah 1;
        - 3,10,5,50,51,2,4,-2, 6
        - cari data paling kecil
        - data paling kecil pindahkan ke index paling awal
      */


for(int index = 0; index <data.length; index++){
      int lowestIndex = index; //lowest index sementara

      // start paling kecil
      for(int i=lowestIndex; i < data.length; i++){
        if(data[lowestIndex] > data[i]){
          lowestIndex=i; //ganti index paling kecil ke i apabila data[i] lebih kecil daripada data[lowestIndex]
        }
      }

      int temp = data[index];
      data[index] = data[lowestIndex]; //2 dipindah ke posisi awal yaitu ke index ke 1
      data[lowestIndex] =temp;

      //end cari paling kecil
      //tukar data
  }

  //untuk menampilkan data yang telah diurutkan
  
  for (int j=0; j < data.length; j++){
    System.out.println(data[j]);
  }
}
}
