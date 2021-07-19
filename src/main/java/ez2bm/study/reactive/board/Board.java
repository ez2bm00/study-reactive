package ez2bm.study.reactive.board;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import reactor.util.annotation.Nullable;

@Data
@Table("BOARD")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Board {
    @Id
    @Column
    private int id;
    @Column
    private String subject;
    @Column
    private String content;
    @Column
    @Nullable
    private String tag;
}
