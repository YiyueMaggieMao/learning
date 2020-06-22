class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arrlen = strs.length;
        if(arrlen <= 0){return "";}
        StringBuilder prefix = new StringBuilder("");
        int ind = 0;
        String prevChar = "";
        boolean match = true;
        while(match){
            for(String s: strs){
                if(s.length() <= ind ){return prefix.toString();}
                if(prevChar.isEmpty()){prevChar = s.substring(ind, ind+1);} else{
                    if(!prevChar.equals(s.substring(ind, ind+1))){
                        match = false;
                        break;
                    }
                }
            }
            if(!match){return prefix.toString();}
            if(match)prefix.append(prevChar);
            ind++;
            prevChar = "";
        }
        return prefix.toString();
    }
}