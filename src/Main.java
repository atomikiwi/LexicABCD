public class Main {

    public static void main(String[] args) {

        //a = 97
        //b = 98
        //c = 99
        //d = 100
        int iterationPrint = 0;
        long startTime = System.currentTimeMillis();

        int[] display = {97,97,97,97};

        for(int a1 = 97; a1 <101; a1++) {
            for(int a2 = 97; a2 <101; a2++) {
                for(int a3 = 97; a3 <101; a3++) {
                    for(int a4 = 97; a4 <101; a4++) {
                        display[0] = a1;
                        display[1] = a2;
                        display[2] = a3;
                        display[3] = a4;

                        if(display[3] != 98) {
                            boolean shouldPrint = true;
                            for(int i = 0; i < display.length; i++) {
                                if(display[i] == 98) {
                                    if(display[i+1] != 97) {
                                        shouldPrint = false;
                                    }
                                }
                            }
                            if(shouldPrint) {
                                for(int iter: display) {
                                    System.out.print((char)iter);
                                }
                                System.out.println();
                                iterationPrint++;
                            }
                        }
                    }
                }
            }
        }
        String output = "- " + iterationPrint + " chaine(s) de charactères différentes ont été affichées.";

        for (int j = 0; j < output.length(); j++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Statistiques du programme:");
        System.out.println(output);

        long timelapse = System.currentTimeMillis() - startTime;
        System.out.println("- Le programme s'est terminé en " + timelapse + " milliseconde(s).");

    }
}
