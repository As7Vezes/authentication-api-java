package com.example.authenticationAPI.dto.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@Builder
public class ErrorReponseDTO {

    private String message;

    private HttpStatus httpStatus;

    private Integer statusCode;

}
