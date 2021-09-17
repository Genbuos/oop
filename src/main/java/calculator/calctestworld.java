package calculator;

public class calctestworld {
    public static void main(String[] args) {
        math dacalc = new math(20,10);
        System.out.println(dacalc.multiply());
        System.out.println(dacalc.addition());
        System.out.println(dacalc.divide());
        System.out.println(dacalc.subtract());
        System.out.println(dacalc.exponents());
    }
}
