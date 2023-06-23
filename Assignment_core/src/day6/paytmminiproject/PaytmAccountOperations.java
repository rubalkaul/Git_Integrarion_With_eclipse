package day6.paytmminiproject;

public class PaytmAccountOperations extends Thread{
    private PaytmAccount realAccount;
    private int money;
    public PaytmAccountOperations(PaytmAccount realAccount, int money, String name) {
        super(name);
        this.realAccount = realAccount;
        this.money = money;
    }

    @Override
    public void run(){
        synchronized (realAccount){
            Thread curThread = currentThread();
            String threadName = curThread.getName();
            if (threadName.equals("Add Money")){
                realAccount.addmoney(money);
                try {
                    realAccount.displayAccount();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (threadName.equals("Make Payment")) {
                realAccount.makePayment(money);
                try {
                    realAccount.displayAccount();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
