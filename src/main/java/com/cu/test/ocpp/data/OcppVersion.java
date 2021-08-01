package com.cu.test.ocpp.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OcppVersion {
    V_16("ocpp1.6"),
    V_201("ocpp2.0.1");

    private final String value;

}
