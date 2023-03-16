package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int evenHeight = 1;
        if (height % 2 == 0) {
            evenHeight = 0;
        }

        for(int i=0; i < height/2 +evenHeight; i++ ) {
            for(int j = height - i+1; j <= height; j++) {
                System.out.print("_");
            }
            for(int j = 0; j < height - 2*i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

       for(int i=1; i < (height)/2+evenHeight; i++ )
        {
            for(int j = 1; j <= height/2 - i; j++)
                System.out.print("_");
            for(int j = 0; j < i*2+evenHeight; j++)
                System.out.print("8");
            System.out.println();
        }


    }


}
