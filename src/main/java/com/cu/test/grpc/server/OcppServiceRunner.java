package com.cu.test.grpc.server;

import com.cu.proto.SampleProto;
import com.cu.test.service.OcppService;
import com.cu.test.service.SampleService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class OcppServiceRunner implements ApplicationRunner {

    @Autowired OcppService ocppService;

    private static final int PORT = 3030;
//    private static Server SERVER = ServerBuilder.forPort(PORT)
//            .addService(ocppService)
//            .build();

    private Server SERVER = null;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("######################## ocpp server start port["+PORT+"]######################################");
        SERVER = ServerBuilder.forPort(PORT).addService(ocppService).build().start();
//        SERVER.start();
    }
}
