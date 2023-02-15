//Program to find the largest and smallest word in a string
class SmallLargest{
public static void main(String[] args){     
      String string = "Hi Hello Welcome Bitlabs";    
      String word = "", small = "", large="";    
      String[] words = new String[100];    
      int length = 0;      
      string = string + " ";    
      for(int i = 0; i < string.length(); i++){        
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
            else{        
              words[length] = word;        
              length++;        
              word = "";    
          }  
      }           
      small = large = words[0];        
      for(int j = 0; j < length; j++){        
          if(small.length() > words[j].length())    
              small = words[j];      
          if(large.length() < words[j].length())    
              large = words[j];    
      }  
      
      System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
  }  
}  