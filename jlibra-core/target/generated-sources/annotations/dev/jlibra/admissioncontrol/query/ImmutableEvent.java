package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link Event}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvent.builder()}.
 */
@Generated(from = "Event", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableEvent implements Event {
  private final byte[] accountAddress;
  private final long amount;
  private final byte[] key;
  private final long sequenceNumber;

  private ImmutableEvent(byte[] accountAddress, long amount, byte[] key, long sequenceNumber) {
    this.accountAddress = accountAddress;
    this.amount = amount;
    this.key = key;
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * @return A cloned {@code accountAddress} array
   */
  @Override
  public byte[] getAccountAddress() {
    return accountAddress.clone();
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @Override
  public long getAmount() {
    return amount;
  }

  /**
   * @return A cloned {@code key} array
   */
  @Override
  public byte[] getKey() {
    return key.clone();
  }

  /**
   * @return The value of the {@code sequenceNumber} attribute
   */
  @Override
  public long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Event#getAccountAddress() accountAddress}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for accountAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvent withAccountAddress(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableEvent(newValue, this.amount, this.key, this.sequenceNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Event#getAmount() amount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvent withAmount(long value) {
    if (this.amount == value) return this;
    return new ImmutableEvent(this.accountAddress, value, this.key, this.sequenceNumber);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Event#getKey() key}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for key
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvent withKey(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableEvent(this.accountAddress, this.amount, newValue, this.sequenceNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Event#getSequenceNumber() sequenceNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sequenceNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvent withSequenceNumber(long value) {
    if (this.sequenceNumber == value) return this;
    return new ImmutableEvent(this.accountAddress, this.amount, this.key, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvent
        && equalTo((ImmutableEvent) another);
  }

  private boolean equalTo(ImmutableEvent another) {
    return Arrays.equals(accountAddress, another.accountAddress)
        && amount == another.amount
        && Arrays.equals(key, another.key)
        && sequenceNumber == another.sequenceNumber;
  }

  /**
   * Computes a hash code from attributes: {@code accountAddress}, {@code amount}, {@code key}, {@code sequenceNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(accountAddress);
    h += (h << 5) + Longs.hashCode(amount);
    h += (h << 5) + Arrays.hashCode(key);
    h += (h << 5) + Longs.hashCode(sequenceNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code Event} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Event")
        .omitNullValues()
        .add("accountAddress", Arrays.toString(accountAddress))
        .add("amount", amount)
        .add("key", Arrays.toString(key))
        .add("sequenceNumber", sequenceNumber)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Event} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Event instance
   */
  public static ImmutableEvent copyOf(Event instance) {
    if (instance instanceof ImmutableEvent) {
      return (ImmutableEvent) instance;
    }
    return ImmutableEvent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEvent ImmutableEvent}.
   * <pre>
   * ImmutableEvent.builder()
   *    .accountAddress(byte) // required {@link Event#getAccountAddress() accountAddress}
   *    .amount(long) // required {@link Event#getAmount() amount}
   *    .key(byte) // required {@link Event#getKey() key}
   *    .sequenceNumber(long) // required {@link Event#getSequenceNumber() sequenceNumber}
   *    .build();
   * </pre>
   * @return A new ImmutableEvent builder
   */
  public static ImmutableEvent.Builder builder() {
    return new ImmutableEvent.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEvent ImmutableEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Event", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ADDRESS = 0x1L;
    private static final long INIT_BIT_AMOUNT = 0x2L;
    private static final long INIT_BIT_KEY = 0x4L;
    private static final long INIT_BIT_SEQUENCE_NUMBER = 0x8L;
    private long initBits = 0xfL;

    private @Nullable byte[] accountAddress;
    private long amount;
    private @Nullable byte[] key;
    private long sequenceNumber;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Event} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Event instance) {
      Objects.requireNonNull(instance, "instance");
      accountAddress(instance.getAccountAddress());
      amount(instance.getAmount());
      key(instance.getKey());
      sequenceNumber(instance.getSequenceNumber());
      return this;
    }

    /**
     * Initializes the value for the {@link Event#getAccountAddress() accountAddress} attribute.
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
     * Initializes the value for the {@link Event#getAmount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder amount(long amount) {
      this.amount = amount;
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Event#getKey() key} attribute.
     * @param key The elements for key
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder key(byte... key) {
      this.key = key.clone();
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link Event#getSequenceNumber() sequenceNumber} attribute.
     * @param sequenceNumber The value for sequenceNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder sequenceNumber(long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      initBits &= ~INIT_BIT_SEQUENCE_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEvent ImmutableEvent}.
     * @return An immutable instance of Event
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEvent(accountAddress, amount, key, sequenceNumber);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ADDRESS) != 0) attributes.add("accountAddress");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_SEQUENCE_NUMBER) != 0) attributes.add("sequenceNumber");
      return "Cannot build Event, some of required attributes are not set " + attributes;
    }
  }
}
