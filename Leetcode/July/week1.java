// [01-07-2025] 3330. Find the Original Typed String I 
class week1{
    public int possibleStringCount(String word) {
        int len = word.length(),count = 1;
        for(int i=1;i<len;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count+=1;
            }
        }
        return count;
    }
}