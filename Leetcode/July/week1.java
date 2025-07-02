// [01-07-2025] 3330. Find the Original Typed String I 
// [02-07-2025] 6. Zigzag Conversion
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
    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
     */
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int idx = i;
            int deltaSouth = 2 * (numRows-i-1);
            int deltaNorth = 2 * i;
            boolean goingSouth = true;
            while(idx<s.length()){
                sb.append(s.charAt(idx));
                if(i==0){
                    idx+=deltaSouth;
                }else if(i==numRows-1){
                    idx+=deltaNorth;
                }else{
                    if(goingSouth){
                        idx+=deltaSouth;
                    }else{
                        idx+=deltaNorth;
                    }
                    goingSouth = !goingSouth;
                }
            }
        }
        return sb.toString();
    }
}