package fr.isika.andre;

public class WhoIam {
	
	public static String whoAreYou(String name) {
		
		String reponse = "Vous etes pas connu de nos services !";
		
		if(name.equals("Camille")) {
			
			reponse = "je suis "+ name;
		}
		
		return reponse;
	}

}
