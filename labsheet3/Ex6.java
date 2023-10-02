package labsheet3;

public class Ex6 {//
    public static void main(String[] args) { //idea how it should work
        double balance =100000;
        double rate;
        final int withdraw = 12000;
        int i = 0;

        do{
            rate = balance*0.03;
            balance += rate;
            balance -= withdraw;
            String formating = String.format(" is EUR %.2f",balance);
            i++;
            System.out.println("Balance at the end of year "+i+formating);

        } while (balance >= withdraw);

    }
}
