package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AccountData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccountData.builder()}.
 */
@Generated(from = "AccountData", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableAccountData implements AccountData {
  private final byte[] accountAddress;
  private final long balanceInMicroLibras;
  private final EventHandle receivedEvents;
  private final EventHandle sentEvents;
  private final int sequenceNumber;
  private final boolean delegatedWithdrawalCapability;

  private ImmutableAccountData(
      byte[] accountAddress,
      long balanceInMicroLibras,
      EventHandle receivedEvents,
      EventHandle sentEvents,
      int sequenceNumber,
      boolean delegatedWithdrawalCapability) {
    this.accountAddress = accountAddress;
    this.balanceInMicroLibras = balanceInMicroLibras;
    this.receivedEvents = receivedEvents;
    this.sentEvents = sentEvents;
    this.sequenceNumber = sequenceNumber;
    this.delegatedWithdrawalCapability = delegatedWithdrawalCapability;
  }

  /**
   * @return A cloned {@code accountAddress} array
   */
  @Override
  public byte[] getAccountAddress() {
    return accountAddress.clone();
  }

  /**
   * @return The value of the {@code balanceInMicroLibras} attribute
   */
  @Override
  public long getBalanceInMicroLibras() {
    return balanceInMicroLibras;
  }

  /**
   * @return The value of the {@code receivedEvents} attribute
   */
  @Override
  public EventHandle getReceivedEvents() {
    return receivedEvents;
  }

  /**
   * @return The value of the {@code sentEvents} attribute
   */
  @Override
  public EventHandle getSentEvents() {
    return sentEvents;
  }

  /**
   * @return The value of the {@code sequenceNumber} attribute
   */
  @Override
  public int getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * @return The value of the {@code delegatedWithdrawalCapability} attribute
   */
  @Override
  public boolean getDelegatedWithdrawalCapability() {
    return delegatedWithdrawalCapability;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AccountData#getAccountAddress() accountAddress}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for accountAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountData withAccountAddress(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableAccountData(
        newValue,
        this.balanceInMicroLibras,
        this.receivedEvents,
        this.sentEvents,
        this.sequenceNumber,
        this.delegatedWithdrawalCapability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountData#getBalanceInMicroLibras() balanceInMicroLibras} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for balanceInMicroLibras
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountData withBalanceInMicroLibras(long value) {
    if (this.balanceInMicroLibras == value) return this;
    return new ImmutableAccountData(
        this.accountAddress,
        value,
        this.receivedEvents,
        this.sentEvents,
        this.sequenceNumber,
        this.delegatedWithdrawalCapability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountData#getReceivedEvents() receivedEvents} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for receivedEvents
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountData withReceivedEvents(EventHandle value) {
    if (this.receivedEvents == value) return this;
    EventHandle newValue = Objects.requireNonNull(value, "receivedEvents");
    return new ImmutableAccountData(
        this.accountAddress,
        this.balanceInMicroLibras,
        newValue,
        this.sentEvents,
        this.sequenceNumber,
        this.delegatedWithdrawalCapability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountData#getSentEvents() sentEvents} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sentEvents
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountData withSentEvents(EventHandle value) {
    if (this.sentEvents == value) return this;
    EventHandle newValue = Objects.requireNonNull(value, "sentEvents");
    return new ImmutableAccountData(
        this.accountAddress,
        this.balanceInMicroLibras,
        this.receivedEvents,
        newValue,
        this.sequenceNumber,
        this.delegatedWithdrawalCapability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountData#getSequenceNumber() sequenceNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sequenceNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountData withSequenceNumber(int value) {
    if (this.sequenceNumber == value) return this;
    return new ImmutableAccountData(
        this.accountAddress,
        this.balanceInMicroLibras,
        this.receivedEvents,
        this.sentEvents,
        value,
        this.delegatedWithdrawalCapability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountData#getDelegatedWithdrawalCapability() delegatedWithdrawalCapability} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for delegatedWithdrawalCapability
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountData withDelegatedWithdrawalCapability(boolean value) {
    if (this.delegatedWithdrawalCapability == value) return this;
    return new ImmutableAccountData(
        this.accountAddress,
        this.balanceInMicroLibras,
        this.receivedEvents,
        this.sentEvents,
        this.sequenceNumber,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccountData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccountData
        && equalTo((ImmutableAccountData) another);
  }

  private boolean equalTo(ImmutableAccountData another) {
    return Arrays.equals(accountAddress, another.accountAddress)
        && balanceInMicroLibras == another.balanceInMicroLibras
        && receivedEvents.equals(another.receivedEvents)
        && sentEvents.equals(another.sentEvents)
        && sequenceNumber == another.sequenceNumber
        && delegatedWithdrawalCapability == another.delegatedWithdrawalCapability;
  }

  /**
   * Computes a hash code from attributes: {@code accountAddress}, {@code balanceInMicroLibras}, {@code receivedEvents}, {@code sentEvents}, {@code sequenceNumber}, {@code delegatedWithdrawalCapability}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(accountAddress);
    h += (h << 5) + Longs.hashCode(balanceInMicroLibras);
    h += (h << 5) + receivedEvents.hashCode();
    h += (h << 5) + sentEvents.hashCode();
    h += (h << 5) + sequenceNumber;
    h += (h << 5) + Booleans.hashCode(delegatedWithdrawalCapability);
    return h;
  }

  /**
   * Prints the immutable value {@code AccountData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AccountData")
        .omitNullValues()
        .add("accountAddress", Arrays.toString(accountAddress))
        .add("balanceInMicroLibras", balanceInMicroLibras)
        .add("receivedEvents", receivedEvents)
        .add("sentEvents", sentEvents)
        .add("sequenceNumber", sequenceNumber)
        .add("delegatedWithdrawalCapability", delegatedWithdrawalCapability)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link AccountData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccountData instance
   */
  public static ImmutableAccountData copyOf(AccountData instance) {
    if (instance instanceof ImmutableAccountData) {
      return (ImmutableAccountData) instance;
    }
    return ImmutableAccountData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccountData ImmutableAccountData}.
   * <pre>
   * ImmutableAccountData.builder()
   *    .accountAddress(byte) // required {@link AccountData#getAccountAddress() accountAddress}
   *    .balanceInMicroLibras(long) // required {@link AccountData#getBalanceInMicroLibras() balanceInMicroLibras}
   *    .receivedEvents(dev.jlibra.admissioncontrol.query.EventHandle) // required {@link AccountData#getReceivedEvents() receivedEvents}
   *    .sentEvents(dev.jlibra.admissioncontrol.query.EventHandle) // required {@link AccountData#getSentEvents() sentEvents}
   *    .sequenceNumber(int) // required {@link AccountData#getSequenceNumber() sequenceNumber}
   *    .delegatedWithdrawalCapability(boolean) // required {@link AccountData#getDelegatedWithdrawalCapability() delegatedWithdrawalCapability}
   *    .build();
   * </pre>
   * @return A new ImmutableAccountData builder
   */
  public static ImmutableAccountData.Builder builder() {
    return new ImmutableAccountData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccountData ImmutableAccountData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccountData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ADDRESS = 0x1L;
    private static final long INIT_BIT_BALANCE_IN_MICRO_LIBRAS = 0x2L;
    private static final long INIT_BIT_RECEIVED_EVENTS = 0x4L;
    private static final long INIT_BIT_SENT_EVENTS = 0x8L;
    private static final long INIT_BIT_SEQUENCE_NUMBER = 0x10L;
    private static final long INIT_BIT_DELEGATED_WITHDRAWAL_CAPABILITY = 0x20L;
    private long initBits = 0x3fL;

    private @Nullable byte[] accountAddress;
    private long balanceInMicroLibras;
    private @Nullable EventHandle receivedEvents;
    private @Nullable EventHandle sentEvents;
    private int sequenceNumber;
    private boolean delegatedWithdrawalCapability;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccountData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(AccountData instance) {
      Objects.requireNonNull(instance, "instance");
      accountAddress(instance.getAccountAddress());
      balanceInMicroLibras(instance.getBalanceInMicroLibras());
      receivedEvents(instance.getReceivedEvents());
      sentEvents(instance.getSentEvents());
      sequenceNumber(instance.getSequenceNumber());
      delegatedWithdrawalCapability(instance.getDelegatedWithdrawalCapability());
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getAccountAddress() accountAddress} attribute.
     * @param accountAddress The elements for accountAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accountAddress(byte... accountAddress) {
      this.accountAddress = accountAddress.clone();
      initBits &= ~INIT_BIT_ACCOUNT_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getBalanceInMicroLibras() balanceInMicroLibras} attribute.
     * @param balanceInMicroLibras The value for balanceInMicroLibras 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder balanceInMicroLibras(long balanceInMicroLibras) {
      this.balanceInMicroLibras = balanceInMicroLibras;
      initBits &= ~INIT_BIT_BALANCE_IN_MICRO_LIBRAS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getReceivedEvents() receivedEvents} attribute.
     * @param receivedEvents The value for receivedEvents 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder receivedEvents(EventHandle receivedEvents) {
      this.receivedEvents = Objects.requireNonNull(receivedEvents, "receivedEvents");
      initBits &= ~INIT_BIT_RECEIVED_EVENTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getSentEvents() sentEvents} attribute.
     * @param sentEvents The value for sentEvents 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder sentEvents(EventHandle sentEvents) {
      this.sentEvents = Objects.requireNonNull(sentEvents, "sentEvents");
      initBits &= ~INIT_BIT_SENT_EVENTS;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getSequenceNumber() sequenceNumber} attribute.
     * @param sequenceNumber The value for sequenceNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder sequenceNumber(int sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      initBits &= ~INIT_BIT_SEQUENCE_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link AccountData#getDelegatedWithdrawalCapability() delegatedWithdrawalCapability} attribute.
     * @param delegatedWithdrawalCapability The value for delegatedWithdrawalCapability 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder delegatedWithdrawalCapability(boolean delegatedWithdrawalCapability) {
      this.delegatedWithdrawalCapability = delegatedWithdrawalCapability;
      initBits &= ~INIT_BIT_DELEGATED_WITHDRAWAL_CAPABILITY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccountData ImmutableAccountData}.
     * @return An immutable instance of AccountData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccountData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccountData(
          accountAddress,
          balanceInMicroLibras,
          receivedEvents,
          sentEvents,
          sequenceNumber,
          delegatedWithdrawalCapability);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ADDRESS) != 0) attributes.add("accountAddress");
      if ((initBits & INIT_BIT_BALANCE_IN_MICRO_LIBRAS) != 0) attributes.add("balanceInMicroLibras");
      if ((initBits & INIT_BIT_RECEIVED_EVENTS) != 0) attributes.add("receivedEvents");
      if ((initBits & INIT_BIT_SENT_EVENTS) != 0) attributes.add("sentEvents");
      if ((initBits & INIT_BIT_SEQUENCE_NUMBER) != 0) attributes.add("sequenceNumber");
      if ((initBits & INIT_BIT_DELEGATED_WITHDRAWAL_CAPABILITY) != 0) attributes.add("delegatedWithdrawalCapability");
      return "Cannot build AccountData, some of required attributes are not set " + attributes;
    }
  }
}
