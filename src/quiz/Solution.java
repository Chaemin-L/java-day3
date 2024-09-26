package quiz;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static final int[] DX = {1, 0, -1, 0};
    public static final int[] DY = {0, 1, 0, -1};


    public Integer solve(int[][] map){
        // bfs
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        boolean[][] visited = new boolean[map.length][map[0].length];
        int answer = Integer.MAX_VALUE;
        visited[0][0] = true;
        queue.add(new Integer[]{0, 0, 0}); // x, y, dist
        while(!queue.isEmpty()){
            Integer[] pos = queue.poll();
            visited[pos[0]][pos[1]]=true;
            if(pos[0]==map.length-1&&pos[1]==map[0].length-1){
                answer = pos[2];
                break;
            }
            for(int i=0; i<4; i++){
                int x = pos[0] + DX[i];
                int y = pos[1] + DY[i];
                if(x>=0&&x<map.length&&y>=0&&y<map[0].length&&map[x][y]==1){
                    if(!visited[x][y]){
                        queue.add(new Integer[]{x, y, pos[2]+1});
                    }
                }
            }
        }
        return answer;
    };
}
