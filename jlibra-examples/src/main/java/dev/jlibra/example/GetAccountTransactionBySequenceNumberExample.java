package dev.jlibra.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.util.encoders.Hex;

import dev.jlibra.admissioncontrol.AdmissionControl;
import dev.jlibra.admissioncontrol.query.ImmutableGetAccountTransactionBySequenceNumber;
import dev.jlibra.admissioncontrol.query.ImmutableQuery;
import dev.jlibra.admissioncontrol.query.UpdateToLatestLedgerResult;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GetAccountTransactionBySequenceNumberExample {

    private static final Logger logger = LogManager.getLogger(GetAccountTransactionBySequenceNumberExample.class);

    public static void main(String[] args) {
        String address = "04a1a534eaacebe977d63cd970dcd9c9dd715529172d92d76ce5f92dd5c34329";
        int sequenceNumber = 1;

        ManagedChannel channel = ManagedChannelBuilder.forAddress("ac.testnet.libra.org", 8000)
                .usePlaintext()
                .build();

        AdmissionControl admissionControl = new AdmissionControl(channel);

        UpdateToLatestLedgerResult result = admissionControl.updateToLatestLedger(ImmutableQuery.builder()
                .addAccountTransactionBySequenceNumberQueries(
                        ImmutableGetAccountTransactionBySequenceNumber.builder()
                                .accountAddress(Hex.decode(address))
                                .sequenceNumber(sequenceNumber)
                                .build())
                .build());

        result.getAccountTransactionsBySequenceNumber().forEach(tx -> {
            logger.info("Sender public key: " + Hex.toHexString(tx.getSenderPublicKey()));
            logger.info("Sender signature: " + Hex.toHexString(tx.getSenderSignature()));
            tx.getEvents()
                    .forEach(e -> logger.info("{}: Sequence number: {}, Amount: {}",
                            Hex.toHexString(e.getAccountAddress()), e.getSequenceNumber(), e.getAmount()));
        });

        channel.shutdown();

    }

}
