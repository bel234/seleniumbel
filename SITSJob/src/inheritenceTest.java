class library{
	public void out ()
	{
		System.out.println("Check Out:");
	}
	
	public void in ()
	{
		System.out.println("Check In:");
	}
	
}


//Fiction, Non Fiction, SyFi, Romance and Self Help

class fiction extends library{
	public void catagory_fiction()
	{
		System.out.println("Books in Fiction Catagory");
	}
}

class non_fiction extends fiction{
	public void catagory_non_fiction()
	{
		System.out.println("Books in Non Fiction Catagory");
	}
}

class syfi extends non_fiction{
	public void catagory_syfi()
	{
		System.out.println("Books in SyFi Catagory");
	}
}

class romance extends syfi{
	public void catagory_romance()
	{
		System.out.println("Books in Romance Catagory");
	}
}

class self_help extends romance{
	public void catagory_self_help()
	{
		System.out.println("Books in Self Help Catagory");
	}
}

//Books- Sorcerers Stone, Chamber of Secrets, Prisoner of Azkaban, Goblet of Fire, 
//Order of the Pheonix, Half Blood Prince, Deathly Hollows

class patron{
	public void books()
	{
	System.out.println("Harry Potter: Sorcerers Stone");
	}
}

class sorcerers_stone extends patron{
	public void Chamber_of_Secrets()
	{
		System.out.println("Harry Potter: Chamber of Secrets");
	}
}

//Main Class Starts Here

public class inheritenceTest {

	public static void main(String[] args) {
		
		fiction f = new fiction();
			f.out();
			f.in();
			
		non_fiction nf = new non_fiction();
			nf.out();
			nf.in();
			nf.catagory_fiction();
			nf.catagory_non_fiction();

	}

}
