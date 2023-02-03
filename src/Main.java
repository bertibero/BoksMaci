public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali Kemal",15, 100,100,30);
        Fighter f2 = new Fighter("Ramazan", 15, 100, 85,40);

        Match match = new Match(f1,f2,100,85);
        match.run();
    }
}