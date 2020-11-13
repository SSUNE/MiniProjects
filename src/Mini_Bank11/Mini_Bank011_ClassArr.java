package Mini_Bank11;

public class Mini_Bank011_ClassArr {
    public static void main(String[] args) {
        Bank_v4[] users = new Bank_v4[] { new Bank_v4(), new Bank_v4(), new Bank_v4()};

        Process_v3 process = new Process_v3();
        process.menu(users);
    }
}
