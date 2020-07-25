package Main;

import Utils.AutoGenerateCode;

public class Main {
    public static void main(String[] args) {
        AutoGenerateCode prog = new AutoGenerateCode();
        String file = "D:\\Java_Programms\\CrazyCalculator\\largecode.txt";

        prog.generateCodeForSecond(0, 10, file);
        System.out.println("it works?");
    }
}
