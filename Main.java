public class Main {
    public static void main(String[] args) {
        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{1,2,3});
        Matrix.insertRow(new int[]{4,5,6});
        Matrix.insertRow(new int[]{7,8,9});
        Matrix matrixA = Matrix.create();

        System.out.println("Matrix A:");
        matrixA.print();
        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{9,8,7});
        Matrix.insertRow(new int[]{6,5,4});
        Matrix.insertRow(new int[]{3,2,1});
        Matrix matrixB = Matrix.create();

        System.out.println("Matrix B:");
        matrixB.print();
        matrixA.add(matrixB);

        System.out.println("Matrix A after adding B");
        matrixA.print();
        matrixA.subtract(matrixB);

        System.out.println("Matrix A after subtracting B");
        matrixA.print();
        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{6,3,2});
        Matrix.insertRow(new int[]{14,5,7});
        Matrix.insertRow(new int[]{27,5,15});
        Matrix matrixC= Matrix.create();

        System.out.println("Matrix (A+B)-C+(A-C)");
        Matrix.add(matrixA,matrixB)
                .subtract(matrixC)
                .add(matrixA.subtract(matrixC))
                .print();

    }

}

class Matrix{
    static int[][] tablica;
    int[][] tablica2;
    static int rowsInserted;

    void print(){
        for(int i = 0; i < tablica2.length; i++){
            System.out.print("| ");
            for(int j = 0; j < tablica2[i].length; j++){
                System.out.print(tablica2[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    Matrix add(Matrix m){
        for(int i = 0 ; i < this.tablica2.length; i++){
            for(int j = 0; j < this.tablica2[i].length; j++){
                this.tablica2[i][j] += m.tablica2[i][j];
            }
        }
        return this;
    }

    static Matrix add(Matrix m1, Matrix m2){
        for(int i = 0; i < m1.tablica2.length; i++){
            for(int j = 0; j < m1.tablica2[i].length; j++){
                m1.tablica2[i][j] = m1.tablica2[i][j] + m2.tablica2[i][j];
            }
        }
        return m1;
    }

    Matrix subtract(Matrix m){
        for(int i = 0 ; i < this.tablica2.length; i++){
            for(int j = 0; j < this.tablica2[i].length; j++){
                this.tablica2[i][j] -= m.tablica2[i][j];
            }
        }
        return this;
    }

    Matrix subtract(Matrix m1, Matrix m2){
        Matrix wynik = new Matrix(tablica);
        for(int i = 0; i < m1.tablica2.length; i++){
            for(int j = 0; j < m1.tablica2[i].length; j++){
                wynik.tablica2[i][j] = m1.tablica2[i][j] - m2.tablica2[i][j];
            }
        }
        return wynik;
    }

    static void setUpMatrix(int rowCount, int columnCount){
        tablica = new int[rowCount][columnCount];
    }

    static void insertRow(int[] row){
        if(rowsInserted < tablica.length){
            for(int i = rowsInserted; i < tablica.length; i++) {
                for(int j = 0; j < row.length; j++){
                    tablica[i][j] = row[j];
                }
            }
            rowsInserted++;
        }
    }

    static Matrix create(){
        return new Matrix(tablica);
    }

    private Matrix(int[][] tablica) {
        tablica2 = new int[tablica.length][tablica[0].length];
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                this.tablica2[i][j] = tablica[i][j];
            }
        }
        this.rowsInserted = 0;
    }
}
