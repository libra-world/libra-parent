package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
 * Immutable implementation of {@link SignedTransactionWithProof}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSignedTransactionWithProof.builder()}.
 */
@Generated(from = "SignedTransactionWithProof", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSignedTransactionWithProof
    implements SignedTransactionWithProof {
  private final byte[] senderPublicKey;
  private final byte[] senderSignature;
  private final ImmutableList<Event> events;

  private ImmutableSignedTransactionWithProof(
      byte[] senderPublicKey,
      byte[] senderSignature,
      ImmutableList<Event> events) {
    this.senderPublicKey = senderPublicKey;
    this.senderSignature = senderSignature;
    this.events = events;
  }

  /**
   * @return A cloned {@code senderPublicKey} array
   */
  @Override
  public byte[] getSenderPublicKey() {
    return senderPublicKey.clone();
  }

  /**
   * @return A cloned {@code senderSignature} array
   */
  @Override
  public byte[] getSenderSignature() {
    return senderSignature.clone();
  }

  /**
   * @return The value of the {@code events} attribute
   */
  @Override
  public ImmutableList<Event> getEvents() {
    return events;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SignedTransactionWithProof#getSenderPublicKey() senderPublicKey}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for senderPublicKey
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignedTransactionWithProof withSenderPublicKey(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableSignedTransactionWithProof(newValue, this.senderSignature, this.events);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SignedTransactionWithProof#getSenderSignature() senderSignature}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for senderSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignedTransactionWithProof withSenderSignature(byte... elements) {
    byte[] newValue = elements.clone();
    return new ImmutableSignedTransactionWithProof(this.senderPublicKey, newValue, this.events);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SignedTransactionWithProof#getEvents() events}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignedTransactionWithProof withEvents(Event... elements) {
    ImmutableList<Event> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSignedTransactionWithProof(this.senderPublicKey, this.senderSignature, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SignedTransactionWithProof#getEvents() events}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of events elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignedTransactionWithProof withEvents(Iterable<? extends Event> elements) {
    if (this.events == elements) return this;
    ImmutableList<Event> newValue = ImmutableList.copyOf(elements);
    return new ImmutableSignedTransactionWithProof(this.senderPublicKey, this.senderSignature, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSignedTransactionWithProof} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSignedTransactionWithProof
        && equalTo((ImmutableSignedTransactionWithProof) another);
  }

  private boolean equalTo(ImmutableSignedTransactionWithProof another) {
    return Arrays.equals(senderPublicKey, another.senderPublicKey)
        && Arrays.equals(senderSignature, another.senderSignature)
        && events.equals(another.events);
  }

  /**
   * Computes a hash code from attributes: {@code senderPublicKey}, {@code senderSignature}, {@code events}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Arrays.hashCode(senderPublicKey);
    h += (h << 5) + Arrays.hashCode(senderSignature);
    h += (h << 5) + events.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SignedTransactionWithProof} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SignedTransactionWithProof")
        .omitNullValues()
        .add("senderPublicKey", Arrays.toString(senderPublicKey))
        .add("senderSignature", Arrays.toString(senderSignature))
        .add("events", events)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SignedTransactionWithProof} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SignedTransactionWithProof instance
   */
  public static ImmutableSignedTransactionWithProof copyOf(SignedTransactionWithProof instance) {
    if (instance instanceof ImmutableSignedTransactionWithProof) {
      return (ImmutableSignedTransactionWithProof) instance;
    }
    return ImmutableSignedTransactionWithProof.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSignedTransactionWithProof ImmutableSignedTransactionWithProof}.
   * <pre>
   * ImmutableSignedTransactionWithProof.builder()
   *    .senderPublicKey(byte) // required {@link SignedTransactionWithProof#getSenderPublicKey() senderPublicKey}
   *    .senderSignature(byte) // required {@link SignedTransactionWithProof#getSenderSignature() senderSignature}
   *    .addEvents|addAllEvents(dev.jlibra.admissioncontrol.query.Event) // {@link SignedTransactionWithProof#getEvents() events} elements
   *    .build();
   * </pre>
   * @return A new ImmutableSignedTransactionWithProof builder
   */
  public static ImmutableSignedTransactionWithProof.Builder builder() {
    return new ImmutableSignedTransactionWithProof.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSignedTransactionWithProof ImmutableSignedTransactionWithProof}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SignedTransactionWithProof", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SENDER_PUBLIC_KEY = 0x1L;
    private static final long INIT_BIT_SENDER_SIGNATURE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable byte[] senderPublicKey;
    private @Nullable byte[] senderSignature;
    private ImmutableList.Builder<Event> events = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SignedTransactionWithProof} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(SignedTransactionWithProof instance) {
      Objects.requireNonNull(instance, "instance");
      senderPublicKey(instance.getSenderPublicKey());
      senderSignature(instance.getSenderSignature());
      addAllEvents(instance.getEvents());
      return this;
    }

    /**
     * Initializes the value for the {@link SignedTransactionWithProof#getSenderPublicKey() senderPublicKey} attribute.
     * @param senderPublicKey The elements for senderPublicKey
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder senderPublicKey(byte... senderPublicKey) {
      this.senderPublicKey = senderPublicKey.clone();
      initBits &= ~INIT_BIT_SENDER_PUBLIC_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link SignedTransactionWithProof#getSenderSignature() senderSignature} attribute.
     * @param senderSignature The elements for senderSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder senderSignature(byte... senderSignature) {
      this.senderSignature = senderSignature.clone();
      initBits &= ~INIT_BIT_SENDER_SIGNATURE;
      return this;
    }

    /**
     * Adds one element to {@link SignedTransactionWithProof#getEvents() events} list.
     * @param element A events element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addEvents(Event element) {
      this.events.add(element);
      return this;
    }

    /**
     * Adds elements to {@link SignedTransactionWithProof#getEvents() events} list.
     * @param elements An array of events elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addEvents(Event... elements) {
      this.events.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link SignedTransactionWithProof#getEvents() events} list.
     * @param elements An iterable of events elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder events(Iterable<? extends Event> elements) {
      this.events = ImmutableList.builder();
      return addAllEvents(elements);
    }

    /**
     * Adds elements to {@link SignedTransactionWithProof#getEvents() events} list.
     * @param elements An iterable of events elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllEvents(Iterable<? extends Event> elements) {
      this.events.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSignedTransactionWithProof ImmutableSignedTransactionWithProof}.
     * @return An immutable instance of SignedTransactionWithProof
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSignedTransactionWithProof build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSignedTransactionWithProof(senderPublicKey, senderSignature, events.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SENDER_PUBLIC_KEY) != 0) attributes.add("senderPublicKey");
      if ((initBits & INIT_BIT_SENDER_SIGNATURE) != 0) attributes.add("senderSignature");
      return "Cannot build SignedTransactionWithProof, some of required attributes are not set " + attributes;
    }
  }
}
