package SDA2.ex1;

public class Candidat {
    private String name;
    private int numberOfVotes;

    public Candidat(String name) {
        this.name = name;
        this.numberOfVotes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
}
