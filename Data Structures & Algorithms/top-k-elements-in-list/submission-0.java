class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency count karna 
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: PriorityQueue (Min-Heap) banana jo frequency ke basis par sort kare
        // (a, b) -> map.get(a) - map.get(b) ka matlab hai jiski frequency kam ho use upar rakho
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        // Step 3: Map ki keys ko heap mein daalna
        for (int num : map.keySet()) {
            minHeap.add(num);

            // Agar heap ka size k se bada ho jaye, toh sabse kam frequency wale ko nikal do
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Heap mein ab sirf top K frequent elements bache hain, unhe array mein daal do
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}
