package quiz;

public class Road {
    public static void main(String[] args) {
        // 0, 0 출발점. 4, 4가 도착점. 1은 길, 0은 벽의 최단거리
        int[][] map = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
        };
        Solution solution = new Solution();
        int minDist = solution.solve(map);
        System.out.println(minDist);
    }
}
