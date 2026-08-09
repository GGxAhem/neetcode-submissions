class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[numCourses];

        for(int i=0; i<prerequisites.length; i++){

        int course = prerequisites[i][0];
        int prerequisite = prerequisites[i][1];

        graph.computeIfAbsent(prerequisite, k -> new ArrayList<>()).add(course);

        indegree[course]++;
      }
            Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int[] result = new int[numCourses];
        int index = 0;

        // Kahn's Algorithm
        while (!queue.isEmpty()) {

            int course = queue.remove();

            result[index] = course;
            index++;

            // Find courses that depend on this course
            List<Integer> list =
                graph.getOrDefault(course, new ArrayList<>());

            for (int nextCourse : list) {

                indegree[nextCourse]--;

                if (indegree[nextCourse] == 0) {
                    queue.add(nextCourse);
                }
            }
        }
        // If we couldn't process all courses, there is a cycle
        if (index != numCourses) {
            return new int[0];
        }

        return result;

    }
}
