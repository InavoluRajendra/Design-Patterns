package Chainofres;



public abstract class Processor {
 private Processor  nextP ;
 
public Processor(Processor nextP) {
    super();
    this.nextP = nextP;
}

 public void process(Number req) {
     if(nextP !=null)
         nextP.process(req);
 };
}
