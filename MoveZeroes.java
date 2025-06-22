public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] resultado = moveZeroes(nums);
        for(int i=0;i<resultado.length;i++){
            System.out.println(resultado[i]);
        }
    }
    public static int[] moveZeroes(int[] nums) {
        //{2,1};
        //{1,0};
        if(nums.length>1) {
            int ceros = 0;
            for (int i = 0; i < nums.length; i++) {
               if(nums[i]==0){
                    ceros++;
               }
               else if(ceros>0 ){
                int temp=nums[i];
                nums[i]=0;
                nums[i-ceros]=temp;
               }
            }
        }
        return nums;
    }

}
