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
 * Immutable implementation of {@link EventHandle}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEventHandle.builder()}.
 */
@Generated(from = "EventHandle", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableEventHandle implements EventHandle {
  private final byte[] key;
  private final int count;

  private ImmutableEventHandle(byte[] key, int count) {
    this.key = key;
    this.count = count;
  }

  /**
   * @return A cloned {@code key} array
   */
  @Override
  public byte[] getKey() {
    return key.clone();
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @Override
  public int getCount() {
    return count;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EventHandle#getKey() key}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for key
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEventHandle withKey(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableEventHandle(newValue, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EventHandle#getCount() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEventHandle withCount(int value) {
    if (this.count == value) return this;
    return new ImmutableEventHandle(this.key, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEventHandle} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEventHandle
        && equalTo((ImmutableEventHandle) another);
  }

  private boolean equalTo(ImmutableEventHandle another) {
    return Arrays.equals(key, another.key)
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(key);
    h += (h << 5) + count;
    return h;
  }

  /**
   * Prints the immutable value {@code EventHandle} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EventHandle")
        .omitNullValues()
        .add("key", Arrays.toString(key))
        .add("count", count)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link EventHandle} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EventHandle instance
   */
  public static ImmutableEventHandle copyOf(EventHandle instance) {
    if (instance instanceof ImmutableEventHandle) {
      return (ImmutableEventHandle) instance;
    }
    return ImmutableEventHandle.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEventHandle ImmutableEventHandle}.
   * <pre>
   * ImmutableEventHandle.builder()
   *    .key(byte) // required {@link EventHandle#getKey() key}
   *    .count(int) // required {@link EventHandle#getCount() count}
   *    .build();
   * </pre>
   * @return A new ImmutableEventHandle builder
   */
  public static ImmutableEventHandle.Builder builder() {
    return new ImmutableEventHandle.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEventHandle ImmutableEventHandle}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EventHandle", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_KEY = 0x1L;
    private static final long INIT_BIT_COUNT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable byte[] key;
    private int count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EventHandle} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(EventHandle instance) {
      Objects.requireNonNull(instance, "instance");
      key(instance.getKey());
      count(instance.getCount());
      return this;
    }

    /**
     * Initializes the value for the {@link EventHandle#getKey() key} attribute.
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
     * Initializes the value for the {@link EventHandle#getCount() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder count(int count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEventHandle ImmutableEventHandle}.
     * @return An immutable instance of EventHandle
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEventHandle build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEventHandle(key, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build EventHandle, some of required attributes are not set " + attributes;
    }
  }
}
