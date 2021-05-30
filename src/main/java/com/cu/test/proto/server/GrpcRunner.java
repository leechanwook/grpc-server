package com.cu.test.proto.server;

import com.cu.proto.SampleProto;
import com.cu.test.service.SampleService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GrpcRunner implements ApplicationRunner {

    private static final int PORT = 3030;
    private static final Server SERVER = ServerBuilder.forPort(PORT)
            .addService(new SampleService())
            .build();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("######################## server start port["+PORT+"]######################################");
        SERVER.start();
    }
}
