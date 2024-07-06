package Static;

import java.util.Random;

public class User {
    public String name;
    public static int counter;

    {  // nesne her oluşturulduğunda çalışır :
        System.out.println("nesne oluştu");
    }

    static {  // Bir kere çalışır. Sınıf oluşturulduğu an hafızada oluşturulur
        int random = (int) (Math.random()*10);
        System.out.println("Random sayı : "+random);
        counter=random;

    }

    User(String name) {
        this.name = name;
        counter++;
    }
}
