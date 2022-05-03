
public class Question8 {
    public static void print(int n) {
        for (int i = 1; i < n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("\t*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}