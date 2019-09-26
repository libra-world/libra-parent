package dev.jlibra.example;

import dev.jlibra.admissioncontrol.AdmissionControl;
import dev.jlibra.admissioncontrol.GrpcMapper;
import dev.jlibra.admissioncontrol.query.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigDecimal;

public class GetTransactionsExample {

    private static final Logger logger = LogManager.getLogger(GetTransactionsExample.class);

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("ac.testnet.libra.org", 8000)
                .usePlaintext()
                .build();
        GrpcMapper grpcMapper = new GrpcMapper();
        String address = "6674633c78e2e00c69fd6e027aa6d1db2abc2a6c80d78a3e129eaf33dd49ce1c";

//        ManagedChannel channel = ManagedChannelBuilder.forAddress("ac.testnet.libra.org", 8000)
//                .usePlaintext()
//                .build();
        AdmissionControl admissionControl = new AdmissionControl(channel);

//        UpdateToLatestLedgerResult result = admissionControl
//                .updateToLatestLedger(ImmutableQuery.builder()
//                        .addAccountStateQueries(ImmutableGetAccountState.builder()
//                                .address(Hex.decode(address))
//                                .build())
//                        .build());
        GetTransactions result = admissionControl
                .getTransactions(ImmutableGetTransactions.builder()
                        .startVersion(1L)
                        .fetchEvents(true)
                        .limit(10L)
//                        .unknownFieldSet()
//                        .from()
                        .build());
        System.out.print(result);
//        result.getAccountStates().forEach(accountState -> {
//            logger.info("Address: {}", Hex.toHexString(accountState.getAccountAddress()));
//            logger.info("Received events: {}", accountState.getReceivedEvents().getCount());
//            logger.info("Sent events: {}", accountState.getSentEvents().getCount());
//            logger.info("Balance (microLibras): {}", accountState.getBalanceInMicroLibras());
//            logger.info("Balance (Libras): {}",
//                    new BigDecimal(accountState.getBalanceInMicroLibras()).divide(BigDecimal.valueOf(1000000)));
//            logger.info("Sequence number: {}", accountState.getSequenceNumber());
//            logger.info("Delegated withdrawal capability: {}", accountState.getDelegatedWithdrawalCapability());
//        });

        channel.shutdown();
    }

}
