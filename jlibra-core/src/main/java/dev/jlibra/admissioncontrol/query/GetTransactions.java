package dev.jlibra.admissioncontrol.query;

import com.google.protobuf.UnknownFieldSet;
import org.immutables.value.Value;

@Value.Immutable
public interface GetTransactions {

    long getLimit();

    boolean getFetchEvents();

    UnknownFieldSet getUnknownFieldSet();

    long getStartVersion();




}
