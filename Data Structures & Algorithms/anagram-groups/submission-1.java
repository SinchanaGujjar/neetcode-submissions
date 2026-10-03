class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int[] arr=new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                arr[strs[i].charAt(j)-'a']++;
            }
            String key="";
            for(int k=0;k<arr.length;k++){
            key+="#"+arr[k];
            }
            if(map.containsKey(key)){
              map.get(key).add(strs[i]);
            }
            else{
              map.put(key,new ArrayList<>());
              map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
