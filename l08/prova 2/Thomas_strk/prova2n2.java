import java.lang.Math;  

public class prova2n2 {
    public static void main(String[] args) {
        
        int[] nums = new int[8];
        boolean flag = true; 

        for(int i = 0; i < nums.length; i++){
            int rands = (int)(Math.random()*91);
            flag = true;

            for(int j = 0; j < nums.length && flag; j++){
                if(rands == nums[j]){
                    flag = false;
                    i--;
                }               
            }

            if (flag) {
                nums[i] = rands;
                System.out.print(nums[i] + " ");   
            }                 
        }
    }
}
