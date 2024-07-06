package Static;

public class Calculate {
    // Static bir method :

    public static void Calculate(Course [] notes){
        double total =0;
        for (Course note : notes) {
            total+=note.note;
        }
        double avarage = total/notes.length;
        System.out.println("Dönem ortalamanız : " + avarage);

    }

}
