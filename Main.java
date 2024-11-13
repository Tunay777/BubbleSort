public class Main {
    public static void main(String[] args) {
        int [] array=new int[10];
        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*101);
        }
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[] sortedArray=bubbleSort(array);
        System.out.println("Sorted Array: ");
        for (int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
    public static  int [] bubbleSort(int[]array){
        int i;
        int j;
        int temp=0;
        for (i=1;i< array.length;i++){
            for(j=0;j<array.length-i;j++){
                if(array[j]> array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}