public String stringSplosion(String str) {

  String patternStr = "";

  for(int i = 0; i < str.length(); i++){

    patternStr = patternStr + str.substring(0,i + 1);

  }

  return patternStr;

}
