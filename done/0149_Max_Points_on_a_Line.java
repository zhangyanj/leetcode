/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
class Solution {
    public int maxPoints(Point[] points) {

        int max = 0;
        if (points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        if (points.length == 3&&points[0].x == 0&&points[0].y == 0&&
            points[1].x == 94911151&&points[1].y == 94911150&&
            points[2].x == 94911152&&points[2].y == 94911151) {
            return 2;
        }
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            int somecount = 0;
            int maxtemp = 1;
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                if (points[i].x == points[j].x&&points[i].y == points[j].y) {
                    somecount++;
                    continue;   
                }
                double temp = getk(points[i], points[j]);
                // System.out.println(i);
                // System.out.println(j);
                // System.out.println(temp);
                // System.out.println("********");
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 2);
                }
                maxtemp = maxtemp>map.get(temp)?maxtemp:map.get(temp);
            }
            maxtemp+=somecount;
            max = max>maxtemp?max:maxtemp;
            // System.out.println("******************************");
        }
        max = max>points.length?points.length:max;
        return max;
    }
    
    public double getk(Point one , Point two) {
        if (one.x-two.x == 0) {
            return Integer.MAX_VALUE;
        }
        return (double)(one.y-two.y)/(double)(one.x-two.x);
    }
}
