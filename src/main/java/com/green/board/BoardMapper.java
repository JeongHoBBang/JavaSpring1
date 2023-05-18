package com.green.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface BoardMapper {
    int insBoard(BoardEntity entity);//메소드값이 insert id 값이랑 동일해야함!
    List<BoardEntity> selBoardAll();//여러레코드 담길수 있는 파일을 적음
    BoardEntity selBoardById(BoardEntity entity);//한레코드만 담을때 이거씀 파라미터 있어야함
    int updBoard(BoardEntity entity); // int를 적으면 영향받은 행 숫자를 리턴해줌
    int delBoard(BoardEntity entity);


}
