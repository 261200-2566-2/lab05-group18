package Characters.Jobs;



import Characters.ClassCharacters.SwordMan;
public class Crusader extends SwordMan {
    public final String jobs = "Crusader";


    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }
}
