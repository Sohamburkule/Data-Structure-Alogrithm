package Basics;
import java.util.Arrays;

public class LCQ189
{
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){

        int[] nums=new int[]{1,2,3,4,5,6,7};
        int n=nums.length;
        int k=3;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }
}
