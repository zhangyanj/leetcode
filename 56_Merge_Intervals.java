/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int len = intervals.size();
        List<Interval> ans = new ArrayList<Interval>();
        if (len == 0) {
            return ans;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
            }
        });
        ans.add(intervals.get(0));
        for (int i = 1; i < len; i++) {
            if (ans.get(ans.size()-1).end < intervals.get(i).start) {
                ans.add(intervals.get(i));
            } else {
                ans.get(ans.size()-1).end = Math.max(ans.get(ans.size()-1).end, intervals.get(i).end);
            }
        }
        return ans;
    }
}
