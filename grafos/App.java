import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws IOException {
        Floyd teste = new Floyd();
        Scanner in = new Scanner(new FileReader("arq//teste1.txt"));
        //numArestas = Integer.parseInt(in.nextLine());
        String[] x = in.nextLine().split(" ");
        int v = Integer.parseInt(x[0]);
        int a = Integer.parseInt(x[1]);
        int k = Integer.parseInt(x[2]);
        teste.setMatriz(v, a, k);
        /* teste.iniciarMatriz(); */
        while (in.hasNextLine()) {
            x = in.nextLine().split(" ");
            int v1 = Integer.parseInt(x[0]);
            int v2 = Integer.parseInt(x[1]);
            int custo = Integer.parseInt(x[2]);
            teste.addDistancia(v1, v2, custo);
        }
        teste.toString();
    }
}