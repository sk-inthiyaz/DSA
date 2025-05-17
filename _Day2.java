// 	//to roatte array I use reverse function here
// 	static void reverse(int arr[],int start,int end){
//         while(start<end){
//             int temp=arr[start];
// 			arr[start]=arr[end];
// 			arr[end]=temp;
// 			start++;
// 			end--;
// 		 }
// 	}
// 	public static void main(String args[]) {
		
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		int arr[]=new int[n];
// 		for(int i=0;i<n;i++){
// 			arr[i]=sc.nextInt();

// 		}
// 		int k=sc.nextInt();
// 		reverse(arr,0,k-1);
// 		reverse(arr,k,n-1);
// 		reverse(arr,0,n-1);

// 		for(int i=0;i<n;i++){
// 			System.out.print(arr[i]+" ");
// 		}
// 		int i=0;
// 		System.out.println();
		
// 	}
// }

public class _Day2 {
	//moving zeros to right side --->Brute code
	/*
	public static void main(String[] args) {
		int[] arr = {1,0,2,3,2,0,0,4,5,1};
		int n=arr.length;
		int k=0;
		int j=0;
		int[] temp= new int[n];
		for(int i=0;i<n;i++){
			if(arr[i]!=k){
				temp[j]=arr[i];
				j++;
			}
		}
		for(int i=j;i<n;i++){
			arr[i]=0;
		}
		for(int i=0;i<j;i++){
			arr[i]=temp[i];
		}
		for(int i:arr){
			System.out.println(i + " ");
		}
	}
	*/
//Union of an array
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,5,6};
		int m = nums1.length;
		int n = nums2.length;
		int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }
            else{
                nums1[i--]=nums2[p2--];
            }
        }
		for(int j:nums1){	
			System.out.println(j + " ");
		}
	}
}