public class ceiling {
   public static  void main(String[] args) {
       int[] array={0,2,4,6,8,9};
       int target=7;
       int ans=ceil(array,target);
       System.out.println(ans);

    }
    static int ceil(int[]ary,int target){
       int start=0;
       int end=ary.length-1;
       if(ary.length==0){
           return -1;
       }
       if(target<0){
           return -1;
       }

       while(start<=end){
               int mid=start+(end-start)/2;
               if(target==ary[mid]){
                   return mid;
               }
               if(target>ary[mid]){
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }
           }
           return ary[start];
   }
}
