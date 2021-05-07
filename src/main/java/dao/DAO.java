package dao;

import java.util.List;

public interface DAO <Entity> {
    public void create(Entity entity);
    public void update(Entity entity);
    public void delete(Entity entity);
    List<Entity> read();
}
