package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//로직담당
public class BoardService {
        private final BoardMapper mapper;

        @Autowired
        public BoardService(BoardMapper mapper){
            this.mapper = mapper;
        }
    public int insBoard(BoardEntity entity){
        System.out.println("service-insBoard");
        mapper.insBoard(entity);
        return 1;
    }
    public List<BoardEntity> selBoardAll(){
            return mapper.selBoardAll();
    }
    public BoardEntity selBoardByID(BoardEntity entity){
            return mapper.selBoardById(entity);
    }
    public int updBoard(BoardEntity entity){
        System.out.println("service-updBoard");
        mapper.updBoard(entity);
        return 1;
    }
    public int delBoard(BoardEntity entity){
        System.out.println("service-delBoard");
        mapper.delBoard(entity);
        return 1;
    }
}
