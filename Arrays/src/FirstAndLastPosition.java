import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] a={5,7,7,7,7
                ,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(SearchRange(a,target)));
    }

    static int[] SearchRange(int[] nums, int target){
        int[] ans={-1,-1};

        ans[0]= search(nums, target, true);
        if(ans[0]==-1){
            return ans;
        }
        ans[1]= search(nums,target,false);

        return ans;
    }

    static int search(int[] nums, int target, boolean FindFirst){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){

            int mid= start + (end - start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(FindFirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
