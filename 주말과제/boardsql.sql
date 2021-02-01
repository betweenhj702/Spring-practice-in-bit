drop table BDFILE;
drop sequence BDFILE_SEQ;
drop table BOARD;
drop sequence BOARD_SEQ;

create table BOARD(
   SEQ number constraint BOARD_PK primary key,
   WRITER varchar2(40),
   EMAIL varchar2(80),
   SUBJECT varchar2(60),
   CONTENT varchar2(500),
   RDATE date,
   CNT number,
   REFER number,
   LEV number,
   PLACE number);

create sequence BOARD_SEQ increment by 1 start with 1 nocache;

create table BDFILE(
   SEQ number constraint BDFILE_PK primary key,
   B_SEQ number,
   FNAME varchar2(100),
   OFNAME varchar2(100),
   FSIZE number,
   constraint BDFILE_FK foreign key(B_SEQ) references BOARD(SEQ)
   );

create sequence BDFILE_SEQ increment by 1 start with 1 nocache;

create or replace trigger T1
after 
    insert on BOARD
    for each row
begin
    insert into BDFILE(SEQ, B_SEQ) values(BDFILE_SEQ.nextval, :new.SEQ);
end;
/