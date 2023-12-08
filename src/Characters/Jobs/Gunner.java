package Characters.Jobs;

import Characters.ClassCharacters.Archer;
public class Gunner extends Archer {
    public final String jobs = "Gunner";

    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }

}
