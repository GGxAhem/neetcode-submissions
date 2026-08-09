class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, List<Integer>> graphs = new HashMap<>();
        int [] indegree = new int[numCourses];

        for(int i =0; i<prerequisites.length; i++){
            int src = prerequisites[i][0];
            int dest = prerequisites[i][1];
            graphs.computeIfAbsent(src, k-> new ArrayList<>()).add(dest);
            indegree[dest]++;
        }
        //add to queue
        Queue<Integer> queue = new LinkedList<>();
        //add indegree to queue
        for(int i =0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        //while queue size
        while(queue.size() > 0){
            Integer node = queue.remove();
            List<Integer> list = graphs.getOrDefault(node, new ArrayList<>());
                for(Integer neigh : list){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    queue.add(neigh);
                }
            }

        }
        for(int i =0; i<indegree.length; i++){
            if(indegree[i] > 0){
                return false;
            }
        }
        return true;
        
    }

}
