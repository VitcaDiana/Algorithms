package SDA2.ex1;

public class Main {
    public static void main(String[] args) {
        Candidat candidat1 = new Candidat("Alice");
        Candidat candidat2 = new Candidat("Bob");
        Candidat candidat3 = new Candidat("Charlie");

        Candidat[] candidats = {candidat1,candidat2,candidat3};

        Election election = new Election(candidats);

        election.vote("Alice");
        election.vote("Alice");
        election.vote("Alice");
        election.vote("Alice");
        election.vote("Alice");
        election.vote("Bob");
        election.vote("Charlie");
        election.vote("Charlie");
        election.vote("Charlie");
        election.vote("Charlie");
        election.vote("Charlie");

        election.declareWinner();
    }
}
