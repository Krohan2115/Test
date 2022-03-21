public class ArrayPairSum {

    public static void main(String[] args) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray={1,2,3,4,5,6,7,8,9};
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);

                for(int element: sumArray){
                        System.out.println(element);
                }
                }

    public int[] sumOfArrayPair(int numberArray[]){
                int[] newarr;
                if(numberArray.length%2!=0){
                        int last=numberArray[numberArray.length-1];
                        int n=numberArray.length/2;
                        newarr=new int[n+1];
                        int j=0;
                        for(int i=0;i<numberArray.length-1;i=i+2){
                                newarr[j]=numberArray[i]+numberArray[i+1];
                                j++;
                                
                                }
                        newarr[n]=last;

                        }else{
                                
                        int n=numberArray.length/2;
                        newarr=new int[n];
                        int j=0;
                        for(int i=0;i<numberArray.length;i=i+2){
                                newarr[j]=numberArray[i]+numberArray[i+1];
                                j++;
                        
                                }

                        }
                
                 return newarr;
    }}
