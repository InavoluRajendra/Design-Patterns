package ObserverPattern;

public class CricketData {
	int runs,wickets;
	float overs;
	 CurrentscoreDisplay cdisp;
	 AvgScoreDisplay adisp;
	public CricketData(CurrentscoreDisplay cdisp, AvgScoreDisplay adisp) {
		super();
		this.cdisp = cdisp;
		this.adisp = adisp;
		
	}
	private int getLatWic()
	{
		return 2;
	}
	private float getLatOver()
	{
		return (float )20;
	}
	private int getLatestRun()
	{
		return 100;
	}
	public void dataChanged()
	{
		
		    runs = getLatestRun();
		    wickets = getLatWic();
		    overs = getLatOver();
		    adisp.update(runs, wickets, overs);
		    cdisp.update(runs, wickets, overs);
		
		
	}
}

