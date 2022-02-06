class PrintNumbers{ 
  public static void main(String []args){
         int a,b=1;
        Scanner scanner =new Scanner(System.in);
        a=scanner.nextInt();
        for(int i=1; i<=a; i++){
           if(i%2==0){
               b=-i;
           }
              else{
                b=i;
              }
              System.out.println(b);
     }
  }
}
