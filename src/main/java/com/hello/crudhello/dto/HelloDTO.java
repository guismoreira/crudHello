package com.hello.crudhello.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class HelloDTO {
    private Long id;

    private String greeting;
}
