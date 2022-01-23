package practice;

public class BubbleEx01 {
    public static void main(String[] args) {
        int[] a = { 7, 52, 56, 485, 2, 62, 74, 89, 4, 85, 65 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("{" + a[i] + "}");
        }
    }

}
