public class MaxElementInArray {
    private int[] ints;

    MaxElementInArray(int[] ints) {
        this.ints = ints;
    }

    public int getMax() {
        int max = ints[0];
        for (int i : ints) {
            max = Math.max(max, i);
        }
        return max;
    }
}

