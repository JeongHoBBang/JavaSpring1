package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //json형태로 객체 데이터로 반환해주는것
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;//여기서 service는 di dependency injection 객체생성 알아서 해주고
    // 싱글톤을 알아서 생성해줌

    @Autowired
    public BoardController(BoardService service){
        this.service = service;
    }


   @PostMapping
    public int boardPost(@RequestBody BoardEntity entity){
       System.out.println(entity);
       return service.insBoard(entity);
   }
   @GetMapping
   public List<BoardEntity> boardGetAll(){
        return service.selBoardAll();

   }
   @GetMapping("/{iboard}")
   public BoardEntity boardGetById(@PathVariable int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        return service.selBoardByID(entity);
   }
   @PutMapping
    public int boardPut(@RequestBody BoardEntity entity){
       System.out.println(entity);
       return service.updBoard(entity);
   }
   @DeleteMapping("/{iboard}")
    public int boardDel(@PathVariable int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
       return service.delBoard(entity);
   }
}
