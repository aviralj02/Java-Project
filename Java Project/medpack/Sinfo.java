package medpack;
import java.io.*;
import java.util.*;
public class Sinfo{
    static void UnrecognizedSymptomException() throws NoSuchElementException{
        throw new NoSuchElementException();
    }
    static void UnrecognizedDiseaseException() throws NoSuchElementException{
        throw new NoSuchElementException();
    }

    //SYMPTOM METHOD
    public void addSymptom(String symptom, ArrayList<String> arrSymptoms) throws FileNotFoundException{
        File sfile=new File("C:\\Users\\Aviral\\Desktop\\Java Project\\symptoms.txt");
        Scanner sc=new Scanner(sfile);
        try{
            Boolean check=sc.hasNext();
            while(check){
                String stxt=sc.nextLine();     //stxt is symptoms from txt file
                if(symptom.equals(stxt)){
                    arrSymptoms.add(symptom);
                    break;
                }
            }
            if (arrSymptoms==null){
                UnrecognizedSymptomException();
            }
        }
        catch(NoSuchElementException s){
            System.out.println();
            System.out.println("UnrecognizedSymptomException has occurred");
        }
        sc.close();
    }

    //DIAGNOSIS DISEASE METHOD
    public String[] diagnosis(ArrayList<String> arrSymptoms){
        HashSet<String> d=new HashSet<String>();   //Unique value ArrayList
        try{
            if (arrSymptoms.contains("fever") || arrSymptoms.contains("cough") ||  arrSymptoms.contains("runny nose")){
                d.add("common_cold");
                d.add("flu");
                d.add("viral_infection");
            }
            if(arrSymptoms.contains("chills") && arrSymptoms.contains("abdominal_pain") && arrSymptoms.contains("fever")){
                d.add("jaundice");
            }
            if(arrSymptoms.contains("sweating") && arrSymptoms.contains("muscle_pain") && arrSymptoms.contains("nausea")){
                d.add("malaria");
                d.add("covid-19");
            }
            if(arrSymptoms.contains("lack_of_taste") || arrSymptoms.contains("lack of smell") || arrSymptoms.contains("shortness_of_breath")){
                d.add("covid-19");
            }
            if(arrSymptoms.contains("fever") && arrSymptoms.contains("headache") && arrSymptoms.contains("constipation")){
                d.add("typhoid");
            }
            if(arrSymptoms.contains("fever") && arrSymptoms.contains("bruising")){
                d.add("dengue");
            }
            if(arrSymptoms.contains("shortness_of_breath") && arrSymptoms.contains("chest_pain")){
                d.add("asthma");
            }
            if(arrSymptoms.contains("shortness_of_breath") && arrSymptoms.contains("chills")){
                d.add("pneumonia");
            }
            if(arrSymptoms.contains("swelling") && arrSymptoms.contains("joint_pain")){
                d.add("arthritis");
            }
            if(arrSymptoms.contains("blurred_vision") && arrSymptoms.contains("frequent_urination")){
                d.add("diabetes");
            }
            if(arrSymptoms.contains("dizziness") && arrSymptoms.contains("headache") && arrSymptoms.contains("nausea")){
                d.add("migraine");
            }
            if(arrSymptoms.contains("overweight")){
                d.add("obesity");
            }
            if(arrSymptoms.contains("diarrhea") && arrSymptoms.contains("dehydration")){
                d.add("cholera");
                d.add("viral_infection");
            }
            if(arrSymptoms.contains("cough") && arrSymptoms.contains("weight_loss") && arrSymptoms.contains("fever")){
                d.add("tuberculosis");
            }
            if(arrSymptoms.contains("dizziness") && arrSymptoms.contains("fever") && arrSymptoms.contains("weakness") && arrSymptoms.contains("headache")){
                d.add("rabies");
            }
            if(arrSymptoms.contains("abdominal_pain") || arrSymptoms.contains("chest_pain") || arrSymptoms.contains("loss_of_appetite") || arrSymptoms.contains("stomache")){
                d.add("ulcers");
            }
            if(arrSymptoms.contains("fever") && arrSymptoms.contains("rash")){
                d.add("chickenpox");
            }
            if(arrSymptoms.contains("weakness")){
                d.add("common_cold");
                d.add("flu");
            }
            if(arrSymptoms.contains("constipation")){
                d.add("hemorrhoids");
            }
            if (d==null){
                UnrecognizedDiseaseException();
            }
        }
        catch(NoSuchElementException di){
            System.out.println("UnrecognizedDiseaseException has occured");
        }
        String[] dArray=new String[d.size()];
        d.toArray(dArray);
        return dArray;
    }
}