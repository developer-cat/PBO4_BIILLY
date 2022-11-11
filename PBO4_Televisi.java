//Billy Achmad Bachrudin_20210040100_TI21F
//Program sederhana untuk menampilkan acara TV

import java.util.ArrayList;

public class PBO4_Televisi{
    private String nama;
    private int tahun;
    private int nomor_ch;
    public ArrayList<String> saluran = new ArrayList<>();
    public ArrayList<String> acara = new ArrayList<>();

    //Overloading Constructor
    PBO4_Televisi(){
        setChannel();
    }
    PBO4_Televisi(String nama){
        this.nama = nama;
        setChannel();
    }
    PBO4_Televisi(String nama, int tahun){
        this.nama = nama;
        this.tahun = tahun;
        setChannel();
    }
   
    public void setChannel(){
        this.saluran.add("TVRI");
        this.saluran.add("NET");
        this.saluran.add("MetroTV");
    }

    public void getChannel(int nomor_ch){
        System.out.println("");
        if(nomor_ch > 0 && nomor_ch <= saluran.size()){
            System.out.println("Menampilkan saluran nomor " + nomor_ch + ", Channel " + saluran.get(nomor_ch-1));
        }
        else{
            System.out.println("Saluran nomor " + nomor_ch + " Tidak Ditemukan. ");
            System.out.println("Saluran tv hanya ada " + saluran.size());
            System.out.println("Lihat daftar Saluran di menu infoChannel");
        }
              
    }

    public void infoChannel(){
        System.out.println("");
        System.out.println("Saluran : ");
        System.out.println("=========");
        for(int i = 0; i < saluran.size(); i++){
            System.out.println((i + 1) + " " + saluran.get(i));
        }
    }
}

class channelIndovision extends PBO4_Televisi{

    channelIndovision(String nama){
        super(nama);
    }
    channelIndovision(String nama, int tahun){
        super(nama, tahun);
    }
    channelIndovision(){
        super();
    }

    //Overriding Method
    @Override
    public void setChannel(){
        super.setChannel();
        this.saluran.add("National Geographic");
        this.saluran.add("Cartoon Network");
    }

    @Override
    public void getChannel(int noAcara){
        super.getChannel(noAcara);
    }

    @Override
    public void infoChannel(){
        System.out.println("");
        System.out.println("Channel TV Indovision");
        super.infoChannel();
    }


    public static void main(String[] args) {
        PBO4_Televisi Toshiba = new PBO4_Televisi("Toshiba", 2018);
        channelIndovision Sharp = new channelIndovision("HDTV");
        Sharp.infoChannel();
        Sharp.getChannel(5);
        System.out.println("\n");
        Toshiba.infoChannel();
        Toshiba.getChannel(5);
    }
}