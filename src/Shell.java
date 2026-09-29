public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;

        int numIncrements = 0;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
            numIncrements++;
        }
        if (numIncrements == 0) numIncrements = 1; // минимум 1 шаг (h = 1)

        int[] increments = new int[numIncrements];
        h = 1;
        for (int i = 0; i < numIncrements; i++) {
            increments[i] = h;
            h = 3 * h + 1;
        }

        for (int k = increments.length - 1; k >= 0; k--) {
            int gap = increments[k];

            for (int i = gap; i < N; i++) {
                for (int j = i; j >= gap && less(a[j], a[j - gap]); j -= gap) {
                    exch(a, j, j - gap);
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }


    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
