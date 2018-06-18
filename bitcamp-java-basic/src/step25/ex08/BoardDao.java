package step25.ex08;

import java.util.List;

public interface BoardDao {

    public List<Board> selectList();
    public int insert(Board board);
}

