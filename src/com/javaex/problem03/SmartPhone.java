package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	  if("음악".equals(str)){
              playMusic();
    	  }else if("앱".equals(str)) {
    		  app();
    	  }else if("통화".equals(str)){
              super.execute(str);
          }
    	
        //코드작성
        
    }
 
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    protected void app(){
        System.out.println("앱실행");
    }
    //메소드작성
    
    
    
}
