package main;

public class ChucNang {
    public static int parseStringtoInt(String str){
        return Integer.parseInt(str);
    }

    public static double calculateBMIOfStudent(int height, int weight){
        double cao=(double)height/100;
        return weight/Math.pow(cao,2);
    }
}
