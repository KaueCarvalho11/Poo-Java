public class Valores{

    public static int maior(int n1, int n2){
        return (n1>n2)? n1:n2;
    }

    public static int maior(int n1, int n2, int n3){
        return maior(maior(n1, n2), n3);
    }

    public static int maior(int n1, int n2, int n3, int n4){
        return maior(maior(n1, n2), maior(n3, n4));
    }

    public static int maior(int n1, int n2, int n3, int n4, int n5){
        return maior(maior(maior(n1, n2), maior(n4, n5)), n5);
    }

    public static double maior(double n1, double n2){
        return (n1>n2)? n1:n2;
    }

    public static double maior(double n1, double n2, double n3){
        return maior(maior(n1, n2), n3);
    }

    public static double maior(double n1, double n2, double n3, double n4){
        return maior(maior(n1, n2), maior(n3, n4));
    }

    public static double maior (double n1, double n2, double n3, double n4, double n5){
        return maior(maior(maior(n1, n2), maior(n3, n4)), n5);
    }
}