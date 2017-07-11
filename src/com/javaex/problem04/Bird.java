package com.javaex.problem04;

public abstract class Bird {
	
    private String name;
    
    public void setName(String name){
    	
    	this.name = name; 
    	
    }
    
    public String getName(){ 	
   
    	return name;
    }
    
    abstract public void sing();

    abstract public void fly();

    abstract public void showName();

}
