package Static;

public class Player {
    public String name;
    public int id;
    public static int count=0;

    Player(String name,int id){
        this.name=name;
        this.id=id;
        login();
    }

    public void login(){
        count++;
    }

    public static void printName(){
     Player p1= new Player("rozelin",2);
        System.out.println(p1.name);
    }
}
