class Animal {

    String sound;
    int numberOfLegs;
    //boolean hasTail;
    
    public Animal(){
      
    }
  
    public Animal(String sound, int legsCount){
      numberOfLegs = legsCount;
      this.sound = sound;
    }
  
    public void setSound(String sound){
      this.sound = sound;
    }
  
  
    public void speak(){
     System.out.println(this.sound);
    }
    
    public String getSound(){
      return this.sound;
    }
  
    public int getNumberOfLegs(){
      return numberOfLegs;
    }
    
    public void setNumberOfLegs(int legsCount){
      this.numberOfLegs = legsCount;
    }
    
}