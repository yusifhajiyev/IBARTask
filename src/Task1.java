import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Random r=new Random();
        Scanner sc=new Scanner(System.in);

        //including of array sizes

        System.out.print("m=");
        int m=sc.nextInt();

        System.out.print("n=");
        int n=sc.nextInt();

        Integer [][] array = new Integer [m][n];

        //fill of array

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                System.out.print((array[i][j]=r.nextInt(200))+" ");
            }
            System.out.println("\n");

        }


        //main part of task


        System.out.println("Choose direction: 1 or 2");

        int direction=sc.nextInt();

        switch (direction){

            case 1 :
                for(int i=0;i<m*n;i++){

                    int j=Math.abs(((n - 1) * ((i / n % 2)) - (i % n)));

                    System.out.print(array[i / n][j]+" ");

                }
                break;

            case 2 :
                for(int i=0;i<m*n;i++){

                    int j=Math.abs(((n - 1) * (i / n % 2)+(i % n)-(n-1)));

                    System.out.print(array[i / n][j]+" ");

                }
                break;
            default:
                break;

        }


    }


}
