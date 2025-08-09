package projeto.financeiro.api.domain.categoria.pessoa;

import jakarta.validation.constraints.NotNull;
import projeto.financeiro.api.domain.categoria.endereco.DadosEndereco;

public record DadosAtualizacaoPessoa(
        @NotNull Long id,
        String nome,
        DadosEndereco endereco) {
}