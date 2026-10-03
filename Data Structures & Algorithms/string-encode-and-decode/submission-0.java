class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs)
        {
            sb.append(s.length()).append('_').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=str.indexOf('_',i);
            int length=Integer.parseInt(str.substring(i,j));
            j+=1;
            result.add(str.substring(j,j+length));
            i=j+length;
        }
        return result;
    }
}
