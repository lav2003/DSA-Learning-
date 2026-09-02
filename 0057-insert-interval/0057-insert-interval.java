class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> ans = new ArrayList<>();
        int start1 = newInterval[0];
        int end1 = newInterval[1];
        boolean insert = false;

        for (int i = 0; i < intervals.length; i++) {
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            if (!insert && end1 < s2) {
                ans.add(new int[]{start1, end1});
                insert = true;
            }
            if (!insert && end1 >= s2 && start1 <= e2) {
                start1 = Math.min(start1, s2);
                end1 = Math.max(end1, e2);
                continue;
            }
            ans.add(new int[]{s2, e2});
        }
        if (!insert) {
            ans.add(new int[]{start1, end1});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}