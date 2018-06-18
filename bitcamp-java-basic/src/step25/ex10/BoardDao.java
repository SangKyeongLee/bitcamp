package step25.ex10;

import java.util.List;

public interface BoardDao {

    public List<Board> selectList();
    public int insert(Board board);
}

