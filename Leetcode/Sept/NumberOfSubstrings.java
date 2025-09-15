public class NumberOfSubstrings {

    public static void main(String[] args) {
        String s = "abcabc";
        // int n = s.length();
        // int count = 0;
        // for (int l = 0; l < n; l++) {
        //     int a = 0, b = 0, c = 0;  // reset for each new starting point

        //     for (int j = l; j < n; j++) {
        //         char ch = s.charAt(j);
        //         if (ch == 'a') a = 1;
        //         if (ch == 'b') b = 1;
        //         if (ch == 'c') c = 1;

        //         // Only counting, no substring creation
        //         if (a == 1 && b == 1 && c == 1) {
        //             count++;
        //         }
        //     }
        // }


        //Optimal way
        int n = s.length();
        int count = 0;
        int freq[] = new int[3];
        int l = 0; // for left pointer 
        for(int r=0;r<n;r++){ //right pointer
            char ch = s.charAt(r);
            freq[ch-'a']++; //storing freq values 

            //Shrinking the substring untill we have a,b,c 
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count += (n-r);
                freq[s.charAt(l)-'a']--;
                l++;
            }
        }
        System.out.println("Count = " + count);
        
    }
}
