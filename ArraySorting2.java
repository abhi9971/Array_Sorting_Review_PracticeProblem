import java.util.Scanner;

public class ArraySorting2 {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");

        n=sc.nextInt();                                          //reading the number of elements from the that we want to enter

        int[] array = new int[n];                                //creates an array in the memory of length n

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();                                //reading array elements from the user
        }

        int min_index=0;

        boolean flag=false;

        for(int i=min_index; i<array.length;){

            int  min_number=array[i],b=min_number;

            for(int j=i+1;j<array.length;j++){

                if(array[j]<min_number){

                    min_number=array[j];

                    b=min_number;

                    min_index=j;

                    flag=true;
                }
            }
            if(flag) {                                             //update the value of i for first loop
                i = min_index + 1;
                flag=false;
            }
            else{
                i=i+1;
            }
            System.out.print( " "+b );                            //print minimum value
        }
    }
}

