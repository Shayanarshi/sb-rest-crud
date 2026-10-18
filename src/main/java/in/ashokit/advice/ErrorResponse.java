package in.ashokit.advice;

import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private int statusCode;
    private String errorMessage;
    private Instant timestamp;
    private String requestUri;
}
