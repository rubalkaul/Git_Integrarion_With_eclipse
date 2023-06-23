package day6.alphabettoascii;

public class AlphabetMain {
    public static void main(String[] args) {
        Alphabet alpha = new Alphabet();
        Thread t1 = new AlphabetThread(alpha,"Alphabet");
        Thread t2 = new AlphabetThread(alpha,"Ascii");
        t1.start();
        t2.start();
    }
}
