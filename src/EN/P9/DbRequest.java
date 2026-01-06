package EN.P9;

public class DbRequest extends Request{

    String query;

    DbRequest(int id,String query){
        super(id);
        this.query = query;
    }
}
