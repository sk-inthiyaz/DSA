class week3{
    public static  int maxProfit(int[] prices) {
        int profitMax = 0;
        int n = prices.length;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=i+1;j<n;j++){
                int d = prices[j]-prices[i];
                if(max<d){
                    max=d;
                }
            }
            if(profitMax<max){
                profitMax = max;
            }
        }
        System.out.println(profitMax);
        return profitMax;
    }
    public static void main(String[] args) {
        int  g = maxProfit(new int[]{7,1,5,3,6,4});
        // int  g = maxProfit(new int[]{7,6,4,3,1});
    }

    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowels=0;
        int conso=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(((int)ch>=48 && (int)ch<=57) || ((int)ch>=65 && (int)ch<=90) || ((int)ch>=97 && (int)ch<=122)){
                if((int)ch>=48 && (int)ch<=57){
                    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                        vowels = 1;
                    }
                }
                if (!((int)ch>=65 && (int)ch<=90) && !(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))  {
                    System.out.println(ch);
                    conso=1;
                }
               
            }
            else{
                return false;
            }
        }
        return (vowels==1 && conso==1);
}

}