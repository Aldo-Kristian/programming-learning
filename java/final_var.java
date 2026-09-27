public class final_var {
    public static void main(String[] args) {
        final int myNumber = 49;
        myNumber = 51; // Will generate an error
        System.out.println(myNumber);
    }
}

/*
If you don't want others (or yourself) to overwrite existing values, 
use the final keyword (this will declare the variable as "final" or "constant", 
which means unchangeable and read-only):
*/