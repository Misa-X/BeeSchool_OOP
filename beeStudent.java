package week4;
import java.util.ArrayList;

public class beeStudent {
    private String studentId;
    private String name;
    private String gender;
    private ArrayList<beeScore> score;

        public beeStudent(){
            this.studentId = "";
            this.name = "";
            this.gender = "";
            this.score = new ArrayList<beeScore>();
        }
        public void setStudentId(String id) {
            this.studentId = studentId;
        }
        public String getStudentId() {
            return studentId;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getGender() {
            return gender;
        }
        public void setScore(beeScore score) {
            this.score.add(score);
        }
        public ArrayList<beeScore> getScore() {
            return this.score;
        }
        public int getScore(String subjectID) {
            for (beeScore score : this.score) {
                if (score.getSubject().getId().equals(subjectID)){
                    return score.getScore();
                }
            }
            return 0;
        }


}
