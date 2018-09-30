/**
 * Name: sloanwoodberry
 * Lab Name: StringCompression
 * Lab Purpose
 * Date: 9/21/18
 * Collaborators: None
 */
public class StringCompression {
    public String s;
    public StringCompression(){
        s="";
    }
    public String Disemvoweling(String q){
      String x="";
      for(int i=0;i<q.length();i++){
          if (!((q.charAt(i)=='a')||(q.charAt(i)=='e')||(q.charAt(i)=='i')||(q.charAt(i)=='o')||(q.charAt(i)=='u')||(q.charAt(i)=='y')||
                  (q.charAt(i)=='A')||(q.charAt(i)=='E')||(q.charAt(i)=='I')||(q.charAt(i)=='O')||(q.charAt(i)=='U')||(q.charAt(i)=='Y'))){
              x+=q.charAt(i);
          }
      }
      return x;
    }
    public String CompressionDepression(String q){
        String x="";
        char c=' ';
        int num=0;
        for(int i=0;i<q.length();i++){
            if(i==0){
                c=q.charAt(0);
                num++;
            }
            else {
                if (c==q.charAt(i)){num++;}
                else {
                    x+=""+c+num;
                    c=q.charAt(i);
                    num=1;
                }
            }
            if (i==q.length()-1){
                x+=""+c+num;
            }
        }
        return x;
    }
}
