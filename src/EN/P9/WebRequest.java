package EN.P9;

public class WebRequest extends Request implements Loggable{

    String url;

    WebRequest(int id,String url) {
        super(id);
        this.url = url;
    }

    @Override
    public void log() {
        System.out.println(getDetails());
    }
}
