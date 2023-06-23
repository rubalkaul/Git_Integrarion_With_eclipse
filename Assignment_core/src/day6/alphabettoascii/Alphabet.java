package day6.alphabettoascii;

public class Alphabet {
    private char value;
    private boolean flag;

    public void setValue(char value){
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        System.out.println("Alphabet: " + value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        notify();
    }

    public int getAscii() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notify();
        return (int)value;
    }


}
