package com.api.finances_control.dto;


import java.math.BigDecimal;
import java.util.UUID;

public class LancamentoDTO {

    private UUID id;
    private String description;
    private BigDecimal value;
    private String type;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getValue() { return value; }
    public void setValue(BigDecimal value) { this.value = value; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
