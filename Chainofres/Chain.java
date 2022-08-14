package Chainofres;

public class Chain {
Processor chain;
 
public Chain(Processor chain) {
    super();
    this.chain = chain;
}
private void buildChain() {
    chain = new NegativeProcess(new Zeroprocesser(new PositiveProcesser(null)) );
}
public void process(Number req) {
    chain.process(req);
}
public Chain() {
	super();
	buildChain();
	// TODO Auto-generated constructor stub
}
}
