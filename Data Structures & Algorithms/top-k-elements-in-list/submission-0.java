class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums)
        {
            if(map.containsKey(key))
            {
                int value=map.get(key);
                map.put(key,value+1);
            }
            else{
                map.put(key,1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> Integer.compare(map.get(b),map.get(a)));
        for(int key:map.keySet())
        {
            pq.add(key);
        }
        int[] ans=new int[k];
        for(int i=1;i<=k;i++)
        {
            ans[i-1]=pq.poll();
        }
        return ans;
    }
}
