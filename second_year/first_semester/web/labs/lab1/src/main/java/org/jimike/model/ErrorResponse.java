package org.jimike.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String x;
    private String y;
    private String r;
    private Boolean inArea;
    private String responseTime;
}