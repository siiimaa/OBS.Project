public class Main {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Steve", "MTH", "00000000");
        Teacher bioTeacher = new Teacher("Billie", "BIO", "11111111");
        Teacher engTeacher = new Teacher("Andrew", "ENG", "55555555");

        Course math = new Course("Math", "101", "MTH");
        math.addTeacher(mathTeacher);

        Course biology = new Course ("Biology", "205", "BIO");
        biology.addTeacher(bioTeacher);

        Course english = new Course("English Language", "109", "ENG");
        english.addTeacher(engTeacher);

        Student s1 = new Student("Louis", "11542", "4", math, biology, english);
        s1.addBulkExamNotes(100, 55,73, 24,85,98);
        s1.isPass();

    }
}
