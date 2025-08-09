package projeto.financeiro.api.domain.categoria.pessoa;

import projeto.financeiro.api.domain.categoria.endereco.Endereco;

public record DadosListagemPessoa(Long id,
                                  String nome,
                                  Endereco endereco) {

    public DadosListagemPessoa(Pessoa pessoa) {
        this(pessoa.getId(),
                pessoa.getNome(),
                pessoa.getEndereco());
    }
}