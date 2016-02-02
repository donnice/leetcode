public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1,-1};
            int a = 0, b = nums.length-1;
            while(a<=b){
                if(a==b){
                    if(nums[a]==target) for(int i=0;i<=1;i++) range[i] = a;
                    return range;
                }
                int mid = (a+b)/2;
                if(nums[mid]==target){
                    int newLeft = mid, newRight = mid+1;
                    while(a<=newLeft){
                        if(a==newLeft){
                            range[0] = (nums[a]==target)?a:a+1;
                            break;
                        }
                        else if(nums[(a+newLeft)/2]==target) newLeft = (a+newLeft)/2;
                        else if(nums[(a+newLeft)/2]!=target&&nums[(a+newLeft)/2+1]==target){
                            range[0] = (a+newLeft)/2+1;
                            break;
                        }
                        else a = (a+newLeft)/2;
                    }
                    while(newRight<=b){
                        if(newRight==b){
                            range[1] = (nums[b]==target)?b:b-1;
                            break;
                        }
                        else if(nums[(b+newRight)/2]==target) newRight = (b+newRight)/2+1;
                        else if(nums[(b+newRight)/2]!=target&&nums[(b+newRight)/2-1]==target){
                            range[1] = (b+newRight)/2-1;
                            break;
                        }
                        else b = (b+newRight)/2;
                    }
                    return range;
                }
                else if(nums[mid]>target) b = mid-1;
                else a = mid + 1;
            }
            return range;
    }
}