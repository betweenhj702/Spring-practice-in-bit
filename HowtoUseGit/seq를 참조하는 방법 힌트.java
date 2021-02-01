[김 형수(강사님)] [오전 11:14] public class Board {
     private long seq;
     .... 
     private ArrayList<MultipartFile> files;
}

[김 형수(강사님)] [오전 11:14] public class ServiceImpl {
    @Transactional
    public void insert(Board board){
        mapper.insert(board); // 부모T insert 

        //long seq = board.getSeq(); //  seq.nextval된 값 추출 가능  
        //System.out.println("seq: " + seq);

        uploadF(board); //파일업로드 로직 
        mapper.insertF(board); // 자식T insert 
    }
}

[김 형수(강사님)] [오전 11:17] 예측1 (테스트는 해 봐야 함) 
<insert id="insertF" parameterType="Board">
    INSERT INTO
        files
        (name, realname, size, seq)
    VALUES
    <foreach collection="#{files}" item="file" separator=",">
        (#{file.name}, #{file.originalFilename}, #{file.size}, #{seq})
    </foreach>
</insert>



[김 형수(강사님)] [오전 11:27] seq는 게시판글입력과 그 자식(파일테이블)입력간의 시간차이에 의해 얼만든지... 다른 글 입력 요청이 들어올 수 있기 때문에.. 이처럼 원글의 seq값을 파일정보입력시 넘겨줘야 하는 거야

[김 형수(강사님)] [오전 11:32] <foreach>부분은 동적쿼리라고 해서.. 기존 sql에서 지원되지 않는 조건문과 반복문을 추가할 수 있는 mybatis 태그야