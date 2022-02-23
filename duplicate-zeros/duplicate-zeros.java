class Solution {
  public void duplicateZeros(int[] arr) {
    int[] res = new int[arr.length + arr.length];
    int index = 0;
    
    int i = 0;
    while(i < arr.length) {
        if(arr[i] == 0) {
            res[index++] = arr[i];
        }
        res[index++] = arr[i];
        i++;
    }
    System.arraycopy(res, 0, arr, 0, arr.length);  
  }
}