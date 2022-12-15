public class dignalsum {
    public static void dignalsumm(int matrix [][]){
        int sum =0;

        //primary sum calculation of the matrix
        // time complexcotiy is very high
        for (int i=0 ;i<matrix.length;i++){
            //primary dignal 
            sum += matrix [i][i];
            //Secondary diganl 
            //condition when i is not equal to j then it will not calculate the sum 
            if(i != matrix.length-1-i){
                sum += matrix [i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args []){
        int matrix [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        dignalsumm(matrix);
    }
}
