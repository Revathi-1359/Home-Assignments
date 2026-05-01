package Week4.day1;

public interface DatabaseConnection {
    public  void connect();
    public void disconnect();
    public void executeupdate();

    public default void goldloan(){
        System.err.println("The rate is 7%");
        
    }

}














