package labsheet3;

public class Ex6 {
    public static void main(String[] args) { //idea how it should work
        double balance =100000;
        double rate;
        final int withdraw = 12000;
        int i = 1;

        while (balance >= withdraw){

            rate = balance*0.3;
            balance = rate;
            System.out.printf("Balance at the end of year "+i+" is EUR ",balance);
        }
    }
}
