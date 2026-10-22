class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res = 0;

        for(int num: nums){
            if(map.containsKey(num)) {
                continue;
            }

            int length = map.getOrDefault(num-1, 0) + map.getOrDefault(num+1, 0) +1;

            map.put(num, length);

            //update bundary

            map.put(num + map.getOrDefault(num+1, 0), length);
            map.put(num - map.getOrDefault(num-1, 0), length);

            res = Math.max(res, map.get(num));
        }

        return res;
    }
}
