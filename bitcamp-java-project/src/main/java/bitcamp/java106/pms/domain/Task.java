package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Task {
    public static final int READY = 0;
    public static final int WORKING = 0;
    public static final int COMPLETE = 0;
    
    private int no;
    private String title;
    private Date startDate;
    private Date endDate;
    private Member worker;
    private int state;
    private Team team;
    
    public Task(Team team) {
        this.team = team;
    }
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public Member getWorker() {
        return worker;
    }
    public void setWorker(Member worker) {
        this.worker = worker;
    }
    
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    
    
}
