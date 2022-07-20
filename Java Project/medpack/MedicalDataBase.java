package medpack;
import java.io.*;
import java.util.*;
public class MedicalDataBase {
    public void setPatientInfo(String pid, String pname, ArrayList<String> slist, ArrayList<String> dlist){
        File file=new File("C:\\Users\\Aviral\\Desktop\\Java Project\\medicalDatabase.csv");
        try{
            FileWriter fos=new FileWriter(file,true) ;  
            PrintWriter writer=new PrintWriter(fos);
            writer.print(pid);
            writer.print(",");
            writer.print(pname);
            writer.print(",");
            writer.print(slist);
            writer.print(",");
            writer.print(dlist);
            writer.println();
            writer.close();
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
