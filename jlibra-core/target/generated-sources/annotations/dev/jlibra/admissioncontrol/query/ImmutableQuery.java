package dev.jlibra.admissioncontrol.query;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Query}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuery.builder()}.
 */
@Generated(from = "Query", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableQuery implements Query {
  private final ImmutableList<GetAccountState> accountStateQueries;
  private final ImmutableList<GetAccountTransactionBySequenceNumber> accountTransactionBySequenceNumberQueries;

  private ImmutableQuery(
      ImmutableList<GetAccountState> accountStateQueries,
      ImmutableList<GetAccountTransactionBySequenceNumber> accountTransactionBySequenceNumberQueries) {
    this.accountStateQueries = accountStateQueries;
    this.accountTransactionBySequenceNumberQueries = accountTransactionBySequenceNumberQueries;
  }

  /**
   * @return The value of the {@code accountStateQueries} attribute
   */
  @Override
  public ImmutableList<GetAccountState> getAccountStateQueries() {
    return accountStateQueries;
  }

  /**
   * @return The value of the {@code accountTransactionBySequenceNumberQueries} attribute
   */
  @Override
  public ImmutableList<GetAccountTransactionBySequenceNumber> getAccountTransactionBySequenceNumberQueries() {
    return accountTransactionBySequenceNumberQueries;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Query#getAccountStateQueries() accountStateQueries}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuery withAccountStateQueries(GetAccountState... elements) {
    ImmutableList<GetAccountState> newValue = ImmutableList.copyOf(elements);
    return new ImmutableQuery(newValue, this.accountTransactionBySequenceNumberQueries);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Query#getAccountStateQueries() accountStateQueries}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of accountStateQueries elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuery withAccountStateQueries(Iterable<? extends GetAccountState> elements) {
    if (this.accountStateQueries == elements) return this;
    ImmutableList<GetAccountState> newValue = ImmutableList.copyOf(elements);
    return new ImmutableQuery(newValue, this.accountTransactionBySequenceNumberQueries);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuery withAccountTransactionBySequenceNumberQueries(GetAccountTransactionBySequenceNumber... elements) {
    ImmutableList<GetAccountTransactionBySequenceNumber> newValue = ImmutableList.copyOf(elements);
    return new ImmutableQuery(this.accountStateQueries, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of accountTransactionBySequenceNumberQueries elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuery withAccountTransactionBySequenceNumberQueries(Iterable<? extends GetAccountTransactionBySequenceNumber> elements) {
    if (this.accountTransactionBySequenceNumberQueries == elements) return this;
    ImmutableList<GetAccountTransactionBySequenceNumber> newValue = ImmutableList.copyOf(elements);
    return new ImmutableQuery(this.accountStateQueries, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuery
        && equalTo((ImmutableQuery) another);
  }

  private boolean equalTo(ImmutableQuery another) {
    return accountStateQueries.equals(another.accountStateQueries)
        && accountTransactionBySequenceNumberQueries.equals(another.accountTransactionBySequenceNumberQueries);
  }

  /**
   * Computes a hash code from attributes: {@code accountStateQueries}, {@code accountTransactionBySequenceNumberQueries}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + accountStateQueries.hashCode();
    h += (h << 5) + accountTransactionBySequenceNumberQueries.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Query} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Query")
        .omitNullValues()
        .add("accountStateQueries", accountStateQueries)
        .add("accountTransactionBySequenceNumberQueries", accountTransactionBySequenceNumberQueries)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Query} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Query instance
   */
  public static ImmutableQuery copyOf(Query instance) {
    if (instance instanceof ImmutableQuery) {
      return (ImmutableQuery) instance;
    }
    return ImmutableQuery.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableQuery ImmutableQuery}.
   * <pre>
   * ImmutableQuery.builder()
   *    .addAccountStateQueries|addAllAccountStateQueries(dev.jlibra.admissioncontrol.query.GetAccountState) // {@link Query#getAccountStateQueries() accountStateQueries} elements
   *    .addAccountTransactionBySequenceNumberQueries|addAllAccountTransactionBySequenceNumberQueries(dev.jlibra.admissioncontrol.query.GetAccountTransactionBySequenceNumber) // {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries} elements
   *    .build();
   * </pre>
   * @return A new ImmutableQuery builder
   */
  public static ImmutableQuery.Builder builder() {
    return new ImmutableQuery.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableQuery ImmutableQuery}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Query", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<GetAccountState> accountStateQueries = ImmutableList.builder();
    private ImmutableList.Builder<GetAccountTransactionBySequenceNumber> accountTransactionBySequenceNumberQueries = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Query} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Query instance) {
      Objects.requireNonNull(instance, "instance");
      addAllAccountStateQueries(instance.getAccountStateQueries());
      addAllAccountTransactionBySequenceNumberQueries(instance.getAccountTransactionBySequenceNumberQueries());
      return this;
    }

    /**
     * Adds one element to {@link Query#getAccountStateQueries() accountStateQueries} list.
     * @param element A accountStateQueries element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountStateQueries(GetAccountState element) {
      this.accountStateQueries.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Query#getAccountStateQueries() accountStateQueries} list.
     * @param elements An array of accountStateQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountStateQueries(GetAccountState... elements) {
      this.accountStateQueries.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Query#getAccountStateQueries() accountStateQueries} list.
     * @param elements An iterable of accountStateQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accountStateQueries(Iterable<? extends GetAccountState> elements) {
      this.accountStateQueries = ImmutableList.builder();
      return addAllAccountStateQueries(elements);
    }

    /**
     * Adds elements to {@link Query#getAccountStateQueries() accountStateQueries} list.
     * @param elements An iterable of accountStateQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllAccountStateQueries(Iterable<? extends GetAccountState> elements) {
      this.accountStateQueries.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries} list.
     * @param element A accountTransactionBySequenceNumberQueries element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountTransactionBySequenceNumberQueries(GetAccountTransactionBySequenceNumber element) {
      this.accountTransactionBySequenceNumberQueries.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries} list.
     * @param elements An array of accountTransactionBySequenceNumberQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountTransactionBySequenceNumberQueries(GetAccountTransactionBySequenceNumber... elements) {
      this.accountTransactionBySequenceNumberQueries.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries} list.
     * @param elements An iterable of accountTransactionBySequenceNumberQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accountTransactionBySequenceNumberQueries(Iterable<? extends GetAccountTransactionBySequenceNumber> elements) {
      this.accountTransactionBySequenceNumberQueries = ImmutableList.builder();
      return addAllAccountTransactionBySequenceNumberQueries(elements);
    }

    /**
     * Adds elements to {@link Query#getAccountTransactionBySequenceNumberQueries() accountTransactionBySequenceNumberQueries} list.
     * @param elements An iterable of accountTransactionBySequenceNumberQueries elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllAccountTransactionBySequenceNumberQueries(Iterable<? extends GetAccountTransactionBySequenceNumber> elements) {
      this.accountTransactionBySequenceNumberQueries.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableQuery ImmutableQuery}.
     * @return An immutable instance of Query
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableQuery build() {
      return new ImmutableQuery(accountStateQueries.build(), accountTransactionBySequenceNumberQueries.build());
    }
  }
}
