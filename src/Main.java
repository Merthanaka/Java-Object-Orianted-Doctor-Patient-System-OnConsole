import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Merthan",22,
                new Eye("Left eye","Short Shighted","Blue",true),
                new Eye("Right Eye","Normal","Blue",true),
                new Hearth("hearth","Normal",90),
                new Stomach("stomach","Normal",false),
                new Skin("Skin","Normal","White",10));
        System.out.println("Name: "+patient.getName());
        System.out.println("Age: "+patient.getAge());
        Scanner scanner = new Scanner(System.in);
        boolean shouldfinish = false;
        while (!shouldfinish){
            System.out.println("Choose an organ "+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLefteye().getDetails();
                    if (patient.getLefteye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt()==1){
                            patient.getLefteye().Close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt()==1){
                            patient.getLefteye().Open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRighteye().getDetails();
                    if (patient.getRighteye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt()==1){
                            patient.getRighteye().Close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt()==1){
                            patient.getRighteye().Open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHearth().getDetails();
                    System.out.println("\t\t1. Change the heart rate ");
                    if (scanner.nextInt()==1){
                        System.out.println("Enter the new rate : ");
                        int newhearthrate = scanner.nextInt();
                        patient.getHearth().setRate(newhearthrate);
                        System.out.println("Heart rate changed to : "+ patient.getHearth().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest ");
                    if (scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldfinish=true;
                    break;
            }
        }



    }
}







