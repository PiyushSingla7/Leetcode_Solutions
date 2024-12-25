class Solution {
    private List<String>result=new ArrayList<>();
    public void gene(int n,String ans,int lc,int rc){
        if(ans.length()==2*n){
            result.add(ans);
            return;
        }
        if(lc<n) gene(n,ans+"(",lc+1,rc);
        if(lc>rc) gene(n,ans+")",lc,rc+1);
    }
    public List<String> generateParenthesis(int n) {
        gene(n,"",0,0);
        return result;
    }
}