package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.ArrayList;

public class TeamDao {
    private ArrayList collection = new ArrayList();
    
    public void insert(Team team) {
        // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        this.collection.add(team);
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.collection.size()];
        for (int i = 0; i < this.collection.size(); i++) 
            arr[i] = (Team)this.collection.get(i);
        return arr;
    }
    
    public Team get(String name) {
        int i;
        if ((i = this.getTeamIndex(name)) != -1)
        return (Team)this.collection.get(i);
        return null;
    }
    
    public void update(Team team) {
        int i;
        if ((i = this.getTeamIndex(team.getName())) != -1)
        this.collection.set(i, team);
    }
    
    public void delete(String name) {
        int i;
        if ((i = this.getTeamIndex(name)) != -1)
            this.collection.remove(i);
    }
    
    private int getTeamIndex(String name) {
        for (int i = 0; i < this.collection.size(); i++) {
            if (name.toLowerCase().equals(((Team)this.collection.get(i)).getName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
//ver 14 - TeamController로부터 데이터 관리 기능을 분리하여 TeamDao 생성.





