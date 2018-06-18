package step25.ex11;

import java.util.List;

public interface BoardDao {

    public List<Board> selectList();
    public int insert(Board board);
}

