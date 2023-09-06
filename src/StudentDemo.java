
class Student {

    private String name;
    private int math, eng, sci;

    public void setInfo(String n, int m, int e, int s) {
        name = n;
        math = m;
        eng = e;
        sci = s;
    }

    public void showInfo() {
        System.out.println("Student name:" + name);
        System.out.println("Math:" + math);
        System.out.println("English:" + eng);
        System.out.println("Science:" + sci);
    }

    public double findPercent() {
        double p = (math + eng + sci) / 3;
        return p;
    }

    public String isPassed() {
        if (math >= 40 && eng >= 40 && sci >= 40) {
            return "passsed";
        } else {
            return "failed";
        }
    }

}

public class StudentDemo {

    public static void main(String[] args) {
        Student s = new Student();

        s.setInfo("Ram", 77, 70, 88);
        s.showInfo();
        System.out.println("Percentage:" + s.findPercent());
        // double p=s.findPercent();
        //System.out.println("Percentage:"+p);
        System.out.println("Result:" + s.isPassed());
    }

}
