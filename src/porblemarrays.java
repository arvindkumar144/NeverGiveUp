public class porblemarrays {
    public static void main(String[] args) {
        //problem1
        /*float[] marks = {45.6f,67.4f,87.45f, 56.67f,23.56f};
        float sum =0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is " + sum);
         */
        /*float[] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float num =45.7f;
        boolean isInArray =false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("the value is presnt in the array");
        }
            else{
                System.out.println("the value is not present in the array");
            }

         */
        /*float[] marks = {56.6f,67.6f,78.67f,45.45f,78.90f};
        float sum =0;
        for(float element:marks){
            sum = sum+ element;
        }
        System.out.println("the value of average marks is " +sum/marks.length);

         */
        //problem4
        /*int[][] mat1 ={ { 1,2,3},
                       {4,5,6}};
        int[][] mat2 = { {2,6,13},
                       {3,7,1}};
        int[][] result = {{0,0,0},
                         {0,0,0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.format("setting value for i= %d and j = %d \n", i, j);
                result[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j]+mat2[i][j];

            }
            System.out.println(" ");
        }

         */
        //problem5
       /* int[] arr = {1,2,3,4,5,6,7};
        int l = arr.length;
        int n = Math.floorDiv(1,2);
        int temp;
        for(int i =0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.println(element+ " ");
        }

        */
        // problem6
        /*int[] arr = {1,2100,3, 455, 5,34,67};
        int max =Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("thi sis the value of maximum element in this array is: " +max);

         */
        /*problem7
        int [] arr = { 1,546, 67,45,678,993};
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of the minimum element in this array is :" +min);

         */
boolean isSorted = true;
int[] arr = {1, 12,3,4,34,67};
for(int i =0; i<arr.length-1; i++){
    if(arr[i]>arr[i+1]){
        isSorted = false;
        break;
    }
}
if(isSorted){
    System.out.println("the array is sorted");
}
else{
    System.out.println("the array is not sorted");
}
        }
    }

