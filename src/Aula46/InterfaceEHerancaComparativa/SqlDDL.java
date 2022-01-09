package Aula46.InterfaceEHerancaComparativa;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);

}
