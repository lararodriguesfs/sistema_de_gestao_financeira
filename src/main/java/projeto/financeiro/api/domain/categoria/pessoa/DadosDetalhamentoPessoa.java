package projeto.financeiro.api.domain.categoria.pessoa;

import projeto.financeiro.api.domain.categoria.endereco.Endereco;

public record DadosDetalhamentoPessoa(Long id,
                                      String nome,
                                      Endereco endereco) {

    public DadosDetalhamentoPessoa(Pessoa pessoa) {
        this(pessoa. getId(),
                pessoa.getNome(),
                pessoa.getEndereco());
    }
}