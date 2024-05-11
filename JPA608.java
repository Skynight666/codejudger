import java.util.Scanner;

public class JPA608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        boolean[] bases = new boolean[3];
        for (int i = 0; i < 10; i++) {
            int hit = scanner.nextInt();

            score += updateScoreAndBases(hit, bases);
        }

        System.out.println("score = " + score);

        scanner.close();
    }
    public static int updateScoreAndBases(int hit, boolean[] bases) {
        int score = 0;

        switch (hit) {
            case 1:
                if (bases[2]) {
                    score++;
                    bases[2] = false;
                }
                for (int i = 2; i > 0; i--) {
                    bases[i] = bases[i - 1];
                }
                bases[0] = true;
                break;
            case 2:
                if (bases[2]) {
                    score++;
                    bases[2] = false;
                }
                if (bases[1]) {
                    score++;
                    bases[1] = false;
                }
                bases[2] = bases[0];
                bases[1] = true;
                bases[0] = false;
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    if (bases[i]) {
                        score++;
                        bases[i] = false;
                    }
                }
                bases[2] = true;
                break;
            case 4:
                for (int i = 0; i < 3; i++) {
                    if (bases[i]) {
                        score++;
                        bases[i] = false;
                    }
                }
                score++;
                break;
            default:
                break;
        }
        return score;
    }
}
