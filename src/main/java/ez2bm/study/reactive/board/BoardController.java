package ez2bm.study.reactive.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/{id}")
    public Mono<Board> retrieveBoard(@PathVariable int id) {
        return boardService.retrieveBoard(id);
    }

    @PostMapping
    public Mono<Board> writeBoard(@RequestBody final Board board) {
        return boardService.createBoard(board);
    }

    @PutMapping(value = "/{id}")
    public Mono<Board> modifyBoard(@PathVariable int id,
                                   @RequestBody final Board board) {
        return boardService.updateBoard(id, board);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> removeBoard(@PathVariable int id) {
        return boardService.deleteBoard(id);
    }
}
