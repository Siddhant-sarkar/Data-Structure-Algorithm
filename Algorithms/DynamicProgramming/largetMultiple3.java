class Solution {
    public String largestMultipleOfThree(int[] digits) {
        int freq[]= new int[10];
        int sum=0;
        for(int i:digits) {freq[i]++;sum+=i;}
        int mod1=freq[1]+freq[4]+freq[7];
        int mod2=freq[2]+freq[5]+freq[8];
        StringBuilder sb= new StringBuilder();
        if(sum%3==0){
          
        }else if(sum%3==1){
            if(mod1!=0) mod1--;
            else mod2-=2;
        }else{
           if(mod2!=0)  mod2-=1;
            else mod1-=2;
        }
        
        for(int i=9;i>=0;i--){
            int count=freq[i];
            if(i%3==0){
                while(count-->0){
                    sb.append(i);
                }
            }else if(i%3==1){
               while(count-->0 && mod1-->0) sb.append(i);
            }else{
               while(count-->0 && mod2-->0) sb.append(i);
            }
        }
        String ans=sb.toString();
        if(ans.length()>0 && ans.charAt(0)=='0') return "0";
        return ans ;
    }
    
}