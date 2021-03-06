package Mini_Bank09;

public class BankDto_v2 {
    //멤버변수
    private String id;
    private String pass;
    private double balance;
    static String Company = "(주) SSUNE COMPANY";

    //getter
    public String getId() { return id; }
    public String getPass() { return pass; }
    public double getBalance() { return balance; }
    public static String getCompany() { return Company; }
    //setter
    public void setId(String id) { this.id = id; }
    public void setPass(String pass) { this.pass = pass; }
    public void setBalance(double balance) { this.balance = balance; }
    public static void setCompany(String company) { Company = company; }

    //

    @Override
    public String toString() { return "BankDto_v2{id='" + id + '\'' + ", pass='" + pass + '\'' + ", balance=" + balance + '}'; }

    public BankDto_v2(String id, String pass, double balance) {
        this.id = id;
        this.pass = pass;
        this.balance = balance;
    }
    public BankDto_v2() { }
}
