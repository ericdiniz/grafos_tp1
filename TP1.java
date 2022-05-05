import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TP1 {

    static int maxindex(int[] dist, int n) {
        int mi = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] > dist[mi])
                mi = i;
        }
        return mi;
    }

    static void selectKcities(int n, int weights[][],
            int k) {
        int[] dist = new int[n];
        ArrayList<Integer> centers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // Index of city having the
        // maximum distance to it's
        // closest center
        int max = 0;
        for (int i = 0; i < k; i++) {
            centers.add(max);
            for (int j = 0; j < n; j++) {

                // Updating the distance
                // of the cities to their
                // closest centers
                dist[j] = Math.min(dist[j],
                        weights[max][j]);
            }

            // Updating the index of the
            // city with the maximum
            // distance to it's closest center
            max = maxindex(dist, n);
        }

        // Printing the maximum distance
        // of a city to a center
        // that is our answer
        System.out.println(dist[max]);

        // Printing the cities that
        // were chosen to be made
        // centers
        for (int i = 0; i < centers.size(); i++) {
            System.out.print(centers.get(i) + " ");
        }
        System.out.print("\n");
    }

    // Driver Code
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(new FileReader("pmed1.txt"));
        int numArestas = 0;
        String temp = "";
        //numArestas = Integer.parseInt(in.nextLine());
        temp = in.nextLine();
        System.out.println(temp);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            //System.out.println(line);
        }



        // Function Call
        //selectKcities(n, weights, k);
    }
}
