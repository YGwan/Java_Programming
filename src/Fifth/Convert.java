package Fifth;


import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert "+getSrcString()+" to "+getDestString());
        System.out.print("Enter "+getSrcString()+" >>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.print(val+" "+getSrcString()+" is converted to "+res+" "+getDestString());
        scanner.close();
    }
}
