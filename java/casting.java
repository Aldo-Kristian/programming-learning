public class casting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

    System.out.println(myInt);
    System.out.println(myDouble);
    }
}

class narrowcasting {
    public static void main(String[] args) {
        double myDouble = 9.99d;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}

/*
Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte
*/
