class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == "") {
            return 0;
        }
        char[] arr1 = haystack.toCharArray();
        int len1 = arr1.length;
        char[] arr2 = needle.toCharArray();
        int len2 = arr2.length;
        int point1 = 0;
        int point2 = 0;
        while (point1 <= (len1 - len2)) {
            point2 = 0;
            while (point2 < len2&&arr2[point2] == arr1[point2+point1]) {
                point2++;
            }
            if (point2 == len2) {
                return point1;
            }
            point1++;
        }
        return -1;
        
    }
}
