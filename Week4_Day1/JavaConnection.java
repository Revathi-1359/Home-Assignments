package Week4.day1;

public  class JavaConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("The database is connected");
        
    }

    @Override
    public void disconnect() {
        System.out.println("The database is not connected");
        
    }

    @Override
    public void executeupdate() {
        System.out.println("The update is: The database is not connected, right now");

    }

    public static void main(String[] args) {
        JavaConnection java = new JavaConnection();
        java.connect();
        java.disconnect();
        java.executeupdate();
        java.goldloan();

        
    }
}
