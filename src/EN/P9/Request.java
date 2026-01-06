package EN.P9;

public class Request {

    int id;
    String status;

    Request(int id){
        this.id = id;
        status = "pending";
    }

    public String getDetails(){
        return "id: "+id + " - " + "status: "+status;
    }

    public void process(){
        if(status.equals("pending")){
            status = "processing";
        }else if(status.equals("processing")){
            status = "completed";
        }
    }


}
