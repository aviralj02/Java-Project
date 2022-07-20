import java.util.*;
import java.io.*;

import medpack.displayMsgs;
import medpack.MedicalDataBase;
import medpack.Sinfo;
import medpack.Dinfo;

public class AssistantMain {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(System.in);
        MedicalDataBase mdb=new MedicalDataBase();
        displayMsgs pub=new displayMsgs();

        pub.welcome();
        pub.description();
        pub.load();

        System.out.print("Enter Patient ID (Example: P001): ");
        String pid=sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String pname=sc.nextLine();  

        while(true){
            pub.menu();
            int ch;
            System.out.print("Enter you choice: ");
            ch=sc.nextInt();
            if (ch==1){
                System.out.print("How many symptoms do you have? : ");
                int n=sc.nextInt();
                String arr[]=new String[n];
                for (int i=0;i<n;i++){
                    System.out.print("Enter "+(i+1)+"st symptom: ");
                    arr[i]=sc.next().toLowerCase();
                }
                Sinfo r=new Sinfo();
                ArrayList<String> arrSymptoms=new ArrayList<String>();
                for (int j=0;j<n;j++){
                    r.addSymptom(arr[j], arrSymptoms);
                }
                System.out.println();
                System.out.println("Symptoms Recorded successfully");
                System.out.println();

                String[] diseaseArray = r.diagnosis(arrSymptoms);    //Diagnosis for disease

                int dlen = diseaseArray.length;
                pub.diseaseLoad();
                for (int i=0;i<dlen;i++){       //first letter uppercase substring
                    System.out.println(diseaseArray[i].substring(0,1).toUpperCase() + diseaseArray[i].substring(1));
                }
                ArrayList<String> diseaseAL=new ArrayList<String>();

                // Array to ArrayList Conversion
                for(int i=0;i<dlen;i++){
                    diseaseAL.add(diseaseArray[i]);
                }
                mdb.setPatientInfo(pid, pname, arrSymptoms, diseaseAL);
            }
            else if (ch==2){
                System.out.print("Enter disease name: ");
                String disease=sc.next().toLowerCase();
                Dinfo d=new Dinfo();
                ArrayList<String> sympAL=d.findSymptoms(disease);   //finding symptoms with method

                System.out.println();
                pub.symptomsLoad();
                
                int slen=sympAL.size();
                for (int i=0;i<slen;i++){
                    System.out.println(sympAL.get(i).substring(0,1).toUpperCase() + sympAL.get(i).substring(1));
                }

                ArrayList<String> disAL=new ArrayList<String>();
                disAL.add(disease);

                mdb.setPatientInfo(pid, pname, sympAL, disAL);
            }
            else if(ch==3){
                pub.team();
            }
            System.out.println();
            System.out.print("Do you want to exit? (yes/no): ");
            String ch1=sc.next();
            if (ch1.equals("yes")){
                System.out.println("Thank you for your time. GoodBye! ");
                System.out.println();
                break;
            }
            else if(ch1.equals("no")){
                continue;
            }
        }
        sc.close();
    }
}
