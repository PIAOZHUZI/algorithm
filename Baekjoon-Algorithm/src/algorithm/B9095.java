package algorithm;

import java.util.Scanner;

//1, 2, 3 ���ϱ�
public class B9095 {

	 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] d = new int[11];
        d[0]=1;
        for(int i =1; i<=10; i++){
            for(int j=1; j<=3; j++){
                if(i-j>=0){
                    d[i] = d[i] + d[i-j];
                }
            }
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
