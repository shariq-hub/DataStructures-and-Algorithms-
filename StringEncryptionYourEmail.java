public class StringEncryption {
    public static void main(String[] args) {
        String a="tc2eo.nkq8apf0yh4z95gblsj1iwu@x3v76";
        char []ch=a.toCharArray();
        String email="shariqshaikh226@gmail.com";
        char []ch1=email.toCharArray();
        String numbers="";
        for(int i=0; i<ch1.length; i++){
            for(int j=0; j<a.length(); j++)
            if(ch1[i]==ch[j]){
                numbers+=j;
                break;
            }
           else if(ch1[i]!=ch[j]&&j==a.length()-1){
                numbers+="biz";
            }
        
        }
        System.out.println(numbers);

    }
    
}
