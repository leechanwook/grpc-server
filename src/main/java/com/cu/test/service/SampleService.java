package com.cu.test.service;

import com.cu.proto.SampleRequest;
import com.cu.proto.SampleResponse;
import com.cu.proto.SampleServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SampleService extends SampleServiceGrpc.SampleServiceImplBase {

    @Override
    public void sampleCall(SampleRequest request, StreamObserver<SampleResponse> responseObserver) {
        log.info("SampleServiceImpl#sampleCall - {}, {}", request.getUserId(), request.getMessage());

        SampleResponse response = SampleResponse.newBuilder()
                .setMessage("grpc service test")
                .setTest("test2").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
