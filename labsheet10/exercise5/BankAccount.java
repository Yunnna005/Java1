package labsheet10.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interest_rate;
    private static int count=0;

    public BankAccount(){
        owner = "Owner Not Avaliable";
        number = 0;
        interest_rate = 0.0;
    }

    public BankAccount(String owner, int number, double interest_rate){
        this.owner = owner;
        this.number = number;
        this.interest_rate = interest_rate;
    }

    public String getOwner(){return owner;}
    public int getNumber(){return count ++;}
    public double getInterest_rate(){return interest_rate;}

    public void setOwner(String owner){this.owner = owner;}
    public void setNumber(int number){this.number = number;}
    public void setInterest_rate(double interest_rate){this.interest_rate = interest_rate;}

    public String toString(){
        return "\nOwner: "+getOwner()+"   Account Number: "+getNumber()+"   Interest Rate: "+getInterest_rate()+"\n";
    }
}
