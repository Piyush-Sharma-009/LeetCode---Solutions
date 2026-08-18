class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
         int x = 0, y = 0, idx = -1;
        int minDist = Integer.MAX_VALUE;

        for(int i = 0;i<drones.length;i++){
                x = drones[i][0] - target[0];
                y = drones[i][1] - target[1];
                int dist = Math.abs(x) + Math.abs(y);
                if(dist <= drones[i][2] && dist < minDist){
                    minDist = Math.min(minDist, dist);
                    idx = i;
                }  
        }

        return idx;
        
    }
}
