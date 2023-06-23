package day6.paytmminiproject;

public class PaytmAccount {
    private String mobileNumber;
    private String accountName;
    private int balance;
    private boolean flag;

    public void addmoney(int balance) {
        System.out.println("-----------------------------------------");
        System.out.println("You have added: " + balance + " Rupees");
        this.balance = this.balance + balance;
    }

    public void displayAccount() throws InterruptedException {
        Thread.sleep(1000);
//        if (this.balance >= 0) {
        System.out.println("Now your account balance is: " + this.balance + " Rupees");
        System.out.println("-----------------------------------------");
//        }
//        else {
//            System.out.println("Insufficient balance to handle your request.");
//        }
    }

    public void makePayment(int balance) {
        System.out.println("-----------------------------------------");
        System.out.println("You have made a payment of: " + balance + " Rupees");
        this.balance = this.balance - balance;
    }

    public PaytmAccount(String mobileNumber, String accountName, int balance) {
        this.mobileNumber = mobileNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Your Mobile Number is: " + getMobileNumber() +
                "\nYour Account Name is: " + getAccountName() +
                "\nYour Account Balance is: " + getBalance();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
