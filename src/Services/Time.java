package Services;

public class Time {
    
    public static String converteParaSQL (String Data){
        return Data.substring(6, 10)  + "-" + Data.substring(3, 5) + "-"  + Data.substring(0, 2);
    }
    
    public static String converterParaJava (String Data){
        return Data.substring(8, 10) + "/" + Data.substring(5, 7) + "/" + Data.substring(0, 4);
    }
    
    public static void main (String args[]){
        System.out.println(Time.converterParaJava("2012-10-30"));
    }
    
}
