import java.util.Scanner;

public class LINEAR_SEARCH {
    public static int search(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
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
        int index=search(a,key);
        if(index==-1){
            System.out.println("Key element not found");
        }
        else{
            System.out.println("Found at "+index+" position");
        }
    }
}
