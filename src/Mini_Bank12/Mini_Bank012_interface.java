package Mini_Bank12;

public class Mini_Bank012_interface {
    public static void main(String[] args) {
        Bank_Controller process = (Bank_Controller) new Menu12();
        process.exec(new Bank_v12());
    }
}
