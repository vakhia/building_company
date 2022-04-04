import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args){
        BasicConfigurator.configure();
        Builder builder = new Builder("Alex","Killerwhale",19,20000,30);
        System.out.println(builder.Build());
    }
}
