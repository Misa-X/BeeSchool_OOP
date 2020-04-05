package week4;

public class beeScore {
        private String ScoreId;
        private int score;
        private beeSubject subject;

        public beeScore() {
            this.ScoreId = "";
            this.score = 0;
            this.subject = new beeSubject();
        }
        public void setId(String id) {
            this.ScoreId = id;
        }
        public String getId() {
            return ScoreId;
        }
        public void setScore(int score) {
            this.score = score;
        }
        public int getScore() {
            return score;
        }
        public void setSubject(beeSubject subject) {
            this.subject = subject;
        }
        public beeSubject getSubject() {
            return subject;
        }

}
