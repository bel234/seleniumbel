
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[] a = {QTP, Selenium, HPALM, Jira};
		 System.out.println(a[2] + " " + a[3]);*/
		
		String[] a = {"QTP,", "Selenium, ", "HP ALM,", "Jira"}; 
		 System.out.println(a[0] + " " + a[1] + a[2] + " " + a[3]); //prints everything
		 
		 //example 2- Prints only 1
		 
		 String automation_software [] = new String [8];
		 automation_software[0] = "QTP";
		 automation_software[1] = "Selenium";
		 automation_software[2] = "HP ALM";
		 automation_software[3] = "Jira";
		 automation_software[5] = "J";
		 automation_software[6] = "Ji";
		 automation_software[7] = "Jir";
	
		 System.out.println(automation_software[1]);
		 
		 	
	}

}
