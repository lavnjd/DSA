import java.util.*;
class RatInTheCage{
    public static void fun(int[][] cage, int[][] vis, List<String> ans, String move, int[] di, int[] dj, int i, int j){
        if(i == 3 && j == 3){
            ans.add(move);
            return ;
        }

        String directions ="DLRU";
        for(int ind=0;ind<4;ind++){
            int x = i+di[ind];
            int y = j+dj[ind];
            if(x>=0 && x<4 && y>=0 && y<4 && vis[x][y]==0 && cage[x][y]==1){
                vis[x][y]=1;
                fun(cage,vis,ans,move+directions.charAt(ind),di,dj,x,y);
                vis[x][y]=0;
            }
        }

    }
    public static void main(String[] args){
        int[][] cage = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int[][] vis = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                vis[i][j]=0;
            }
        }
        int[] di = {1,0,0,-1};
        int[] dj = {0,-1,1,0};
        List<String> ans = new ArrayList<>();
        fun(cage,vis,ans,"",di,dj,0,0);
        for(String a: ans){
            System.out.println(a);
        }

    }
}