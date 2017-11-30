public int maxSpan(int[] nums) {
  
  
  int span = 0;
  int greatestSpan = 0;
  
  
  if(nums.length == 0){ return 0; }
  if(nums.length == 1){ return 1; }
  else{
    for(int left = 0; left < nums.length; left++){
      for(int right = 1; right < nums.length; right++){
        if(nums[left] == nums[right]){
          span = (right - left) + 1;
          if(span > greatestSpan){
            greatestSpan = span;
          }
        }
      }
    }
  }
 
 return greatestSpan; 
}
