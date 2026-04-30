
import java.util.StringTokenizer;


class StudentPerformanceAnalyzer {

    class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("name =" + this.name + "age =" + this.age);
        }
    }

    class Student extends Person {

        int rollNo;
        String course;

        Student(String Name, int age, int rollNo, String course) {
            super(Name, age);
            this.rollNo = rollNo;
            this.course = course;
        }

        public void setDetails(int rollNo) {
            this.rollNo = rollNo;
        }

        public void setDetails(int rollNo, String course) {
            this.rollNo = rollNo;
            this.course = course;
        }

        public void display() {
            System.out.println("Name = " + super.name + " Age  =" + super.age + " roll number = " + this.rollNo + " Course = " + this.course);
        }
    }

    class Result extends Student {

        int[] marks;
        int total;
        float percentage;
        char grade;

        Result(String name, int age, int rollNo, String course, int marks[]) {
            super(name, age, rollNo, course);
            this.marks = marks;
        }

        public void calculateResult() {
            int total = 0;
            for (int mark : marks) {
                mark += total;
            }
            this.total = total;
            this.percentage = total/marks.length;

        }
        public void calculateGrade(float percentage){
            if(percentage>90){
                this.grade = 'A';
            }
            else if(percentage>80 && percentage <= 90){
                this.grade ='B';
            }
            else if(percentage>70 && percentage <= 80){
                this.grade = 'C';
            }
            else{
                this.grade = 'D';
            }
        }
        public void calculateGrade(int total){
            if(total>90){
                this.grade = 'A';
            }
            else if(total>80 && total <= 90){
                this.grade ='B';
            }
            else if(total>70 && total <= 80){
                this.grade = 'C';
            }
            else{
                this.grade = 'D';
            }
        }
        public void process(String str){
            StringTokenizer string = new StringTokenizer(str, ",");
        }

    }

}
