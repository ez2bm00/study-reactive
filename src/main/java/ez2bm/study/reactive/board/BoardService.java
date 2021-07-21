package ez2bm.study.reactive.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    /**
     * 조회
     * @param id 게시글 ID
     * @return 게시글
     */
    public Mono<Board> retrieveBoard(final int id) {
        return boardMapper.findById(id);
    }

    /**
     * 게시글 추가
     * @param board 게시글 내용
     * @return 등록된 게시글
     */
    public Mono<Board> createBoard(final Board board) {
        return boardMapper.save(board);
    }

    /**
     * 게시글 수정
     * @param id 수정할 게시글 ID
     * @param board
     * @return
     */
    public Mono<Board> updateBoard(final int id, final Board board) {
        board.setId(id);
        return boardMapper.save(board);
    }

    /**
     * 게시글 삭제
     * @param id 삭제할 게시글 ID
     * @return Void
     */
    public Mono<Void> deleteBoard(final int id) {
        return boardMapper.deleteById(id);
    }
}
