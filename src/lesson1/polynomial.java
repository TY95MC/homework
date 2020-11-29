package lesson1;

public class polynomial {
    public static void main(String[] args) {
       System.out.println(exp(1,2, 3, 4));
    }

    public static float exp(float a, float b, float c, float d){
        return a * (b + (c / d));
    }
}

