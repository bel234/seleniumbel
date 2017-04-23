class car {
	public void start ()
	{
		System.out.println("Start the car");
	}	
	public void stop ()
	{
	System.out.println("Stop the car");
	}
}


class ford extends car{
	public void special_feature_ford()
	{
		System.out.println("Special features of Ford");
	}
}


class porsche extends ford{
	public void special_features_porsche()
	{
		System.out.println("Special features of Porsche");
	}
}


class honda extends porsche{
	public void special_features_honda()
	{
		System.out.println("Special features of Honda");
	}
}


class acura extends honda{
	public void special_features_acura()
	{
		System.out.println("Special features of Acura");
	}
}


class mercedes extends acura{
	public void special_features_mercedes()
	{
		System.out.println("Special features of Mercedes");
	}
}



//Main String Starts

public class inheritence {

	public static void main(String[] args) {

ford f = new ford();
		f.start();
		f.stop();
		f.special_feature_ford();
porsche p = new porsche();
		p.start();
		p.stop();
		p.special_feature_ford();
		p.special_features_porsche();
honda h = new honda();
		h.start();
		h.stop();
		h.special_feature_ford();
		h.special_features_porsche();
		h.special_features_honda();
acura a = new acura();
		a.start();
		a.stop();
		a.special_feature_ford();
		a.special_features_porsche();
		a.special_features_honda();
		a.special_features_acura();
mercedes m = new mercedes();
		m.start();
		m.stop();
		m.special_feature_ford();
		m.special_features_porsche();
		m.special_features_honda();
		m.special_features_acura();
		m.special_features_mercedes();
		
	
	}
}

