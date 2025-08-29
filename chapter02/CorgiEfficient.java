// This Java application is provided without data, only
// sufficient code to illustrate the points made in 
// chapter 2

public class CorgiEfficient {
    public static void main(String[] args) {
        
    }

    // Mock function to get an array of Corgi objects
    private static Corgi[] getCorgiArray() {
       // Not implemented; provided for structure.
       return new Corgi[0];
    }
    
    class Corgi {
      private String name;
      
      public Corgi(String name) {
        this.name = name;
      }

      public String getName() {
        return name;
      }
    }
}
