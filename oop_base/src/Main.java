//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ComplexNumber comp = new ComplexNumber(0.1, 0.2);
        ComplexNumber comp2 = new ComplexNumber(0.1, 0.2);
        System.out.println(comp.getIm());
        System.out.println(comp.equals(comp2));

        System.out.println(Integrate.integrate(x -> 1, 0, 10));
    }
}