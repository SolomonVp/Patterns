package structural.adapter;
// База с которой желает взаимодействовать DatabaseRunner
public interface Database {
    public void insert();
    public void update();
    public void select();
    public void remove();
}
