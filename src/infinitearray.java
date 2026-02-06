public class infinitearray {
   public static void main(String[] args) {

       int[] array = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250};
     int target=7;
       System.out.println(finder(array,target));

    }
    static int finder(int[]array,int target){
       int start=0;
       int end=1;
       while(target>array[end]){
           int temp=end+1;//temp is the new start.
           end=end+(end-start+1)*2;
           start=temp;
       }
       return binarysearch (array,target,start,end);
    }
    static int binarysearch(int[] arrray,int target,int start,int end){
        if(target<0){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arrray[mid]){
                return mid;
            }
            else if(target>arrray[mid]){
                start=mid+1;
            }
            else if(target<arrray[mid]){
                end=mid-1;
            }

            else{
                return mid;
            }

        }

   return -1;
   }

    }

