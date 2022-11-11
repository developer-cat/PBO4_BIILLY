//Billy Achmad Bachrudin_20210040100_TI21F
/*Program untuk mengetahui info karakter dari sebuah game, lalu menerapkan polimorfisme
dengan menambahkan statistik kepada turunan kelasnya*/

public class PBO4_Champion {
    private String name;
    private double health_points;
    private double attack_dmg;

    //Overloading Constructor
    PBO4_Champion(String name, double health_points, double attack_dmg){
        this.name = name;
        this.health_points = health_points;
        this.attack_dmg = attack_dmg;
    }
    PBO4_Champion(String name){
        this.name = name;
        this.health_points = 598;
        this.attack_dmg = 54;
    }

    public String getName(){
        return this.name;
    }

    public double getHP(){
        return this.health_points;
    }

    public double getDMG(){
        return this.attack_dmg;
    }

    public void infoChamp(){
        System.out.println("Champion " + getName() + " : ");
        System.out.println("-Health Points : " + getHP());
        System.out.println("-Attack Damage : " + getDMG());
    }
}

class Ranged extends PBO4_Champion{
    private double critical_dmg = 2.0;
    private double basic_atk;
    Ranged(String name, double health_points, double attack_dmg){
        super(name, health_points, attack_dmg);
        setBasicATK();
    }
    Ranged(String nama){
        super(nama);
        setBasicATK();
    }

    public double getCritDMG(){
        return this.critical_dmg;
    }
    
    public void setBasicATK(){
        this.basic_atk = getDMG() + (getDMG() * getCritDMG());
    }

    public double getBasicATK(){
        return this.basic_atk;
    }
    
    //Overriding Method
    
    //Untuk Champion Ranged mendapatkan tambahan damage sebesar 2.0  
    @Override
    public void infoChamp(){
        System.out.println("Champion " + getName() + " :");
        System.out.println("-Health Points : " + getHP());
        System.out.println("-Attack Damage: " + getBasicATK());
    }

    public static void main(String[] args) {
        Ranged Teemo = new Ranged("Teemo");
        Teemo.infoChamp();
    }

}