package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = sideLength / 2 + 1;

        for (int i = 1; i<=sideLength; i++) {

            for (int j = 1; j<sideLength; j++) {
                if (j == center || i == center) {
                    System.out.print("8");
                }
                else System.out.print(" ");

            }
            if (i == center) {
                System.out.println("8");
            } else System.out.println(" ");
        }

    }
}
