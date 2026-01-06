package EN.P9;

public class BatchProcessor {

    public void processAndLog(Request[] batch){
        for (Request r : batch) {
            if(r instanceof Loggable){
                ((Loggable) r).log();
            }
            r.process();
        }
    }

    public static void main(String[] args) {
        Request[] requests = new Request[3];
        requests[0] = new DbRequest(1,"SELECT *");
        requests[1] = new LLMRequest(2,"Hi chatgpt");
        requests[2] = new WebRequest(3,"http://google.com");
        BatchProcessor bp = new BatchProcessor();
        bp.processAndLog(requests);
        bp.processAndLog(requests);
        bp.processAndLog(requests);
    }
}
