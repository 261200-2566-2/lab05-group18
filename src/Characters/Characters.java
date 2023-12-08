package Characters;

public class Characters {
    public int Charlevel;
    public double maxHp, maxMana,base_atk,base_def ,base_runspeed,max_runspeed;


    public void getstatusCharacter(){
        base_runspeed = 10+10*Charlevel;
        maxHp = 100+10*Charlevel;
        maxMana = 50+2*Charlevel;
        max_runspeed = base_runspeed*(0.1+0.03*Charlevel) ;
        base_atk = 35+4*Charlevel;
        base_def = 5+3*Charlevel;


    }
    public void StatusCharacter(){
        getstatusCharacter();
        System.out.print("Level : "+Charlevel+"\n");
        System.out.print("MaxHP : "+maxHp+"\n");
        System.out.print("MaxMana : "+maxMana+"\n");
        System.out.print("MaxRunSpeed : "+max_runspeed+"\n");
        System.out.print("atk : "+base_atk+"\n");
        System.out.print("def : "+base_def+"\n");

    }
    public void GetLevelUp() {
        Charlevel++;
        getstatusCharacter();
    }
    public void AttackDistance(){
        System.out.print("AttackDistance : ");
    }

    public void AttackType(){
        System.out.print("AttackType : ");
    }

    public void JobS(){
        System.out.print("Jobs : ");
    }
}
