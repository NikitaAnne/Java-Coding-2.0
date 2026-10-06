package evaluation1.sectiona;

public class DivisibilityTest {
    public static void main(String[] args) {
        System.out.println("The numbers which are divisible by 3 are: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}