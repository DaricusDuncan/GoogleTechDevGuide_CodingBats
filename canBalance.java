public boolean canBalance(int[] nums) {
  int[] leftArray, rightArray;
  int left = 0, right = 0;
  if(nums.length == 0 || nums.length == 1){ return false; }
  
  for(int i = 0; i < nums.length; i++){
    leftArray = Arrays.copyOfRange(nums, 0, i);
    rightArray = Arrays.copyOfRange(nums, i, nums.length);
    
    left = Arrays.stream(leftArray).sum();
    right = Arrays.stream(rightArray).sum();
    
    if(left == right){ return true; }
  }
  return false;
}
