package Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Player.count);
        Player p1 = new Player("roz",1);
        System.out.println(Player.count);
        Player.printName();
    }
}
