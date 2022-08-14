package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      AvgScoreDisplay a = new AvgScoreDisplay();
	        CurrentscoreDisplay c = new CurrentscoreDisplay();

	        CricketData data = new CricketData(c, a);

	        data.dataChanged();
	 
	    }

	}

