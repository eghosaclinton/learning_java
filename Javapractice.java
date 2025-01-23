import java.util.Scanner;
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playToptHat(){
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive{
    static void takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String input = scanner.nextLine();
        System.out.println("Input is " + input);
        scanner.close();  
    }
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playToptHat();
        d.snare = false;

        if (d.snare == true){
            d.playSnare();
        }      
    }   
}