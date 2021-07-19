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

    private final BoardMapper boardMapper;

    @GetMapping("/{id}")
    public Mono<Board> retrieveBoard(@PathVariable int id) {
        return boardMapper.findById(id);
    }

    @PostMapping
    public Mono<Board> saveBoard(@RequestBody final Board board) {
        return boardMapper.save(board);
    }

    @PutMapping(value = "/{id}")
    public Mono<Board> modifyBoard(@PathVariable int id,
                                      @RequestBody final Board board) {
        board.setId(id);
        return boardMapper.save(board);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteBoard(@PathVariable int id) {
        return boardMapper.deleteById(id);
    }
}
