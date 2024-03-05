
import java.util.Scanner;

public class OwnData {

    private Scanner scan;

    public OwnData() {

        scan = new Scanner(System.in);
    }

    public String getString(String inText) {

        System.out.print(inText);
        String text = scan.nextLine();
        return text;
    }

    public double getDouble(String inText) {

        System.out.print(inText);
        double number = scan.nextDouble();
        return number;
    }

    public int getInt(String inText) {

        System.out.print(inText);
        int number = scan.nextInt();
        return number;
    }

    public boolean getBoolean(String inText) {

        System.out.print(inText);
        boolean is = scan.nextBoolean();
        return is;
    }
}