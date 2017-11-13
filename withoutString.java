public String withoutString(String base, String remove) {
  
  
  base =  base.replaceAll(remove.toLowerCase(),"");
  base =  base.replaceAll(remove.toUpperCase(),"");
  base =  base.replaceAll(remove,"");
  
  return base;
}
