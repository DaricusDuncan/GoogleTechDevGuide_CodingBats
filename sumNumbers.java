public int sumNumbers(String str) {
  String extractNum = "0";
  int sumNums = 0;
  
  for(int i = 0; i < str.length(); i++){
    char[] strArray = str.toCharArray();
  
    if( Character.isDigit(strArray[i])){
      extractNum = extractNum + strArray[i];
    }
    else{
      sumNums = sumNums + Integer.valueOf(extractNum);
      extractNum = "0";
    
    }
    //sumNums = sumNums + Integer.valueOf(extractNum);
  }
  sumNums = sumNums + Integer.valueOf(extractNum);
  
  return sumNums ;
}
