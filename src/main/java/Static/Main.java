package Static;

public class Main {
    public static void main(String[] args) {


        // Player sınıfıyla ilgili egzersiz :
        /*
        System.out.println(Player.count);
        Player p1 = new Player("roz",1);
        System.out.println(Player.count);
        Player.printName();
        */



        // Course sınıfıyla ilgili çalışma :
        /*
        Course matematik = new Course("matematik","mat-101",50);
        Course turkce = new Course("türkçe","trk-101",50);
        Course fen = new Course("fen","fen-101",50);

        Course [] courses = {matematik,turkce,fen};
        Calculate.Calculate(courses);
        */

        // User sınıfıyla ilgili çalışma :
        User user1 = new User("rozelin");
        System.out.println(User.counter);
        User user2 = new User("roz");
        System.out.println(User.counter);

    }
}
