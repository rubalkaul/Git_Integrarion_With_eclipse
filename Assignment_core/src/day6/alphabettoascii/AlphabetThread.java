package day6.alphabettoascii;

public class AlphabetThread extends Thread{
    private Alphabet alphabets;

    public AlphabetThread(Alphabet alphabets, String name) {
        super(name);
        this.alphabets = alphabets;
    }
    public void run() {
        synchronized (alphabets) {
            for(char x = 'A'; x <= 'Z'; x++) {
                Thread cureThread = Thread.currentThread();
                String threadName = cureThread.getName();
                if(threadName.equals("Alphabet")) {
                    alphabets.setValue(x);
                }
                else if(threadName.equals("Ascii")) {
                    int value = alphabets.getAscii();
                    System.out.println("ASCII value: " + value);
                    System.out.println("*****************************************************************************");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
