import java.util.Random;

public class Expt7 {
    public static void main(String []args){
        int []a = new int[10_000];
        int []b = new int[10_000];
        int count =0 ;
        Random ran = new Random();
        for(int i=0;i<10000 ; i++){
            a[i]=1+ran.nextInt(6);
            b[i]=1+ran.nextInt(6);

            if(a[i]==b[i]){
                System.out.print("( "+a[i]+","+b[i]+" )\t");
                count++;
            }
        }

        System.out.println("\nNumber of doubles : "+count);


    }
}
