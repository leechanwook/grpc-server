package com.cu.test.grpc.client;

import com.cu.server.csms.ocpp.grpc.service.OcppRequest;
import com.cu.server.csms.ocpp.grpc.service.OcppResponse;
import com.cu.server.csms.ocpp.grpc.service.OcppServiceGrpc;
import com.cu.server.csms.ocpp.grpc.socket.OcppSocketRequest;
import com.cu.server.csms.ocpp.grpc.socket.OcppSocketResponse;
import com.cu.server.csms.ocpp.grpc.socket.OcppSocketServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class OcppSocketService {

    private static final int PORT = 3031;
    public static final String HOST = "localhost";
    private OcppSocketServiceGrpc.OcppSocketServiceStub asyncStub;
    private ManagedChannel channel;

    @PostConstruct
    public void test(){
        this.channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext()
                .build();
        this.asyncStub = OcppSocketServiceGrpc.newStub(channel);
    }

    public void sendMessage(String chargingStationId, String message) {
        log.info("Service -> Core ocppSocketMessage : chargingStationId["+chargingStationId+"]message["+message+"]");
        final OcppSocketRequest ocppSocketRequest = OcppSocketRequest.newBuilder()
                .setChargingStationId(chargingStationId)
                .setMessage(message)
                .build();



        asyncStub.sendMessage(ocppSocketRequest, new StreamObserver<OcppSocketResponse>() {
            @Override
            public void onNext(OcppSocketResponse response) {
                log.info("onNext Core -> Service ocppSocketMessage : chargingStationId["+response.getChargingStationId()+"]message["+response.getMessage()+"]");
            }

            @Override
            public void onError(Throwable t) {
                log.error("grpc async error", t);
            }

            @Override
            public void onCompleted() {
                log.debug("completed");
            }
        });


    }

}
