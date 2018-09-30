import java.util.Scanner;

/**
 * Name: sloan woodberry and timea ryan
 * Lab Name: compressdict
 * Lab Purpose
 * Date: 9/28/18
 * Collaborators: None
 */
public class compressdict {
    Dictionary<Integer,String> d;
    Scanner s;
    int x;

    public compressdict(){
        d=new Dictionary<>();
        s=new Scanner(System.in);
        x=0;
    }
    //og version is the value the compress is the key
    public void add(String q){
     x=d.size()+1;
       d.put(x,q);
    }
    public void replace(String OG, String newBoi){
        int q=OG.indexOf(newBoi);
        int end = q+newBoi.length();
        OG= OG.substring(0,q)+ x + OG.substring(end);
    }
    public int depressionCompressionRate(String OG, String compress){
        int length= OG.length();
        int compressLength=compress.length();
        int keyNum = d.size();
        int dictStrLength=0;
        for (int i=0;i<d.size();i++){
            dictStrLength+=d.get(i).length();
        }
        int q=(length-compressLength+keyNum+dictStrLength)/length;
        return q;
    }

    public static void main(String[] args) {
        compressdict cp= new compressdict();
        Scanner s= new Scanner(System.in);
        String q;
        String newboy;
        System.out.println("Enter in some aggression depression compression text");
       q= s.nextLine();
        String change=q;
        System.out.println("enter a word in that you want to compress");
        newboy=s.nextLine();

        cp.add(newboy);
        cp.replace(change,newboy);
        System.out.println("here's your aggression depression: "+change);


        boolean b=true;

        while (b)
        System.out.println("wanna keep compressing?(if yes press 1 if no press 2)");

        if (s.nextInt()==2){ b=false; }
        else {
            System.out.println(" what else to you wnat to transgress compress?");
            newboy=s.nextLine();
            cp.add(newboy);
            cp.replace(change,newboy);
        }

    }
}
