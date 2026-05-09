class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequencies
        Map<Integer, Integer> FrequencyCounter = new HashMap<>();
        for (int num : nums) {
            FrequencyCounter.put(num, FrequencyCounter.getOrDefault(num, 0) + 1);
        }

        // Store entries in a list
        List<int[]> FrequencyStore = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : FrequencyCounter.entrySet()) {
            FrequencyStore.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // Sort by frequency (descending)
        FrequencyStore.sort((a, b) -> b[1] - a[1]);

        // Collect top k elements
        int[] OutPutArray = new int[k];
        for (int i = 0; i < k; i++) {
            OutPutArray[i] = FrequencyStore.get(i)[0]; // store the number
        }

        return OutPutArray;
    }
}