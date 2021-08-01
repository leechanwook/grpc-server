package com.cu.test.controller;

import com.cu.test.grpc.client.OcppSocketService;
import com.cu.test.ocpp.command.Ocpp201SocketCommander;
import com.cu.test.ocpp.command.OcppSocketCommander;
import com.cu.test.ocpp.data.MessageFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.chargetime.ocpp.model.basic.RequestStartTransactionRequest;
import eu.chargetime.ocpp.model.core.RemoteStartTransactionRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.rmi.Remote;
import java.util.UUID;


@Slf4j
@Controller
public class TestController {

    @Autowired
    OcppSocketService ocppSocketService;

    @Autowired
    Ocpp201SocketCommander ocpp201SocketCommander;

    @GetMapping("/reset")
    public String reset(String chargingStationId, String evseId, ModelMap model){
        log.debug("chargingStationId["+chargingStationId+"]evseId["+evseId+"]");

        try {
            ocpp201SocketCommander.reset(chargingStationId, 1);
        } catch (Exception e) {
            String msg = e.getMessage();
            model.addAttribute("resultCode", "FAIL");
            model.addAttribute("resultMsg", "error msg : ");
        }

        model.addAttribute("resultCode", "OK");
        model.addAttribute("resultMsg", "");
        return "jsonView";
    }
}
