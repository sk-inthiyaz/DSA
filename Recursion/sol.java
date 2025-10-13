class sol{
    public static void main(String[] args){
        String version1 = "1.0.1";//1
        String version2 = "2";
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        System.out.println(v1.length + " "+ v2.length);
        if(v1.length==v2.length){
            for(int i=0;i<v1.length;i++){
                int v1i = Integer.parseInt(v1[i]);
                int v2i = Integer.parseInt(v2[i]);
                System.out.println(v1i + " "+ v2i);
                // System.out.println(v2i);
                if(v2i>v1i){
                    System.out.println(-1);
                    break;
                }
                if(v1i>v2i){
                    System.out.println(1);
                    break;
                }
            }
        }
        System.out.println(0);
    }
}