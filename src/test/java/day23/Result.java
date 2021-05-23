package day23;

public class Result {

    int status_id;
    String comment, elapsed, defects, version;

    public Result(int status_id) {
        this.status_id = status_id;
        this.comment = "Just a comment";
        this.elapsed = "25s";
        //this.defects = "";
        //this.version = version;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
