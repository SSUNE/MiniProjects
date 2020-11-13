package Mini_Bank12;

public class Bank_v12 {
    //멤버변수
    private String id;
    private String pass;
    private double balance;
    static String Company="(주) SSUNE";

    public Bank_v12() {
    }

    public Bank_v12(String id, String pass, double balance) {
        this.id = id;
        this.pass = pass;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getCompany() {
        return Company;
    }

    public static void setCompany(String company) {
        Company = company;
    }
}
