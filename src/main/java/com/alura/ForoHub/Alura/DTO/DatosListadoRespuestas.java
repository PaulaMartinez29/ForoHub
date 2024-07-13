package com.alura.ForoHub.Alura.DTO;




import com.alura.forohub.enumerador.TipoPerfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record DatosListadoRespuestas(
        @NotBlank String mensaje,
        @NotNull LocalDateTime fechaCreacion,
        @NotNull String nombreAutor,
        @NotNull TipoPerfil autor
) {

}