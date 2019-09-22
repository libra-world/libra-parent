package dev.jlibra.admissioncontrol.transaction;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Transaction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransaction.builder()}.
 */
@Generated(from = "Transaction", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTransaction implements Transaction {
  private final long sequenceNumber;
  private final Program program;
  private final long expirationTime;
  private final long gasUnitPrice;
  private final long maxGasAmount;

  private ImmutableTransaction(
      long sequenceNumber,
      Program program,
      long expirationTime,
      long gasUnitPrice,
      long maxGasAmount) {
    this.sequenceNumber = sequenceNumber;
    this.program = program;
    this.expirationTime = expirationTime;
    this.gasUnitPrice = gasUnitPrice;
    this.maxGasAmount = maxGasAmount;
  }

  /**
   * @return The value of the {@code sequenceNumber} attribute
   */
  @Override
  public long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * @return The value of the {@code program} attribute
   */
  @Override
  public Program getProgram() {
    return program;
  }

  /**
   * @return The value of the {@code expirationTime} attribute
   */
  @Override
  public long getExpirationTime() {
    return expirationTime;
  }

  /**
   * @return The value of the {@code gasUnitPrice} attribute
   */
  @Override
  public long getGasUnitPrice() {
    return gasUnitPrice;
  }

  /**
   * @return The value of the {@code maxGasAmount} attribute
   */
  @Override
  public long getMaxGasAmount() {
    return maxGasAmount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#getSequenceNumber() sequenceNumber} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sequenceNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withSequenceNumber(long value) {
    if (this.sequenceNumber == value) return this;
    return new ImmutableTransaction(value, this.program, this.expirationTime, this.gasUnitPrice, this.maxGasAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#getProgram() program} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for program
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withProgram(Program value) {
    if (this.program == value) return this;
    Program newValue = Objects.requireNonNull(value, "program");
    return new ImmutableTransaction(this.sequenceNumber, newValue, this.expirationTime, this.gasUnitPrice, this.maxGasAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#getExpirationTime() expirationTime} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expirationTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withExpirationTime(long value) {
    if (this.expirationTime == value) return this;
    return new ImmutableTransaction(this.sequenceNumber, this.program, value, this.gasUnitPrice, this.maxGasAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#getGasUnitPrice() gasUnitPrice} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for gasUnitPrice
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withGasUnitPrice(long value) {
    if (this.gasUnitPrice == value) return this;
    return new ImmutableTransaction(this.sequenceNumber, this.program, this.expirationTime, value, this.maxGasAmount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transaction#getMaxGasAmount() maxGasAmount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxGasAmount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransaction withMaxGasAmount(long value) {
    if (this.maxGasAmount == value) return this;
    return new ImmutableTransaction(this.sequenceNumber, this.program, this.expirationTime, this.gasUnitPrice, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransaction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransaction
        && equalTo((ImmutableTransaction) another);
  }

  private boolean equalTo(ImmutableTransaction another) {
    return sequenceNumber == another.sequenceNumber
        && program.equals(another.program)
        && expirationTime == another.expirationTime
        && gasUnitPrice == another.gasUnitPrice
        && maxGasAmount == another.maxGasAmount;
  }

  /**
   * Computes a hash code from attributes: {@code sequenceNumber}, {@code program}, {@code expirationTime}, {@code gasUnitPrice}, {@code maxGasAmount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Longs.hashCode(sequenceNumber);
    h += (h << 5) + program.hashCode();
    h += (h << 5) + Longs.hashCode(expirationTime);
    h += (h << 5) + Longs.hashCode(gasUnitPrice);
    h += (h << 5) + Longs.hashCode(maxGasAmount);
    return h;
  }

  /**
   * Prints the immutable value {@code Transaction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Transaction")
        .omitNullValues()
        .add("sequenceNumber", sequenceNumber)
        .add("program", program)
        .add("expirationTime", expirationTime)
        .add("gasUnitPrice", gasUnitPrice)
        .add("maxGasAmount", maxGasAmount)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Transaction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Transaction instance
   */
  public static ImmutableTransaction copyOf(Transaction instance) {
    if (instance instanceof ImmutableTransaction) {
      return (ImmutableTransaction) instance;
    }
    return ImmutableTransaction.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransaction ImmutableTransaction}.
   * <pre>
   * ImmutableTransaction.builder()
   *    .sequenceNumber(long) // required {@link Transaction#getSequenceNumber() sequenceNumber}
   *    .program(dev.jlibra.admissioncontrol.transaction.Program) // required {@link Transaction#getProgram() program}
   *    .expirationTime(long) // required {@link Transaction#getExpirationTime() expirationTime}
   *    .gasUnitPrice(long) // required {@link Transaction#getGasUnitPrice() gasUnitPrice}
   *    .maxGasAmount(long) // required {@link Transaction#getMaxGasAmount() maxGasAmount}
   *    .build();
   * </pre>
   * @return A new ImmutableTransaction builder
   */
  public static ImmutableTransaction.Builder builder() {
    return new ImmutableTransaction.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransaction ImmutableTransaction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Transaction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SEQUENCE_NUMBER = 0x1L;
    private static final long INIT_BIT_PROGRAM = 0x2L;
    private static final long INIT_BIT_EXPIRATION_TIME = 0x4L;
    private static final long INIT_BIT_GAS_UNIT_PRICE = 0x8L;
    private static final long INIT_BIT_MAX_GAS_AMOUNT = 0x10L;
    private long initBits = 0x1fL;

    private long sequenceNumber;
    private @Nullable Program program;
    private long expirationTime;
    private long gasUnitPrice;
    private long maxGasAmount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Transaction} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Transaction instance) {
      Objects.requireNonNull(instance, "instance");
      sequenceNumber(instance.getSequenceNumber());
      program(instance.getProgram());
      expirationTime(instance.getExpirationTime());
      gasUnitPrice(instance.getGasUnitPrice());
      maxGasAmount(instance.getMaxGasAmount());
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#getSequenceNumber() sequenceNumber} attribute.
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
     * Initializes the value for the {@link Transaction#getProgram() program} attribute.
     * @param program The value for program 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder program(Program program) {
      this.program = Objects.requireNonNull(program, "program");
      initBits &= ~INIT_BIT_PROGRAM;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#getExpirationTime() expirationTime} attribute.
     * @param expirationTime The value for expirationTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder expirationTime(long expirationTime) {
      this.expirationTime = expirationTime;
      initBits &= ~INIT_BIT_EXPIRATION_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#getGasUnitPrice() gasUnitPrice} attribute.
     * @param gasUnitPrice The value for gasUnitPrice 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder gasUnitPrice(long gasUnitPrice) {
      this.gasUnitPrice = gasUnitPrice;
      initBits &= ~INIT_BIT_GAS_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the value for the {@link Transaction#getMaxGasAmount() maxGasAmount} attribute.
     * @param maxGasAmount The value for maxGasAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder maxGasAmount(long maxGasAmount) {
      this.maxGasAmount = maxGasAmount;
      initBits &= ~INIT_BIT_MAX_GAS_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransaction ImmutableTransaction}.
     * @return An immutable instance of Transaction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransaction build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransaction(sequenceNumber, program, expirationTime, gasUnitPrice, maxGasAmount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SEQUENCE_NUMBER) != 0) attributes.add("sequenceNumber");
      if ((initBits & INIT_BIT_PROGRAM) != 0) attributes.add("program");
      if ((initBits & INIT_BIT_EXPIRATION_TIME) != 0) attributes.add("expirationTime");
      if ((initBits & INIT_BIT_GAS_UNIT_PRICE) != 0) attributes.add("gasUnitPrice");
      if ((initBits & INIT_BIT_MAX_GAS_AMOUNT) != 0) attributes.add("maxGasAmount");
      return "Cannot build Transaction, some of required attributes are not set " + attributes;
    }
  }
}
