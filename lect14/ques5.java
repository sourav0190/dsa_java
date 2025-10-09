public class ques5{
    public static int quess5(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int ci = number[i];
            for (int j = 0; j < number.length; j++) {
                int cj = number[j];
                for (int k = 0; k < number.length; k++) {
                    if ((j != k) && (i != k) && (i != j)) {
                        if (((ci + cj + number[k] == 0) && (i < j) && (j < k))) {
                            System.out.print("(" + ci + "," + cj + "," + number[k] + ")");
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int number[] = { -1, 0, 1, 2, -1, 4 };
        quess5(number);
    }
}
