package com.my.s3;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestData {
    private Long id;
    private String username;
    private String address;
}
