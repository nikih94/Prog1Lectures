package EN.P9;

public class LLMRequest extends Request implements Loggable {

    String prompt;

    LLMRequest(int id,String prompt) {
        super(id);
        this.prompt = prompt;
    }

    @Override
    public void log() {
        System.out.println(getDetails());
    }
}
