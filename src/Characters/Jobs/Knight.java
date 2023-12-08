package Characters.Jobs;

import Characters.ClassCharacters.SwordMan;
public class Knight extends SwordMan {
    public final String jobs = "Knight";

    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }
}
