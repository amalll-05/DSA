public class gratestchar {
    public static void main(String[] args) {
        char[] array = {'c', 'f', 'r', 'x'};
        char target = 'z';
        char search=high(array,target);
        System.out.println(search);
    }
    static char high(char[] array,char target){
        int start=0;
        int end=array.length-1;
        while(start<=end){
                int mid=(start+end)/2;
                if(array[mid]==target){
                    return array[mid];
                } else if(array[mid]>target) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
   return array[start%array.length];
    }

}
