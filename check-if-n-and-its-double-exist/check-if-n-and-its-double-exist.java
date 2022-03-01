class Solution {
    public boolean checkIfExist(int[] arr) {
    int i=0;
    while(i!= arr.length){
    for(int j=0; j< arr.length; j++){
        if(arr[i] == 2*arr[j] && i != j){
            return true;
        }
    }
        i++;
    }
        return false;
    }
}