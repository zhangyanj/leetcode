class Solution {
    HashMap<Integer, ArrayList<Integer>> map;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new HashMap<Integer, ArrayList<Integer>>();
        for (int[] arr:prerequisites) {
            if (map.containsKey(arr[0])) {
                map.get(arr[0]).add(arr[1]);   
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(arr[1]);
                map.put(arr[0], list);
            }
        }
        
        for (int i = 0; i < numCourses; i++) {
            if () {
                
            }
        }
        
        ArrayList<Integer> temp;
        boolean ans = true;
        for (int i = 0; i < numCourses; i++) {
            temp = new ArrayList<Integer>();
            boolean tpans = main(i, temp);
            System.out.println(i);
            System.out.println(tpans);
            System.out.println("********");
            ans&=tpans;
        }
        return ans;
    }
    
    // public boolean main(int a, ArrayList<Integer> temp) {
    //     if (!map.containsKey(a)) {
    //         return true;
    //     }
    //     if (temp.size()>0&&temp.contains(a)) {
    //         return false;
    //     }
    //     temp.add(a);
    //     boolean ans = true;
    //     for (int i:map.get(a)) {
    //         ArrayList<Integer> tempp = new ArrayList<>(temp);
    //         System.out.println(tempp.size());
    //         System.out.println("********");
    //         ans&=main(i, tempp);
    //     }
    //     return ans;
    // }
}
