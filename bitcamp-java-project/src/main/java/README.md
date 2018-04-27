# 변경 내역
- build.gradle 변경
- eclipse 설정 파일 갱신
- pms_board 테이블 생성
```
create table pms_task (
    tano int not null,
    titl varchar(255) not null,
    sdt datetime not null,
    edt datetime not null,
    stat int default 0,
    mid varchar(20) not null,
    tnm varchar(100) not null
);

alter table pms_task
    add constraint pms_task_pk primary key (tano);
    
alter table pms_task
    modify column tano int not null auto_increment;
    
create table pms_team_member (
    tnm varchar(100) not null,
    mid varchar(20) not null
);

alter table pms_team_member
    add constraint pms_team_member_pk primary key (tnm, mid);
    
```
- Board.java 변경
- BoardxxxController 변경
- pms_member 테이블 생성
- 