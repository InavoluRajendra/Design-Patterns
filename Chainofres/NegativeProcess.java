package Chainofres;

public class NegativeProcess extends Processor {
	 
    public NegativeProcess(Processor nextP) {
        super(nextP);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void process(Number req) {
        // TODO Auto-generated method stub
        if(req.getNumber()<0) {
            System.out.println("negativeProcessor "+req.getNumber());
        }else {
        super.process(req);
    }
    }
 
}