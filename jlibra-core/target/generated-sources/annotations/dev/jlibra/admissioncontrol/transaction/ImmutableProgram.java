package dev.jlibra.admissioncontrol.transaction;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import com.google.protobuf.ByteString;
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
 * Immutable implementation of {@link Program}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProgram.builder()}.
 */
@Generated(from = "Program", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableProgram implements Program {
  private final ByteString code;
  private final ImmutableList<TransactionArgument> arguments;

  private ImmutableProgram(
      ByteString code,
      ImmutableList<TransactionArgument> arguments) {
    this.code = code;
    this.arguments = arguments;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @Override
  public ByteString getCode() {
    return code;
  }

  /**
   * @return The value of the {@code arguments} attribute
   */
  @Override
  public ImmutableList<TransactionArgument> getArguments() {
    return arguments;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Program#getCode() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProgram withCode(ByteString value) {
    if (this.code == value) return this;
    ByteString newValue = Objects.requireNonNull(value, "code");
    return new ImmutableProgram(newValue, this.arguments);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Program#getArguments() arguments}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProgram withArguments(TransactionArgument... elements) {
    ImmutableList<TransactionArgument> newValue = ImmutableList.copyOf(elements);
    return new ImmutableProgram(this.code, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Program#getArguments() arguments}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of arguments elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProgram withArguments(Iterable<? extends TransactionArgument> elements) {
    if (this.arguments == elements) return this;
    ImmutableList<TransactionArgument> newValue = ImmutableList.copyOf(elements);
    return new ImmutableProgram(this.code, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProgram} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProgram
        && equalTo((ImmutableProgram) another);
  }

  private boolean equalTo(ImmutableProgram another) {
    return code.equals(another.code)
        && arguments.equals(another.arguments);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code arguments}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + code.hashCode();
    h += (h << 5) + arguments.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Program} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Program")
        .omitNullValues()
        .add("code", code)
        .add("arguments", arguments)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Program} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Program instance
   */
  public static ImmutableProgram copyOf(Program instance) {
    if (instance instanceof ImmutableProgram) {
      return (ImmutableProgram) instance;
    }
    return ImmutableProgram.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableProgram ImmutableProgram}.
   * <pre>
   * ImmutableProgram.builder()
   *    .code(com.google.protobuf.ByteString) // required {@link Program#getCode() code}
   *    .addArguments|addAllArguments(dev.jlibra.admissioncontrol.transaction.TransactionArgument) // {@link Program#getArguments() arguments} elements
   *    .build();
   * </pre>
   * @return A new ImmutableProgram builder
   */
  public static ImmutableProgram.Builder builder() {
    return new ImmutableProgram.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableProgram ImmutableProgram}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Program", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CODE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable ByteString code;
    private ImmutableList.Builder<TransactionArgument> arguments = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Program} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Program instance) {
      Objects.requireNonNull(instance, "instance");
      code(instance.getCode());
      addAllArguments(instance.getArguments());
      return this;
    }

    /**
     * Initializes the value for the {@link Program#getCode() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder code(ByteString code) {
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Adds one element to {@link Program#getArguments() arguments} list.
     * @param element A arguments element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addArguments(TransactionArgument element) {
      this.arguments.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Program#getArguments() arguments} list.
     * @param elements An array of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addArguments(TransactionArgument... elements) {
      this.arguments.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Program#getArguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder arguments(Iterable<? extends TransactionArgument> elements) {
      this.arguments = ImmutableList.builder();
      return addAllArguments(elements);
    }

    /**
     * Adds elements to {@link Program#getArguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllArguments(Iterable<? extends TransactionArgument> elements) {
      this.arguments.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableProgram ImmutableProgram}.
     * @return An immutable instance of Program
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableProgram build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableProgram(code, arguments.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CODE) != 0) attributes.add("code");
      return "Cannot build Program, some of required attributes are not set " + attributes;
    }
  }
}
