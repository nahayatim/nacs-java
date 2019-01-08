package week2robocode;

public class HalfPyramid {
    public static void main(String[] args) {
        int height=5;

        for (int currentLine=1; currentLine<=height;currentLine++){

            for (int posOfSpace=0; posOfSpace<height-currentLine;posOfSpace++){
                System.out.format("");;
            }
            for (int posOfHash= height-currentLine; posOfHash<height+1; posOfHash++){
                System.out.format("#");
            }
            System.out.format("\n");

        }
    }
}
