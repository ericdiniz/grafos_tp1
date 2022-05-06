public class Floyd{
    public double[][] mDistancia;
    public int maxVertices;
    public int maxArestas;
    public int maxK;
    public Floyd(){
    }
    public void setMatriz(int maxVertices,int maxArestas,int maxK){
        this.maxVertices = maxVertices+1;
        this.maxArestas = maxArestas;
        this.maxK = maxK;
        this.mDistancia = new double[this.maxVertices][this.maxVertices];
    }
    public void iniciarMatriz(){
        for(int i=0;i<maxVertices;i++){
            for(int j=0;j<maxVertices;j++){
                if(j!=i){
                    mDistancia[i][j]=Double.POSITIVE_INFINITY;
                } else{
                    mDistancia[i][j]=0;
                }
            }
        }
    }
    public void addDistancia(int i, int j, int custo){
        this.mDistancia[i][j] = custo;        
    }
    public void ajustarDistancia(){
        for(int k = 0; k<maxVertices; k++){
            for(int i = 0; i<maxVertices; i++){
                for(int j=0; j<maxVertices; j++){
                    if(i==j){
                        mDistancia[i][j]=0;
                    }
                    if(mDistancia[i][j]>mDistancia[i][k]+mDistancia[k][j]){
                        mDistancia[i][j] = (mDistancia[i][k]+mDistancia[k][j]);
                    }
                }
            }
        }
    }
    public void encontrarCentro(){
        int[] arrayExent = new int[maxVertices];
        for (int i = 0; i < mDistancia.length; i++) {
            arrayExent[i] = (int)mDistancia[i][0];
            for (int j = 1; j < mDistancia.length; j++) {
                if(mDistancia[i][j]>arrayExent[i]){
                    arrayExent[i] = (int)mDistancia[i][j];
                }
            }
        }
        int exentricidade = 0;
        for (int i = 0; i < arrayExent.length; i++) {
            if(arrayExent[exentricidade]<arrayExent[i]){
                exentricidade = i;
            }
        }
    }
    @Override
    public String toString() {
        for (int i = 0; i < maxVertices; ++i) {
            for (int j = 0; j < maxVertices; ++j) {
              if (mDistancia[i][j] == Double.POSITIVE_INFINITY)
                System.out.print("INF ");
              else
                System.out.print(mDistancia[i][j] + "  ");
            }
            System.out.println();
          }
        return " ";
    }
}