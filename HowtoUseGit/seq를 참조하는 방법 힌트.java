[�� ����(�����)] [���� 11:14] public class Board {
     private long seq;
     .... 
     private ArrayList<MultipartFile> files;
}

[�� ����(�����)] [���� 11:14] public class ServiceImpl {
    @Transactional
    public void insert(Board board){
        mapper.insert(board); // �θ�T insert 

        //long seq = board.getSeq(); //  seq.nextval�� �� ���� ����  
        //System.out.println("seq: " + seq);

        uploadF(board); //���Ͼ��ε� ���� 
        mapper.insertF(board); // �ڽ�T insert 
    }
}

[�� ����(�����)] [���� 11:17] ����1 (�׽�Ʈ�� �� ���� ��) 
<insert id="insertF" parameterType="Board">
    INSERT INTO
        files
        (name, realname, size, seq)
    VALUES
    <foreach collection="#{files}" item="file" separator=",">
        (#{file.name}, #{file.originalFilename}, #{file.size}, #{seq})
    </foreach>
</insert>



[�� ����(�����)] [���� 11:27] seq�� �Խ��Ǳ��Է°� �� �ڽ�(�������̺�)�Է°��� �ð����̿� ���� �󸸵���... �ٸ� �� �Է� ��û�� ���� �� �ֱ� ������.. ��ó�� ������ seq���� ���������Է½� �Ѱ���� �ϴ� �ž�

[�� ����(�����)] [���� 11:32] <foreach>�κ��� ����������� �ؼ�.. ���� sql���� �������� �ʴ� ���ǹ��� �ݺ����� �߰��� �� �ִ� mybatis �±׾�