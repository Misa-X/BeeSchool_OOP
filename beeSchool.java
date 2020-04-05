package week4;
import java.util.ArrayList;
import java.util.Scanner;

public class beeSchool {
    int subIterator, studIterator,scoreIterator = 1;

    ArrayList<beeSubject> subjects = new ArrayList<beeSubject>();
    ArrayList<beeStudent> students = new ArrayList<beeStudent>();
    Scanner input = new Scanner(System.in);

    public void insertSubject() {
        Scanner subInput = new Scanner(System.in);
        beeSubject subject = new beeSubject();

        while (true) {
            System.out.println("Input subject name [3-25 characters | must end with 'Subject']: ");
            String InSubName = subInput.nextLine();
            int inputLength = InSubName.length();

            if (inputLength >= 3 && InSubName.length() <= 25 && InSubName.endsWith(" Subject")) {
                for (beeSubject beeSub : subjects) {
                    if (beeSub.getSubject().equals(InSubName)) {
                        System.out.println("This subject already exists!");
                    }
                }
                subject.setSubject(InSubName);
                break;
            }


        }
        while (true) {
            System.out.println("Input subject category [Main | Elective]: ");
            String subCat = subInput.nextLine();
            if (subCat.equals("Main") || subCat.equals("Elective")) {
                subject.setCategory(subCat);
                break;
            }
            String id = "SB" + 0 + 0 + subIterator++;  //ID format

            subject.setId(id);
            this.subjects.add(subject);
            System.out.println("Inserted new subject");
        }
    }

    public void viewSubject() {
        if (this.subjects.size() == 0) {
            System.out.println("No Data");
        } else {
            System.out.println("Subject ID       Subject Name          Subject Category");
            System.out.println("=============================================================");
            for (beeSubject subject : this.subjects) {
                System.out.println(subject.getId() + "           " + subject.getSubject() + "           " + subject.getCategory());
                System.out.println("=============================================================");
            }
        }

    }

    public void insertStudent() {
        beeStudent student = new beeStudent();
        while (true) {
            System.out.println("Input student name [3-25 characters]: ");
            String studentName = input.next();
            if (studentName.length() > 3 && studentName.length() < 25) {
                student.setName(studentName);
                break;
            }
        }
        while (true) {
            System.out.println("Input student gender [Male | Female]");
            String studentGender = input.next();
            if (studentGender.equals("Male") || studentGender.equals("Female")) {
                student.setGender(studentGender);
                break;
            }
        }
        String id = "ST" + 0 + 0 + studIterator++;
        student.setStudentId(id);
        this.students.add(student);
        System.out.println("Inserted new student");
    }

    public void viewStudent() {
        if (this.students.size() == 0) {
            System.out.println("No Data");
        } else {
            System.out.println("Student ID       Student Name          Student Gender");
            System.out.println("=============================================================");
            for (beeStudent student : this.students) {
                System.out.println(student.getStudentId() + "           " + student.getName() + "           " + student.getGender());
                System.out.println("=============================================================");
            }
        }
    }

    public void insertStudentScore() {
        if (this.subjects.size() != 0 && this.students.size() != 0) {
            System.out.println("Student Data:");
            viewStudent();
            System.out.println("Subject Data:");
            viewSubject();
            beeStudent student;
            studentCheck:
            while (true) {
                System.out.println("Enter student id:");
                String id = input.next();
                for (beeStudent beeStud : students) {
                    if (id.equals(beeStud.getStudentId())) {
                        student = beeStud;
                        break studentCheck;
                    }
                }
            }
            beeSubject subject = null;
            while (true) {
                System.out.println("Enter subject id: ");
                String subjectId = input.next();
                boolean bool = false;

                for (beeSubject beeSub : this.subjects) {
                    if(beeSub.getId().equals(subjectId)) {
                        subject = beeSub;
                        bool = true;
                        break;
                    }
                }
                if (bool = true) {
                    if (student.getScore(subjectId) != 0) {
                        System.out.println("Subject score already inserted!");
                    } else {
                        break;
                    }
                }
            }
            beeScore score = new beeScore();
            score.setSubject(subject);
            while (true) {
                System.out.println("Input score [0-100]: ");
                int inputScore = input.nextInt();
                if (inputScore >= 0 && inputScore <= 100) {
                    score.setScore(inputScore);
                    break;
                }
            }
            String ID = "SC" + 0 + 0 + scoreIterator++;
            score.setId(ID);
            student.setScore(score);
            System.out.println("Inserted score!");
        }
        else {
            System.out.println("Student and Subject data must exist");
        }
    }
    public void viewStudentScore() {
        for (beeStudent student : this.students) {
            viewStudent();
            System.out.println("Scores: ");
            System.out.println("-----------------------------------------------------------------");
            if (student.getScore().size() == 0) {
                System.out.println("No Data");
            }
            else
            {
                for (beeScore score : student.getScore())
                {
                    System.out.println("Score ID       Subject Name         Subject Score");
                    System.out.println(score.getId() + "		" + score.getSubject().getSubject() + "            " + score.getScore());
                }
            }
            System.out.println("=============================================================");
        }
    }
}