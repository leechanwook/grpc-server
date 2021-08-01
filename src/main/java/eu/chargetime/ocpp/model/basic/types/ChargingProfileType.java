package eu.chargetime.ocpp.model.basic.types;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
public class ChargingProfileType {
    Integer id;                             //100
    Integer stackLevel;                     //0
    ChargingProfilePurposeEnumType chargingProfilePurpose;  //TxDefaultProfile
    ChargingProfileKindEnumType chargingProfileKind;        //Recurring
    RecurrencyKindEnumType recurrencyKind;
    ZonedDateTime validFrom;
    ZonedDateTime validTo;
    String transactionId;
    List<ChargingScheduleType> chargingSchedule;
}
