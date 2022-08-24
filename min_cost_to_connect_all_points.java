class Solution {
    public int minCostConnectPoints(int[][] points) {
        Map<Integer, int[]> labels = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            labels.put(i, new int[]{points[i][0], points[i][1]});
        }

        Set<Integer> visited = new HashSet<>();

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for(int i = 1; i < points.length; i++){
            int[] point1 = labels.get(0);
            int[] point2 = labels.get(i);
            int dist = Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);

            queue.add(new int[]{i, dist});
        }
        visited.add(0);

        int ans = 0;
        while(!queue.isEmpty()){
            int[] curEdge = queue.poll();
            if(!visited.contains(curEdge[0])){
                visited.add(curEdge[0]);
                ans += curEdge[1];

                for(int i = 0; i < points.length; i++){
                    if(i != curEdge[0] && !visited.contains(i)){
                        int[] point1 = labels.get(curEdge[0]);
                        int[] point2 = labels.get(i);
                        int dist = Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);

                        queue.add(new int[]{i, dist});
                    }
                }
            }
        }

        return ans;
    }
}