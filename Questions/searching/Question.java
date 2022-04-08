public class Question {
	public static int ceil(int [] arr,int key){
		int low =0;int high=arr.length-1;
		while(low<=high){
			int mid=(high+low)/2;
			if(arr[mid]==key){
				return arr[mid];
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
			else {
				high=mid;
			}
	
		}
		return arr[high];	
	}
	
    public static void main(String[] args) {
	
    }
}
