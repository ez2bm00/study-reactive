package ez2bm.study.reactive.board;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMapper extends R2dbcRepository<Board, Integer> {
}
