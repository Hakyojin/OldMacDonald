class NamedCow extends Cow 
{    
  private String cowName;
  public NamedCow(String type, String name, String sound){
  		myType = type;
  		mySound = sound;
  		cowName = name;
  }
  public NamedCow(){
  	cowName = "unknown";
  }
  public String getName(){return cowName;}
}
