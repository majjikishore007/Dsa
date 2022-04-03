class Sorting{
public static void bubbleSort(int []arr){
    for(int pass =arr.length-1;pass >= 0;pass--){
        for(int i=0;i<=pass-1;i++){
            if(arr[i] >arr[i+1]){
                    // swap the elements
                int temp=arr[i];
                arr[i]=arr[pass];
                arr[pass]=temp;
                
                }
            }
        }
    }
    public static void SelectionSort(int arr[]){ //
        int min,N=arr.length;
        for(int i=0;i<N;i++){
            min=arr[i];

            for(j=i+1;j<N;j++){
                if(arr[j]<min){
                    min=j;
                }
            }
            // swap the min if the current element is greater than the min
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }

    }
    public static void insertionSort(int[] arr){

        int N=arr.length;
        for(int i=1;i<N; i++){
            int key=arr[i-1];
            int j=i-1;

            while(j >=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j=-1;
            }
            arr[j+1]=key;

        }

    }

    public static void main(String[] args){

    }
}