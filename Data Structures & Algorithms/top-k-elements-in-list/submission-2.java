class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.merge(num, 1, Integer::sum);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length +1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            if (bucket[entry.getValue()] == null) bucket[entry.getValue()] = new ArrayList<>();

            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] freq = new int[k];
        int index =0;

        for(int i = bucket.length -1 ; i>=0; i--) {
            if (bucket[i] == null) continue;
            for(int num: bucket[i]){
                freq[index++] = num;
                if(index==k){
                    return freq;
                }
            }
        }
        return freq;
    }

}
