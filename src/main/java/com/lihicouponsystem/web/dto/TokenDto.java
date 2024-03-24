package com.lihicouponsystem.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenDto {
    @JsonProperty("token")
    private String token;
}
