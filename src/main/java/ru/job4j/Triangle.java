package ru.job4j;

public class Triangle {
    public  static boolean exist (double ab, double ac, double bc) {
        boolean res = (ab + ac) > bc;
        boolean res2 = (ac + bc) > ab;
        boolean res3 = (ab + bc) > ac;
        if(res && res2 && res3){
            System.out.println("exist.");
        }else {
            System.out.println("does not exist.");
        }

        return res;
    }

    public static void main(String[] args) {
        Triangle.exist(2.0, 2.0, 2.0);
        Triangle.exist(2.0, 2.0, 2.0);
        Triangle.exist(2.0, 2.0, 2.0);
    }
}
