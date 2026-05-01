package Week4.day1;

public class APIClient {
    public void SendRequest(String Endpoint){
        System.out.println(Endpoint);
    }

    public void SendRequest( String Endpoint, String RequestBody, Boolean RequestStatus){
        System.out.println(Endpoint);
        System.out.println(RequestBody);
        System.out.println(RequestStatus);
    }

    public static void main(String[] args) {
        APIClient api = new APIClient();
        api.SendRequest("Specific URL");
        api.SendRequest("Specific URL", "XML", true);
    }

}
