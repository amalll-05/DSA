import java.util.Arrays;

public class firstndlastpos {
  public static  void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,7,8,8,9};
                int target=7;
                int[] ans=search(array,target);
      System.out.println(Arrays.toString(ans));
  }
    static int[] search(int[] nums,int target){
      int[] ans={-1,-1};
      int start=searchindex(nums,target,true);
      int end=searchindex(nums,target,false);
      ans[0]=start;
      ans[1]=end;
      return ans;
  }
  static int searchindex(int[]nums,int target,boolean findthestartindex){
      int ans=-1;
      int start=0;
      int end=nums.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
           if(nums[mid]<target){
              start=mid+1;
          }
          else if(nums[mid]>target){
              end=mid-1;
          }
          else{
              ans=mid;
             if(findthestartindex){
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
