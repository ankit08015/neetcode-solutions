class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.merge(num, 1, Integer::sum);
        }
        
        List<Integer> res = new ArrayList<>();
        for(Integer num: map.keySet()) {
            if(map.get(num) > nums.length/3){
                res.add(num);
            }
        }
        
        return res;
    }
}