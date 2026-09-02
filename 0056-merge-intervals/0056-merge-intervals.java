class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        ArrayList<int[]> res = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            if (end1 >= s2) {
                end1 = Math.max(end1, e2);
                continue;
            }
            res.add(new int[]{start1, end1});
            start1 = s2;
            end1 = e2;
        }
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()][]);
    }
}