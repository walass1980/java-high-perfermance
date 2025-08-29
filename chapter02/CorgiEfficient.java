// This Java application is provided without data, only
// sufficient code to illustrate the points made in 
// chapter 2

public class CorgiEfficient {
    public static void main(String[] args) {
        Corgi[] corgis = getCorgiArray(); // You will need to populate this array
        int count = 0;
        int corgisLength = corgis.length; // Store the array length once

        for(int i = 0; i < corgisLength; i++) {
            String name = corgis[i].getName();
            if (name.indexOf('e') != -1) { // Use indexOf for a faster check
                count++;
            }
        }

        System.out.println("Corgis with 'e' in their name: " + count);
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
