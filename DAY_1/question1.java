import java.util.*;
 
public class question1{
   public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=in.nextInt();
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                System.out.print(n-(Math.min(Math.min(top,bottom), Math.min(left,right))) + " ");
            }
            System.out.println();
            in.close();
        }
    }

}
