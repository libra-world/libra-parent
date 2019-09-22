package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link GetAccountState}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGetAccountState.builder()}.
 */
@Generated(from = "GetAccountState", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGetAccountState implements GetAccountState {
  private final byte[] address;

  private ImmutableGetAccountState(byte[] address) {
    this.address = address;
  }

  /**
   * @return A cloned {@code address} array
   */
  @Override
  public byte[] getAddress() {
    return address.clone();
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link GetAccountState#getAddress() address}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGetAccountState withAddress(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableGetAccountState(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGetAccountState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGetAccountState
        && equalTo((ImmutableGetAccountState) another);
  }

  private boolean equalTo(ImmutableGetAccountState another) {
    return Arrays.equals(address, another.address);
  }

  /**
   * Computes a hash code from attributes: {@code address}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(address);
    return h;
  }

  /**
   * Prints the immutable value {@code GetAccountState} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GetAccountState")
        .omitNullValues()
        .add("address", Arrays.toString(address))
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetAccountState} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GetAccountState instance
   */
  public static ImmutableGetAccountState copyOf(GetAccountState instance) {
    if (instance instanceof ImmutableGetAccountState) {
      return (ImmutableGetAccountState) instance;
    }
    return ImmutableGetAccountState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGetAccountState ImmutableGetAccountState}.
   * <pre>
   * ImmutableGetAccountState.builder()
   *    .address(byte) // required {@link GetAccountState#getAddress() address}
   *    .build();
   * </pre>
   * @return A new ImmutableGetAccountState builder
   */
  public static ImmutableGetAccountState.Builder builder() {
    return new ImmutableGetAccountState.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGetAccountState ImmutableGetAccountState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetAccountState", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ADDRESS = 0x1L;
    private long initBits = 0x1L;

    private @Nullable byte[] address;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GetAccountState} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetAccountState instance) {
      Objects.requireNonNull(instance, "instance");
      address(instance.getAddress());
      return this;
    }

    /**
     * Initializes the value for the {@link GetAccountState#getAddress() address} attribute.
     * @param address The elements for address
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder address(byte... address) {
      this.address = address.clone();
      initBits &= ~INIT_BIT_ADDRESS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGetAccountState ImmutableGetAccountState}.
     * @return An immutable instance of GetAccountState
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGetAccountState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGetAccountState(address);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ADDRESS) != 0) attributes.add("address");
      return "Cannot build GetAccountState, some of required attributes are not set " + attributes;
    }
  }
}
