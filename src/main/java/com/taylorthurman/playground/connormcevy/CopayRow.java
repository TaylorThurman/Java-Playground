package com.taylorthurman.playground.connormcevy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class CopayRow {
    @JsonProperty(value = "MEMNO")
    String MEMNO;
    @JsonProperty(value = "LAST_NM")
    String LAST_NM;
    @JsonProperty(value = "BIRTH_DT")
    String BIRTH_DT;
    @JsonProperty(value = "GRP_NO")
    String GRP_NO;
    @JsonProperty(value = "FORM_SIGN_DT")
    String FORM_SIGN_DT;
}
