class factorial{
   public static void main(String[] args){
  int num=6;
int fact=factorial(num);
System.out.println("the factorial number "+num+" is:"+fact);
}
public static int factorial(int num){
  int fact=1;
    for(int i=1;i<=num;i++){
      fact=fact*i;
     }
return fact;
}
}