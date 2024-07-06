package Static;

public class Main {
    public static void main(String[] args) {


        /*

        Player sınıfıyla ilgili egzersiz :

        System.out.println(Player.count);
        Player p1 = new Player("roz",1);
        System.out.println(Player.count);
        Player.printName();

         */

        Course matematik = new Course("matematik","mat-101",50);
        Course turkce = new Course("türkçe","trk-101",50);
        Course fen = new Course("fen","fen-101",50);

        Course [] courses = {matematik,turkce,fen};
        Calculate.Calculate(courses);


    }
}
