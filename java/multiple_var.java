public class multiple_var {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        int z = 20;
        System.out.println(x+y+z);

        x = y = z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println(x+y+z);
        
    }
}

class Test {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 50;
        System.out.println(a+b+c);
    }
}

//Call private class: java -cp out Test