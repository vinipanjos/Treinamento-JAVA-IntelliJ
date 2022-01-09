package Aula46.InterfaceEHerancaComparativa;

public interface BandoDados extends SqlDCL, SqlDML, SqlDDL{

    void abrirConexão();
    void fecharConexão();
}
