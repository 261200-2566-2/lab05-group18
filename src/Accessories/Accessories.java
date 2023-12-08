package Accessories;

public class Accessories {
    public int Accessorieslevel;
    public double BuffHp, BuffMana,Buff_atk,Buff_def,Buff_runspeed;

    private boolean onecall = true;


    public void getstatusAccessories(){
        if (onecall){
        BuffHp += 0.5*Accessorieslevel;
        BuffMana += 2*Accessorieslevel;
        Buff_runspeed += Accessorieslevel*(0.1*Accessorieslevel) ;
        Buff_atk += 0.4*Accessorieslevel;
        Buff_def += 0.8*Accessorieslevel;
        onecall  = false;
        }


    }
    public void StatusAccessories(){
        getstatusAccessories();
        System.out.print("Level : "+Accessorieslevel+"\n");
        System.out.print("BuffHp : "+BuffHp+"\n");
        System.out.print("BuffMana : "+BuffMana+"\n");
        System.out.print("BuffRunSpeed : "+Buff_runspeed+"\n");
        System.out.print("Buff_atk : "+Buff_atk+"\n");
        System.out.print("Buff_def : "+Buff_def+"\n");

    }

    public void AccessoriesType(){
        System.out.print("AccessoriesType : ");
    }

    public void AttackType(){
        System.out.print("AttackType : ");
    }

    public void JobS(){
        System.out.print("Jobs : ");
    }
}
