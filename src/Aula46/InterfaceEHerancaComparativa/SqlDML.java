package Aula46.InterfaceEHerancaComparativa;

public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);

}
