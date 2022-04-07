class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int st : stones) { q.offer(st); }
        while (q.size() > 1) {
            q.offer(q.poll() - q.poll());
        }
        return q.peek();
}
}



// Sort stones descendingly in PriorityQueue, 
// then pop out pair by pair, compute the difference between them and add back to PriorityQueue.