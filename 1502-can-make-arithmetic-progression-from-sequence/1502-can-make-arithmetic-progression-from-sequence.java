class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[1]){
                System.out.println(arr[0]);
            }
            else{
                System.out.println(arr[1]);
            }
        }
            Arrays.sort(arr);
            int difference = arr[1]-arr[0];
            for(int i=2;i<arr.length;i++){
                if(arr[i]-arr[i-1]!=difference){
                    return false;
                }
            }
            return true;
        
        
    }
}