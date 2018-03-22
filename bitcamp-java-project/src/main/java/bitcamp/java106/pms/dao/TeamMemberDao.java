package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

public class TeamMemberDao {
    Member[] members = new Member[1000];
    int memberIndex = 0;
    
    public void insert(Member member) {
        member.no = memberIndex;
        this.members[this.memberIndex++] = member;
    }
    
    public Member[] list() {
        Member[] arr = new Member[memberIndex];
        for(int i = 0; i < memberIndex; i++) {
            arr[i] = members[i];
        }
        return arr;
    }
    
    public Member get(String id) {
        for (int i = 0; i < this.memberIndex; i++) {
            if (this.members[i] == null) continue;
            if (id.equals(this.members[i].id.toLowerCase())) {
                return this.members[i];
            }
        }
        return null;
    }
    
    public void update(Member member) {
        members[member.no] = member;
    }
    
    public void delete(Member member) {
        members[member.no] = null;
    }
}
