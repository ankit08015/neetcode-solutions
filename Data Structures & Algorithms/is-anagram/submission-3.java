class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // brute force - sort and compare both Arrays
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // for (int i = 0; i < sArr.length; i++) {
        //     if (sArr[i] != tArr[i]) {
        //         return false;
        //     }
        // }

        // return true;

        // complexity (Oslogs + Otlogt)


        // Optimized use 2 HashSet
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < sArr.length; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
            tMap.put(sArr[i], tMap.getOrDefault(sArr[i], 0) + 1);
        }

        for (int i = 0; i < sMap.size(); i++) {
            if (sMap.get(i) != tMap.get(i)) {
                return false;
            }
        }

        return true;

    }
}
