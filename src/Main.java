public class Main {

    public static void main(String[] args) {

        int a = 97;
        int b = 98;
        int c = 99;
        int d = 100;

        int[] display = {97,97,97,97};

        for(int a1 = 97; a1 <101; a1++) {
            for(int a2 = 97; a2 <101; a2++) {
                for(int a3 = 97; a3 <101; a3++) {
                    for(int a4 = 97; a4 <101; a4++) {
                        display[0] = a1;
                        display[1] = a2;
                        display[2] = a3;
                        display[3] = a4;

                        for(int iter: display) {
                            System.out.print((char)iter);
                        }
                        System.out.println();
                    }
                }
            }
        }



    }
}
