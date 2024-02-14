
public class prova2n1{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4};
        int[] nums2 = new int[nums.length];
        int occorr = 0;
        int stamp = 0;

        for(int i = 0; i<nums.length; i++){
            stamp = nums[i];
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == stamp){
                    occorr++;
                }
            }
            if(occorr==1){
                System.out.print(stamp + ",");
            }
            occorr = 0;
        }
    }
}