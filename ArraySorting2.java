public class ArraySorting2 {
    public static void main(String[] args) {

        int a[]={10,2,5,1,9,3};

        int min_index=0;

        boolean flag=false;

        for(int i=min_index; i<a.length;){

            int  min_number=a[i],b=min_number;

            for(int j=i+1;j<a.length;j++){

                if(a[j]<min_number){

                    min_number=a[j];

                    b=min_number;

                    min_index=j;

                    flag=true;
                }
            }
            if(flag) {
                i = min_index + 1;
                flag=false;
            }
            else{
                i=i+1;
            }
            System.out.print( " "+b );
        }
    }
}

