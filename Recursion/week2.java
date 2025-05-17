// 05-04-2025 GetMazePaths
// 07-04-2025 Get Maze path with jump
// 09-04-2025 PrintSubString 
// 14-04-2025 print stair paths
// 15-04-2025 printMazePaths(pending)
// 16-04-2025 Permutation

public class week2{
    //Day1(GetMazePaths)
    //sr-source row 
    //sc-source coloumn
    //dr-destination row 
    //dc-destination coloumn
    // public static ArrayList<String>getMazePaths(int sr,int sc,int dr,int dc){
    //     if(sr==dr && sc==dc){
    //         ArrayList<String>bres = new ArrayList<>();
    //         bres.add(" ");
    //         return bres;
    //     }
    //     ArrayList<String> hpaths = new ArrayList<>();
    //     ArrayList<String> vpaths = new ArrayList<>();
    //     if(sc<dc){
    //         hpaths = getMazePaths(sr, sc+1, dr, dc);
    //     }
    //     if(sr<dr){
    //         vpaths = getMazePaths(sr+1, sc, dr, dc);
    //     }
    //     ArrayList<String> paths = new ArrayList<>();

    //     for(String hpath:hpaths){
    //         paths.add("h"+hpath);
    //     }
    //     for(String vpath:vpaths){
    //         paths.add("v"+vpath);
    //     }
    //     return paths;
    // }
    // public static void main(String[] args) {
    //     ArrayList<String> result = getMazePaths(1, 1, 3, 3);
    //     System.out.println(result);
    // }


    // Day2
    // Q)Get Maze path with jump
    // public static ArrayList<String>getMazePathJump(int sr,int sc,int dr,int dc){
    //     //sr-source row 
    //     //sc-source coloumn
    //     //dr-destination row 
    //     //dc-destination coloumn
    //     if (sr==dr && sc==dc) {
    //         ArrayList<String>bres=new ArrayList<>();
    //         bres.add("");
    //         return bres;
    //     }
    //     ArrayList<String>paths = new ArrayList<>();
    //     //Horzontal moves
    //     for(int ms=1;ms<=dc-sc;ms++){
    //         ArrayList<String>hpaths = getMazePathJump(sr, sc+ms, dr, dc);
    //         for (String hpath : hpaths) {
    //             paths.add("h"+ms+hpath);
    //         }
    //     }
    //     //Vertical moves 
    //     for(int ms=1;ms<=dr-sr;ms++){
    //         ArrayList<String>vpaths = getMazePathJump(sr+ms, sc, dr, dc);
    //         for (String vpath : vpaths) {
    //             paths.add("v"+ms+vpath);
    //         }
    //     }
    //     //diognol
    //     for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
    //         ArrayList<String>dpaths = getMazePathJump(sr+ms, sc+ms, dr, dc);
    //         for(String dpath:dpaths){
    //             paths.add("d"+ms+dpath);
    //         }
    //     }
    //     return paths;
    // }
    // public static void main(String[] args) {
    //     ArrayList<String> result = getMazePathJump(1, 1, 3, 3);
    //     System.out.println(result);
    // }


    //Day 3
    // PrintSubString 
    // public static void printSS(String ques,String ans){
    //     if(ques.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     char ch = ques.charAt(0);
    //     String roq = ques.substring(1);
    //     printSS(roq, ans+ch);
    //     printSS(roq, ans+"");
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printSS(str, "");
    // }



    //print stair paths
    // public static void printStairPaths(int n,String path){
    //     if(n<0){
    //         return ;
    //     }
    //     if(n==0){
    //         System.out.println(path);
    //         return;
    //     }
    //     printStairPaths(n-1, path+"1");
    //     printStairPaths(n-2, path+"2");
    //     printStairPaths(n-3, path+"3");
    // }

    // public static void main(String[] args) {
    //     printStairPaths(4, "");
    // }


    //permutation 
    //input abc --->
    /**
     * abc
    acb
    bac
    bca
    cab
    cba
     */
    public  static  void Permutation(String ques,String asf){
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart+qrpart;
            Permutation(roq, asf+ch);
        }
    }
    public static void main(String[] args) {
        Permutation("abc", "");
    }


}


