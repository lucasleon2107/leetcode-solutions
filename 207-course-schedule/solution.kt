// LeetCode 207: course-schedule

fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    val graph = Array(numCourses) { mutableListOf<Int>() }

    for ((a, b) in prerequisites) {
        graph[b] += a
    }

    val onStack = BooleanArray(numCourses)
    val done = BooleanArray(numCourses)

    fun hasCycle(course: Int): Boolean {
        if (onStack[course]) return true
        if (done[course]) return false

        onStack[course] = true

        graph[course].forEach { prerequisite ->
            if (hasCycle(prerequisite)) return true
        }

        onStack[course] = false
        done[course] = true

        return false
    }

    return (0 until numCourses).none { hasCycle(it) }
}