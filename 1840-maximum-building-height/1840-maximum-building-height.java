class Solution {
    public int maxBuilding(int num, int[][] restrictions) {
        List<int[]> r = new ArrayList<>(Arrays.asList(restrictions));
        r.add(new int[]{1, 0});
        r.sort((a, b) -> Integer.compare(a[0], b[0]));
        int s = r.size();
      for (int i = 1; i < s; i++)
            r.get(i)[1] = yCap(r.get(i - 1), r.get(i));
        for (int i = s - 2; i >= 0; i--)
            r.get(i)[1] = yCap(r.get(i + 1), r.get(i));
        int res = 0;
        for (int i = 1; i < s; i++)
            res = Math.max(res, yPeak(r.get(i - 1), r.get(i)));
        return Math.max(res, r.get(s - 1)[1] + num - r.get(s - 1)[0]);
    }
    int yCap(int[] l, int[] b) {
        return Math.min(b[1], l[1] + Math.abs(b[0] - l[0]));
    }
    int yPeak(int[] l, int[] b) {
        return (l[1] + b[1] + b[0] - l[0]) >> 1;
    }
}