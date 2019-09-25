package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import com.google.protobuf.UnknownFieldSet;
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
 * Immutable implementation of {@link GetTransactions}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGetTransactions.builder()}.
 */
@Generated(from = "GetTransactions", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGetTransactions implements GetTransactions {
  private final long limit;
  private final boolean fetchEvents;
  private final UnknownFieldSet unknownFieldSet;
  private final long startVersion;

  private ImmutableGetTransactions(
      long limit,
      boolean fetchEvents,
      UnknownFieldSet unknownFieldSet,
      long startVersion) {
    this.limit = limit;
    this.fetchEvents = fetchEvents;
    this.unknownFieldSet = unknownFieldSet;
    this.startVersion = startVersion;
  }

  /**
   * @return The value of the {@code limit} attribute
   */
  @Override
  public long getLimit() {
    return limit;
  }

  /**
   * @return The value of the {@code fetchEvents} attribute
   */
  @Override
  public boolean getFetchEvents() {
    return fetchEvents;
  }

  /**
   * @return The value of the {@code unknownFieldSet} attribute
   */
  @Override
  public UnknownFieldSet getUnknownFieldSet() {
    return unknownFieldSet;
  }

  /**
   * @return The value of the {@code startVersion} attribute
   */
  @Override
  public long getStartVersion() {
    return startVersion;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTransactions#getLimit() limit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for limit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGetTransactions withLimit(long value) {
    if (this.limit == value) return this;
    return new ImmutableGetTransactions(value, this.fetchEvents, this.unknownFieldSet, this.startVersion);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTransactions#getFetchEvents() fetchEvents} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fetchEvents
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGetTransactions withFetchEvents(boolean value) {
    if (this.fetchEvents == value) return this;
    return new ImmutableGetTransactions(this.limit, value, this.unknownFieldSet, this.startVersion);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTransactions#getUnknownFieldSet() unknownFieldSet} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for unknownFieldSet
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGetTransactions withUnknownFieldSet(UnknownFieldSet value) {
    if (this.unknownFieldSet == value) return this;
    UnknownFieldSet newValue = Objects.requireNonNull(value, "unknownFieldSet");
    return new ImmutableGetTransactions(this.limit, this.fetchEvents, newValue, this.startVersion);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GetTransactions#getStartVersion() startVersion} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGetTransactions withStartVersion(long value) {
    if (this.startVersion == value) return this;
    return new ImmutableGetTransactions(this.limit, this.fetchEvents, this.unknownFieldSet, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGetTransactions} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGetTransactions
        && equalTo((ImmutableGetTransactions) another);
  }

  private boolean equalTo(ImmutableGetTransactions another) {
    return limit == another.limit
        && fetchEvents == another.fetchEvents
        && unknownFieldSet.equals(another.unknownFieldSet)
        && startVersion == another.startVersion;
  }

  /**
   * Computes a hash code from attributes: {@code limit}, {@code fetchEvents}, {@code unknownFieldSet}, {@code startVersion}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Longs.hashCode(limit);
    h += (h << 5) + Booleans.hashCode(fetchEvents);
    h += (h << 5) + unknownFieldSet.hashCode();
    h += (h << 5) + Longs.hashCode(startVersion);
    return h;
  }

  /**
   * Prints the immutable value {@code GetTransactions} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GetTransactions")
        .omitNullValues()
        .add("limit", limit)
        .add("fetchEvents", fetchEvents)
        .add("unknownFieldSet", unknownFieldSet)
        .add("startVersion", startVersion)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GetTransactions} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GetTransactions instance
   */
  public static ImmutableGetTransactions copyOf(GetTransactions instance) {
    if (instance instanceof ImmutableGetTransactions) {
      return (ImmutableGetTransactions) instance;
    }
    return ImmutableGetTransactions.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGetTransactions ImmutableGetTransactions}.
   * <pre>
   * ImmutableGetTransactions.builder()
   *    .limit(long) // required {@link GetTransactions#getLimit() limit}
   *    .fetchEvents(boolean) // required {@link GetTransactions#getFetchEvents() fetchEvents}
   *    .unknownFieldSet(com.google.protobuf.UnknownFieldSet) // required {@link GetTransactions#getUnknownFieldSet() unknownFieldSet}
   *    .startVersion(long) // required {@link GetTransactions#getStartVersion() startVersion}
   *    .build();
   * </pre>
   * @return A new ImmutableGetTransactions builder
   */
  public static ImmutableGetTransactions.Builder builder() {
    return new ImmutableGetTransactions.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGetTransactions ImmutableGetTransactions}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GetTransactions", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_LIMIT = 0x1L;
    private static final long INIT_BIT_FETCH_EVENTS = 0x2L;
    private static final long INIT_BIT_UNKNOWN_FIELD_SET = 0x4L;
    private static final long INIT_BIT_START_VERSION = 0x8L;
    private long initBits = 0xfL;

    private long limit;
    private boolean fetchEvents;
    private @Nullable UnknownFieldSet unknownFieldSet;
    private long startVersion;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GetTransactions} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GetTransactions instance) {
      Objects.requireNonNull(instance, "instance");
      limit(instance.getLimit());
      fetchEvents(instance.getFetchEvents());
      unknownFieldSet(instance.getUnknownFieldSet());
      startVersion(instance.getStartVersion());
      return this;
    }

    /**
     * Initializes the value for the {@link GetTransactions#getLimit() limit} attribute.
     * @param limit The value for limit 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder limit(long limit) {
      this.limit = limit;
      initBits &= ~INIT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the value for the {@link GetTransactions#getFetchEvents() fetchEvents} attribute.
     * @param fetchEvents The value for fetchEvents 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder fetchEvents(boolean fetchEvents) {
      this.fetchEvents = fetchEvents;
      initBits &= ~INIT_BIT_FETCH_EVENTS;
      return this;
    }

    /**
     * Initializes the value for the {@link GetTransactions#getUnknownFieldSet() unknownFieldSet} attribute.
     * @param unknownFieldSet The value for unknownFieldSet 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder unknownFieldSet(UnknownFieldSet unknownFieldSet) {
      this.unknownFieldSet = Objects.requireNonNull(unknownFieldSet, "unknownFieldSet");
      initBits &= ~INIT_BIT_UNKNOWN_FIELD_SET;
      return this;
    }

    /**
     * Initializes the value for the {@link GetTransactions#getStartVersion() startVersion} attribute.
     * @param startVersion The value for startVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder startVersion(long startVersion) {
      this.startVersion = startVersion;
      initBits &= ~INIT_BIT_START_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGetTransactions ImmutableGetTransactions}.
     * @return An immutable instance of GetTransactions
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGetTransactions build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGetTransactions(limit, fetchEvents, unknownFieldSet, startVersion);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_LIMIT) != 0) attributes.add("limit");
      if ((initBits & INIT_BIT_FETCH_EVENTS) != 0) attributes.add("fetchEvents");
      if ((initBits & INIT_BIT_UNKNOWN_FIELD_SET) != 0) attributes.add("unknownFieldSet");
      if ((initBits & INIT_BIT_START_VERSION) != 0) attributes.add("startVersion");
      return "Cannot build GetTransactions, some of required attributes are not set " + attributes;
    }
  }
}
