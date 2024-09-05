import java.util.Scanner;

public class BINARY_SEARCH {
    public static int search(int a[],int key,int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]>key){
                end=mid-1;
            }
            if(a[mid]<key){
                start=mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key element");
        int key=sc.nextInt();
        int index=search(a,key,0,a.length);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found at "+index+" position");
        }
    }
}
