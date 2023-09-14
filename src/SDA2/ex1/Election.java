package SDA2.ex1;

public class Election {
    private Candidat[] candidats;

    public Election(Candidat[] candidats) {
        this.candidats = candidats;
    }

    public boolean vote(String name){
        //verific numele candidatului primit ca parametru in lista de candidati
        //daca ii gasesc numele ii cresc nr de voturi
        for (int i = 0; i < candidats.length; i++) {
            if (name.equals(candidats[i].getName())){
                candidats[i].setNumberOfVotes(candidats[i].getNumberOfVotes()+1);
                return true;
            }

        }
        return false;
    }
    public void declareWinner(){
        //caut candidatul cu cel mai mare nr de voturi
        int maxVotes= 0;
        for (int i = 0; i < candidats.length; i++) {
            if (maxVotes < candidats[i].getNumberOfVotes()){
                maxVotes = candidats[i].getNumberOfVotes();
            }
        }
        for (int i = 0; i < candidats.length; i++) {
            if (maxVotes == candidats[i].getNumberOfVotes()){
                System.out.println(candidats[i].getName());
            }
        }
    }
}
