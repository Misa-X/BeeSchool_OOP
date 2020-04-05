package week4;

public class beeSubject {
    private String subjectId;
    private String subject;
    private String category;

    public beeSubject(){
        this.subjectId = "";
        this.subject = "";
        this.category = "";
    }
    public void setId(String id){
        this.subjectId = id;
    }
    public String getId(){
        return subjectId;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }


}
