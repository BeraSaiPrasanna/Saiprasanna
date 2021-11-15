class pattern8{
  public static void main(String[] args){
  int space=3,star=0;
for(int i=1;i<=5;i++){
   if(i<=2){
 space--;
 star++;
}
  else{
  space++;
   star--;
   }
for(int j=1;j<=space;j++){
  System.out.print(" ");
}
for(int j=1;j<=star;j++){
   System.out.print("*");
}
System.out.println();
}
}

  }
