package Accessories;

import Accessories.Head.Earring;

public class EpicITEM extends Accessories {
    private boolean IsEpicITEM = false;

    private boolean CallEpic = true;

    public boolean UseEpicITEM() {
        return IsEpicITEM;
    }

    public void NormalOREpic(boolean x){
        if (x){
            System.out.println("EpicITEM : YES!");
        }
        else {
            System.out.println("EpicITEM : NO!");
        }
    }

    public void GetEpicITEM(){
        if (CallEpic){
            Buff_atk += 0.1*(Buff_atk);
            Buff_def += 0.1*(Buff_def);
            BuffHp += 0.1*(BuffHp);
            BuffMana += 0.1*(BuffMana);
            Buff_runspeed += 0.1*(Buff_runspeed);
            CallEpic = false;
            IsEpicITEM = true;
        }
    }
}
