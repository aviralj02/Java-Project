package medpack;
import java.io.*;
import java.util.*;

public class Dinfo {
    static void UnrecognizedDiseaseException() throws NoSuchElementException{
        throw new NoSuchElementException();
    }
    public ArrayList<String> findSymptoms(String disease) throws FileNotFoundException{
        File dfile=new File("C:\\Users\\Aviral\\Desktop\\Java Project\\disease.txt");
        Scanner sc=new Scanner(dfile);
        ArrayList<String> symptomsAL=new ArrayList<String>();
        Boolean diseaseFound=false;
        try{
            while(sc.hasNext()){
                String dtxt=sc.nextLine();
                if (disease.equals(dtxt)){
                    if (disease.equals("malaria")){
                        symptomsAL.add("fever");
                        symptomsAL.add("chills");
                        symptomsAL.add("headache");
                        symptomsAL.add("muscle_pain");
                        diseaseFound=true;
                    }
                    else if(disease.equals("chickenpox")){
                        symptomsAL.add("fever");
                        symptomsAL.add("rash");
                        diseaseFound=true;
                    }
                    else if(disease.equals("common_cold")){
                        symptomsAL.add("fever");
                        symptomsAL.add("runny_nose");
                        symptomsAL.add("cough");
                        symptomsAL.add("sore_throat");
                        diseaseFound=true;
                    }
                    else if(disease.equals("dengue")){
                        symptomsAL.add("fever");
                        symptomsAL.add("nausea");
                        symptomsAL.add("bruising");
                        symptomsAL.add("rash");
                        diseaseFound=true;
                    }
                    else if (disease.equals("pneumonia")){
                        symptomsAL.add("chest_pain");
                        symptomsAL.add("fever");
                        symptomsAL.add("nausea");
                        symptomsAL.add("weakness");
                        diseaseFound=true;
                    }
                    else if (disease.equals("arthritis")){
                        symptomsAL.add("swelling");
                        symptomsAL.add("joint_pain");
                        symptomsAL.add("muscle_pain");
                        diseaseFound=true;
                    }
                    else if(disease.equals("asthma")){
                        symptomsAL.add("shortness_of_breath");
                        symptomsAL.add("chest_pain");
                        diseaseFound=true;
                    }
                    else if(disease.equals("cholera")){
                        symptomsAL.add("nausea");
                        symptomsAL.add("dehydration");
                        symptomsAL.add("diarrhea");
                        diseaseFound=true;
                    }
                    else if(disease.equals("covid-19")){
                        symptomsAL.add("shortness_of_breath");
                        symptomsAL.add("lack_of_taste");
                        symptomsAL.add("lack_of_smell");
                        symptomsAL.add("fever");
                        symptomsAL.add("sore_throat");
                        diseaseFound=true;
                    }
                    else if(disease.equals("diabetes")){
                        symptomsAL.add("frequent_urination");
                        symptomsAL.add("blurred_vision");
                        symptomsAL.add("weight_loss");
                        diseaseFound=true;
                    }
                    else if(disease.equals("jaundice")){
                        symptomsAL.add("fever");
                        symptomsAL.add("abdominal_pain");
                        symptomsAL.add("chills");
                        diseaseFound=true;
                    }
                    else if (disease.equals("migraine")){
                        symptomsAL.add("headache");
                        symptomsAL.add("nausea");
                        diseaseFound=true;
                    }
                    else if (disease.equals("obesity")){
                        symptomsAL.add("overweight");
                        diseaseFound=true;
                    }
                    else if (disease.equals("rabies")){
                        symptomsAL.add("weakness");
                        symptomsAL.add("fever");
                        symptomsAL.add("headache");
                        symptomsAL.add("dizziness");
                        diseaseFound=true;
                    }
                    else if (disease.equals("tuberculosis")){
                        symptomsAL.add("cough");
                        symptomsAL.add("fever");
                        symptomsAL.add("sweating");
                        symptomsAL.add("chills");
                        diseaseFound=true;
                    }
                    else if(disease.equals("typhoid")){
                        symptomsAL.add("fever");
                        symptomsAL.add("stomache");
                        symptomsAL.add("headache");
                        diseaseFound=true;
                    }
                    else if(disease.equals("ulcers")){
                        symptomsAL.add("nausea");
                        symptomsAL.add("abdominal_pain");
                        symptomsAL.add("stomache");
                        symptomsAL.add("chest_pain");
                        diseaseFound=true;
                    }
                    else if(disease.equals("viral_infection")){
                        symptomsAL.add("fever");
                        symptomsAL.add("sore_throat");
                        symptomsAL.add("runny_nose");
                        symptomsAL.add("cough");
                        diseaseFound=true;
                    }
                    else if(disease.equals("flu")){
                        symptomsAL.add("fever");
                        symptomsAL.add("muscle_pain");
                        symptomsAL.add("nausea");
                        symptomsAL.add("weakness");
                        diseaseFound=true;
                    }
                    else if(disease.equals("haemorrhoids")){
                        symptomsAL.add("constipation");
                        symptomsAL.add("swelling");
                        diseaseFound=true;
                    }
                    break;
                }
            }  //end of while
            if(diseaseFound==false){
                UnrecognizedDiseaseException();
            }
        }
        catch(NoSuchElementException ns){
            System.out.println("UnrecognizedDiseaseException has occurred");
        }
        sc.close();
        return symptomsAL;
    }
}
