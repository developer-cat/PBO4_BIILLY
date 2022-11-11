//Billy Achmad Bachrudin_20210040100_TI21F
//Program untuk mencari rumus tabung dengan inputan berupa data integer atau double

public class PBO4_Lingkaran{
    double jari2;
    double luas_lingkaran;

    //Overloading Constructor
    PBO4_Lingkaran(int jari2){
        if(getJari2()% 7 == 0){
            this.luas_lingkaran = 22 * jari2  * jari2 / 7;
        }
        else{
            this.luas_lingkaran = 3.14 * jari2 * jari2;
        }
    }
    
    PBO4_Lingkaran(double jari2){
        if(getJari2() % 7 == getJari2()){
            this.luas_lingkaran = 22 * jari2 * jari2 / 7;
        }
        else{
            this.luas_lingkaran = 3.14 * jari2 * jari2;
        }
    }

    public double getJari2(){
        return this.jari2;
    }
    
    public void info(){
        System.out.println("Luas lingkaran dengan jari-jari " + getJari2() + " : " + String.format("%.2f %n", this.luas_lingkaran));
    }
}

class Tabung extends PBO4_Lingkaran{
    double tinggi;
    double volume;

    //Overloading Constructor
    Tabung(int jari2, int tinggi){
        super(jari2);
        this.jari2 = jari2;
        this.tinggi = tinggi;
        volume = luas_lingkaran * tinggi;
    }
    Tabung(int jari2, double tinggi){
        super(jari2);
        this.jari2 = jari2;
        this.tinggi = tinggi;
        volume = luas_lingkaran * tinggi;
    }
    Tabung(double jari2, int tinggi){
        super(jari2);
        this.jari2 = jari2;
        this.tinggi = tinggi;
        volume = luas_lingkaran * tinggi;
    }
    Tabung(double jari2, double tinggi){
        super(jari2);
        this.jari2 = jari2;
        this.tinggi = tinggi;
        volume= luas_lingkaran * tinggi;
    }

    //Overriding method
    @Override
    public void info(){
        super.info();
        System.out.println("Volume Tabung dengan tinggi "+this.tinggi+" : "+String.format("%.2f %n", this.volume));
        System.out.println("");
    }
    public static void main(String[] args) {
        Tabung tabung_1 = new Tabung(1.5, 8.5);
        Tabung tabung_2 = new Tabung(15, 4);
        tabung_1.info();
        tabung_2.info();
    }
}
