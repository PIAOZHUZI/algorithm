package algorithm;

import java.util.Scanner;

//���� 
public class B10828 {


    public static int [] stack;
    public static int size = 0;
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = in.nextInt();
            
        stack = new int[N];
        
        for(int i=0; i<N; i++){
            String str = in.next();
 
			switch (str) {
            
			case "push":
				push(in.nextInt());
				break;
                
			case "pop":
				sb.append(pop()).append('\n');
				break;
                
			case "size":
				sb.append(size()).append('\n');
				break;
                
			case "empty":
				sb.append(empty()).append('\n');
				break;
                
			case "top":
				sb.append(top()).append('\n');
				break;
			}
            
           
        }
         System.out.println(sb);
    }   
    public static void push(int item){
        stack[size] = item;
        size ++;
    }
    public static int pop(){
        int item = -1;
        if(size == 0){
            return item;
        }else{
            item = stack[size -1];
            stack[size-1] = -1;
            size--;
        }
        
        return item;
    }
    
    public static int empty(){
        if(size == 0){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static int top(){
        if(size == 0){
            return -1;
        }else{
            return stack[size -1];
        }
    }
    public static int size() {
		return size;
	}
    
}
