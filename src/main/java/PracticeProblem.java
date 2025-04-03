public class PracticeProblem {

	public static int towerOfHanoi(int num) {
        if (num < 3) return -1;
        else if (num == 3) return 7;
        else return 2*towerOfHanoi(num - 1) + 1;
        // else return (int) Math.pow(2, num) - 1;
    }

}
