package projeto.financeiro.api.domain.categoria.pessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import projeto.financeiro.api.domain.categoria.endereco.DadosEndereco;

public record DadosCadastroPessoa(
        @NotBlank String nome,
        boolean ativo,
        @NotNull @Valid DadosEndereco endereco

) {

}