package medpack;
public class displayMsgs{
    public void welcome(){
        System.out.println("\t\t\t\t#       #  #####  #       #####  ######  ###   ###  #####    | | ");
        System.out.println("\t\t\t\t#       #  #      #       #      #    #  #  # #  #  #        | | ");
        System.out.println("\t\t\t\t#   #   #  #####  #       #      #    #  #   #   #  #####    | | ");
        System.out.println("\t\t\t\t#  # #  #  #      #       #      #    #  #       #  #            ");
        System.out.println("\t\t\t\t###   ###  #####  ######  #####  ######  #       #  #####    * * ");
        System.out.println();
    }
    public void description(){
        String text="Hi!. This is you personal Medical Assistant.";
        for (int i=0;i<text.length();i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(30); 
            }
            catch(InterruptedException ie1){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
        String intro="I can assist you with finding symptoms of a disease and also help you to find possible diseases for some particular symptoms.\n NOTE: Please use an underscore(_) instead of space wherever required while entering information.";
        for (int i=0;i<intro.length();i++){
            System.out.printf("%c", intro.charAt(i));
            try{
                Thread.sleep(30); 
            }
            catch(InterruptedException ie2){
                Thread.currentThread().interrupt();
            }
        } 
        System.out.println();
    }
    public void load(){
        String dots="......";
        System.out.print("Loading");
        for(int i=0;i<dots.length();i++){
            System.out.printf("%c", dots.charAt(i));
            try{
                Thread.sleep(600);
            }
            catch(InterruptedException ie3){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
    public void diseaseLoad(){
        String dots=".....";
        System.out.print("Possible Diseases Loading");
        for(int i=0;i<dots.length();i++){
            System.out.printf("%c", dots.charAt(i));
            try{
                Thread.sleep(600);
            }
            catch(InterruptedException ie4){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
    public void symptomsLoad(){
        String dots=".....";
        System.out.print("Possible Symptoms Loading");
        for(int i=0;i<dots.length();i++){
            System.out.printf("%c", dots.charAt(i));
            try{
                Thread.sleep(600);
            }
            catch(InterruptedException ie4){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
    public void menu(){
        System.out.println();
        System.out.println("\t\t\tMENU");
        System.out.println("1. Symptom Information");
        System.out.println("2. Disease Information");
        System.out.println("3. Project By");
    }
    public void team(){
        System.out.println("Team Members: ");
        System.out.println("Aviral Jain ");
        System.out.println("Ashish Saini ");
        System.out.println("Manan Khatri ");
        System.out.println("Jahnvi Asthana ");
    }

}
