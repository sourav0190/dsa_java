public class removeduplicate {

    // Recursive function to remove duplicate characters
    public static void removeDup(String str, int idx, StringBuilder result, boolean[] visited) {
        // Base case: if we reach the end of the string
        if (idx == str.length()) {
            System.out.println("Result: " + result.toString());
            return;
        }

        char currentChar = str.charAt(idx);

        // If the character has not been visited yet
        if (!visited[currentChar - 'a']) {
            visited[currentChar - 'a'] = true;  // mark as visited
            result.append(currentChar);        // add to result
        }

        // Recursive call for next character
        removeDup(str, idx + 1, result, visited);
    }

    public static void main(String[] args) {
        String str ="";  // Example input
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
