// TASK E --> Write a program to print a face.

package Task_2;
import java.util.Random;
public class Task_E {
	public static void main(String[] args) {
        String[] face = createFace();
        printFace(face);
    }
    public static String[] createFace() {
        String[] face = new String[6];
        Random r = new Random();
        face[0] = "       ";
        face[1] = " +\"\"\"\"\"+";
        face[2] = "[| " + Eyes(r) + " " + Eyes(r) + " |]";
        face[3] = " |  " + Nose(r) + "  |";
        face[4] = " | " + Mouth(r) + " |";
        face[5] = " +-----+";
        return face;
    }
    public static void printFace(String[] face) {
        for (String line : face) {
            System.out.println(line);
        }
    }
    public static String Eyes(Random r) {
        String[] eyes = {"o"};
        return eyes[r.nextInt(eyes.length)];
    }
    public static String Nose(Random r) {
        String[] nose = {"^"};
        return nose[r.nextInt(nose.length)];
    }
    public static String Mouth(Random r) {
        String[] mouth = {"'_'"};
        return mouth[r.nextInt(mouth.length)];
    }

}
