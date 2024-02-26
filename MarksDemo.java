package Day9;

abstract class Marks {
    abstract String[] getPercentage();
}

class A extends Marks {
    String markOne;
    String markTwo;
    String markThree;

    public A(String markOne, String markTwo, String markThree) {
        this.markOne = markOne;
        this.markTwo = markTwo;
        this.markThree = markThree;
    }

    public String[] getPercentage() {
        String[] marksArray = new String[3];
        marksArray[0] = markOne + "%";
        marksArray[1] = markTwo + "%";
        marksArray[2] = markThree + "%";
        return marksArray;
    }
}

class B extends Marks {
    String markOne;
    String markTwo;
    String markThree;
    String markFour;

    public B(String markOne, String markTwo, String markThree, String markFour) {
        this.markOne = markOne;
        this.markTwo = markTwo;
        this.markThree = markThree;
        this.markFour = markFour;
    }

    public String[] getPercentage() {
        String[] marksArray = new String[4];
        marksArray[0] = markOne + "%";
        marksArray[1] = markTwo + "%";
        marksArray[2] = markThree + "%";
        marksArray[3] = markFour + "%";
        return marksArray;
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        A studentA = new A("65", "78.5", "89.3");
        B studentB = new B("89.6", "98.8", "87.6", "55.5");

        String[] studentAMarks = studentA.getPercentage();
        String[] studentBMarks = studentB.getPercentage();

        System.out.println("Student A's marks are: ");
        for(String mark: studentAMarks) {
            System.out.println(mark);
        }

        System.out.println();
        System.out.println("*****************");
        System.out.println();

        System.out.println("Student B's marks are: ");
        for(String mark: studentBMarks) {
            System.out.println(mark);
        }
    }
}
