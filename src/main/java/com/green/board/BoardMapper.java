package com.green.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface BoardMapper {
    int insBoard(BoardEntity entity);//메소드값이 insert id 값이랑 동일해야함!
    int updBoard(BoardEntity entity); // int를 적으면 영향받은 행 숫자를 리턴해줌


}
