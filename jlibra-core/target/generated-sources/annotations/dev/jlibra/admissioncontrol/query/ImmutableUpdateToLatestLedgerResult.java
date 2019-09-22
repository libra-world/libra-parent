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
 * Immutable implementation of {@link UpdateToLatestLedgerResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUpdateToLatestLedgerResult.builder()}.
 */
@Generated(from = "UpdateToLatestLedgerResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableUpdateToLatestLedgerResult
    implements UpdateToLatestLedgerResult {
  private final ImmutableList<AccountData> accountStates;
  private final ImmutableList<SignedTransactionWithProof> accountTransactionsBySequenceNumber;

  private ImmutableUpdateToLatestLedgerResult(
      ImmutableList<AccountData> accountStates,
      ImmutableList<SignedTransactionWithProof> accountTransactionsBySequenceNumber) {
    this.accountStates = accountStates;
    this.accountTransactionsBySequenceNumber = accountTransactionsBySequenceNumber;
  }

  /**
   * @return The value of the {@code accountStates} attribute
   */
  @Override
  public ImmutableList<AccountData> getAccountStates() {
    return accountStates;
  }

  /**
   * @return The value of the {@code accountTransactionsBySequenceNumber} attribute
   */
  @Override
  public ImmutableList<SignedTransactionWithProof> getAccountTransactionsBySequenceNumber() {
    return accountTransactionsBySequenceNumber;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateToLatestLedgerResult#getAccountStates() accountStates}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateToLatestLedgerResult withAccountStates(AccountData... elements) {
    ImmutableList<AccountData> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUpdateToLatestLedgerResult(newValue, this.accountTransactionsBySequenceNumber);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateToLatestLedgerResult#getAccountStates() accountStates}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of accountStates elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateToLatestLedgerResult withAccountStates(Iterable<? extends AccountData> elements) {
    if (this.accountStates == elements) return this;
    ImmutableList<AccountData> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUpdateToLatestLedgerResult(newValue, this.accountTransactionsBySequenceNumber);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateToLatestLedgerResult withAccountTransactionsBySequenceNumber(SignedTransactionWithProof... elements) {
    ImmutableList<SignedTransactionWithProof> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUpdateToLatestLedgerResult(this.accountStates, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of accountTransactionsBySequenceNumber elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUpdateToLatestLedgerResult withAccountTransactionsBySequenceNumber(Iterable<? extends SignedTransactionWithProof> elements) {
    if (this.accountTransactionsBySequenceNumber == elements) return this;
    ImmutableList<SignedTransactionWithProof> newValue = ImmutableList.copyOf(elements);
    return new ImmutableUpdateToLatestLedgerResult(this.accountStates, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUpdateToLatestLedgerResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUpdateToLatestLedgerResult
        && equalTo((ImmutableUpdateToLatestLedgerResult) another);
  }

  private boolean equalTo(ImmutableUpdateToLatestLedgerResult another) {
    return accountStates.equals(another.accountStates)
        && accountTransactionsBySequenceNumber.equals(another.accountTransactionsBySequenceNumber);
  }

  /**
   * Computes a hash code from attributes: {@code accountStates}, {@code accountTransactionsBySequenceNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + accountStates.hashCode();
    h += (h << 5) + accountTransactionsBySequenceNumber.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code UpdateToLatestLedgerResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("UpdateToLatestLedgerResult")
        .omitNullValues()
        .add("accountStates", accountStates)
        .add("accountTransactionsBySequenceNumber", accountTransactionsBySequenceNumber)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link UpdateToLatestLedgerResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UpdateToLatestLedgerResult instance
   */
  public static ImmutableUpdateToLatestLedgerResult copyOf(UpdateToLatestLedgerResult instance) {
    if (instance instanceof ImmutableUpdateToLatestLedgerResult) {
      return (ImmutableUpdateToLatestLedgerResult) instance;
    }
    return ImmutableUpdateToLatestLedgerResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUpdateToLatestLedgerResult ImmutableUpdateToLatestLedgerResult}.
   * <pre>
   * ImmutableUpdateToLatestLedgerResult.builder()
   *    .addAccountStates|addAllAccountStates(dev.jlibra.admissioncontrol.query.AccountData) // {@link UpdateToLatestLedgerResult#getAccountStates() accountStates} elements
   *    .addAccountTransactionsBySequenceNumber|addAllAccountTransactionsBySequenceNumber(dev.jlibra.admissioncontrol.query.SignedTransactionWithProof) // {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber} elements
   *    .build();
   * </pre>
   * @return A new ImmutableUpdateToLatestLedgerResult builder
   */
  public static ImmutableUpdateToLatestLedgerResult.Builder builder() {
    return new ImmutableUpdateToLatestLedgerResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUpdateToLatestLedgerResult ImmutableUpdateToLatestLedgerResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UpdateToLatestLedgerResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<AccountData> accountStates = ImmutableList.builder();
    private ImmutableList.Builder<SignedTransactionWithProof> accountTransactionsBySequenceNumber = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UpdateToLatestLedgerResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(UpdateToLatestLedgerResult instance) {
      Objects.requireNonNull(instance, "instance");
      addAllAccountStates(instance.getAccountStates());
      addAllAccountTransactionsBySequenceNumber(instance.getAccountTransactionsBySequenceNumber());
      return this;
    }

    /**
     * Adds one element to {@link UpdateToLatestLedgerResult#getAccountStates() accountStates} list.
     * @param element A accountStates element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountStates(AccountData element) {
      this.accountStates.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UpdateToLatestLedgerResult#getAccountStates() accountStates} list.
     * @param elements An array of accountStates elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountStates(AccountData... elements) {
      this.accountStates.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link UpdateToLatestLedgerResult#getAccountStates() accountStates} list.
     * @param elements An iterable of accountStates elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accountStates(Iterable<? extends AccountData> elements) {
      this.accountStates = ImmutableList.builder();
      return addAllAccountStates(elements);
    }

    /**
     * Adds elements to {@link UpdateToLatestLedgerResult#getAccountStates() accountStates} list.
     * @param elements An iterable of accountStates elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllAccountStates(Iterable<? extends AccountData> elements) {
      this.accountStates.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber} list.
     * @param element A accountTransactionsBySequenceNumber element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountTransactionsBySequenceNumber(SignedTransactionWithProof element) {
      this.accountTransactionsBySequenceNumber.add(element);
      return this;
    }

    /**
     * Adds elements to {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber} list.
     * @param elements An array of accountTransactionsBySequenceNumber elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAccountTransactionsBySequenceNumber(SignedTransactionWithProof... elements) {
      this.accountTransactionsBySequenceNumber.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber} list.
     * @param elements An iterable of accountTransactionsBySequenceNumber elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder accountTransactionsBySequenceNumber(Iterable<? extends SignedTransactionWithProof> elements) {
      this.accountTransactionsBySequenceNumber = ImmutableList.builder();
      return addAllAccountTransactionsBySequenceNumber(elements);
    }

    /**
     * Adds elements to {@link UpdateToLatestLedgerResult#getAccountTransactionsBySequenceNumber() accountTransactionsBySequenceNumber} list.
     * @param elements An iterable of accountTransactionsBySequenceNumber elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllAccountTransactionsBySequenceNumber(Iterable<? extends SignedTransactionWithProof> elements) {
      this.accountTransactionsBySequenceNumber.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableUpdateToLatestLedgerResult ImmutableUpdateToLatestLedgerResult}.
     * @return An immutable instance of UpdateToLatestLedgerResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUpdateToLatestLedgerResult build() {
      return new ImmutableUpdateToLatestLedgerResult(accountStates.build(), accountTransactionsBySequenceNumber.build());
    }
  }
}
