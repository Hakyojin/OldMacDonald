class Chick implements Animal 
{        
     private String myType;     
     private String mySound;  
     public Chick(String type, String sound) 
     {         
         myType = type;         
         mySound = sound;     
     }         
     public Chick(String type, String sound1, String sound2)
     {
     	 myType = type;
	     if(Math.random()*1 < .5)
	     {
	     	mySound = sound2;
	     }      
	     else
	     {
	         mySound = sound1;
	     }
	 }
     public Chick()     
     {         
         myType = "unknown";         
         mySound = "unknown";  
     } 
    public String getSound() {return mySound;}  
    public String getType() {return myType;} 
}