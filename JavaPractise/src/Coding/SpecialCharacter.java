package Coding;

public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SpecialCharacterRemove=""; 
    String s="Sima@0349%!!";
    int count=0;
    
    for(int i=0;i<s.length(); i++)
    {
    	
    	if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))&& 
    			!Character.isWhitespace(s.charAt(i))) {
    	  count++;
    }
    	else {
    		SpecialCharacterRemove= SpecialCharacterRemove + s.charAt(i);
    	}
	}
    if(count==0) 
    {
    	System.out.println("There is no special character");
    }
    else {
    	System.out.println("special character found"+ count);
    }
    System.out.println("Special Character Remove"+SpecialCharacterRemove);
}
}
