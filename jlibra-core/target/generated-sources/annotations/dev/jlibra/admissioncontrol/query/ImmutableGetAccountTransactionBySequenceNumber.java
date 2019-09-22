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
 * Immutable implementation of {@link GetAccountTransactionBySequenceNumber}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGetAccountTransactionBySequenceNumber.builder()}.
 */
@Generated(from = "GetAccountTransactionBySequenceNumber", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGetAccountTransactionBySequenceNumber
    implements GetAccountTransactionBySequenceNumber {
  private final byte[] accountAddress;
  private final long sequenceNumber;

  private ImmutableGetAccountTransactionBySequenceNumber(byte[] accountAddress, long sequenceNumber) {
    this.accountAddress = accountAddress;
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
   * @return The value of the {@code sequenceNumber} attribute
   */
  @Override
  public long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetAccountTransactionBySequenceNumber#getAccountAddress() accountAddress}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for accountAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetAccountTransactionBySequenceNumber withAccountAddress(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableGetAccountTransactionBySequenceNumber(newValue, this.sequenceNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetAccountTransactionBySequenceNumber#getSequenceNumber() sequenceNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sequenceNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGetAccountTransactionBySequenceNumber withSequenceNumber(long value) {
    if (this.sequenceNumber == value) return this;
    return new ImmutableGetAccountTransactionBySequenceNumber(this.accountAddress, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGetAccountTransactionBySequenceNumber} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGetAccountTransactionBySequenceNumber
        && equalTo((ImmutableGetAccountTransactionBySequenceNumber) another);
  }

  private boolean equalTo(ImmutableGetAccountTransactionBySequenceNumber another) {
    return Arrays.equals(accountAddress, another.accountAddress)
        && sequenceNumber == another.sequenceNumber;
  }

  /**
   * Computes a hash code from attributes: {@code accountAddress}, {@code sequenceNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(accountAddress);
    h += (h << 5) + Longs.hashCode(sequenceNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code GetAccountTransactionBySequenceNumber} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GetAccountTransactionBySequenceNumber")
        .omitNullValues()
        .add("accountAddress", Arrays.toString(accountAddress))
        .add("sequenceNumber", sequenceNumber)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetAccountTransactionBySequenceNumber} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GetAccountTransactionBySequenceNumber instance
   */
  public static ImmutableGetAccountTransactionBySequenceNumber copyOf(GetAccountTransactionBySequenceNumber instance) {
    if (instance instanceof ImmutableGetAccountTransactionBySequenceNumber) {
      return (ImmutableGetAccountTransactionBySequenceNumber) instance;
    }
    return ImmutableGetAccountTransactionBySequenceNumber.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGetAccountTransactionBySequenceNumber ImmutableGetAccountTransactionBySequenceNumber}.
   * <pre>
   * ImmutableGetAccountTransactionBySequenceNumber.builder()
   *    .accountAddress(byte) // required {@link GetAccountTransactionBySequenceNumber#getAccountAddress() accountAddress}
   *    .sequenceNumber(long) // required {@link GetAccountTransactionBySequenceNumber#getSequenceNumber() sequenceNumber}
   *    .build();
   * </pre>
   * @return A new ImmutableGetAccountTransactionBySequenceNumber builder
   */
  public static ImmutableGetAccountTransactionBySequenceNumber.Builder builder() {
    return new ImmutableGetAccountTransactionBySequenceNumber.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGetAccountTransactionBySequenceNumber ImmutableGetAccountTransactionBySequenceNumber}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetAccountTransactionBySequenceNumber", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ADDRESS = 0x1L;
    private static final long INIT_BIT_SEQUENCE_NUMBER = 0x2L;
    private long initBits = 0x3L;

    private @Nullable byte[] accountAddress;
    private long sequenceNumber;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GetAccountTransactionBySequenceNumber} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetAccountTransactionBySequenceNumber instance) {
      Objects.requireNonNull(instance, "instance");
      accountAddress(instance.getAccountAddress());
      sequenceNumber(instance.getSequenceNumber());
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountTransactionBySequenceNumber#getAccountAddress() accountAddress} attribute.
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
     * Initializes the value for the {@link GetAccountTransactionBySequenceNumber#getSequenceNumber() sequenceNumber} attribute.
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
     * Builds a new {@link ImmutableGetAccountTransactionBySequenceNumber ImmutableGetAccountTransactionBySequenceNumber}.
     * @return An immutable instance of GetAccountTransactionBySequenceNumber
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGetAccountTransactionBySequenceNumber build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGetAccountTransactionBySequenceNumber(accountAddress, sequenceNumber);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ADDRESS) != 0) attributes.add("accountAddress");
      if ((initBits & INIT_BIT_SEQUENCE_NUMBER) != 0) attributes.add("sequenceNumber");
      return "Cannot build GetAccountTransactionBySequenceNumber, some of required attributes are not set " + attributes;
    }
  }
}
