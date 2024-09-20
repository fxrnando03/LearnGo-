package com.aprendeya.aprendeyaapi.dto;

import com.aprendeya.aprendeyaapi.model.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorResponseDTO {

    public class TutorPerfilDTO {
        private Integer idTutor;
        private Usuario usuario;
        private String nombreTutor;
        private String especialidad;
        private Integer experiencia;
        private BigDecimal tarifaBase;

        private List<HorarioDTO> horarios;
        private List<ValoracionDTO> valoraciones;
    }