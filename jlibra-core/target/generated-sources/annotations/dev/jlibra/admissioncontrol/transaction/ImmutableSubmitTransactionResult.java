package dev.jlibra.admissioncontrol.transaction;

import admission_control.AdmissionControlOuterClass;
import com.google.common.base.MoreObjects;
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
import mempool.MempoolStatus;
import org.immutables.value.Generated;
import types.VmErrors;

/**
 * Immutable implementation of {@link SubmitTransactionResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubmitTransactionResult.builder()}.
 */
@Generated(from = "SubmitTransactionResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSubmitTransactionResult
    implements SubmitTransactionResult {
  private final AdmissionControlOuterClass.AdmissionControlStatus admissionControlStatus;
  private final MempoolStatus.MempoolAddTransactionStatus mempoolStatus;
  private final VmErrors.VMStatus vmStatus;
  private final AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase statusCase;

  private ImmutableSubmitTransactionResult(
      AdmissionControlOuterClass.AdmissionControlStatus admissionControlStatus,
      MempoolStatus.MempoolAddTransactionStatus mempoolStatus,
      VmErrors.VMStatus vmStatus,
      AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase statusCase) {
    this.admissionControlStatus = admissionControlStatus;
    this.mempoolStatus = mempoolStatus;
    this.vmStatus = vmStatus;
    this.statusCase = statusCase;
  }

  /**
   * @return The value of the {@code admissionControlStatus} attribute
   */
  @Override
  public AdmissionControlOuterClass.AdmissionControlStatus getAdmissionControlStatus() {
    return admissionControlStatus;
  }

  /**
   * @return The value of the {@code mempoolStatus} attribute
   */
  @Override
  public MempoolStatus.MempoolAddTransactionStatus getMempoolStatus() {
    return mempoolStatus;
  }

  /**
   * @return The value of the {@code vmStatus} attribute
   */
  @Override
  public VmErrors.VMStatus getVmStatus() {
    return vmStatus;
  }

  /**
   * @return The value of the {@code statusCase} attribute
   */
  @Override
  public AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase getStatusCase() {
    return statusCase;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubmitTransactionResult#getAdmissionControlStatus() admissionControlStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for admissionControlStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubmitTransactionResult withAdmissionControlStatus(AdmissionControlOuterClass.AdmissionControlStatus value) {
    if (this.admissionControlStatus == value) return this;
    AdmissionControlOuterClass.AdmissionControlStatus newValue = Objects.requireNonNull(value, "admissionControlStatus");
    return new ImmutableSubmitTransactionResult(newValue, this.mempoolStatus, this.vmStatus, this.statusCase);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubmitTransactionResult#getMempoolStatus() mempoolStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mempoolStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubmitTransactionResult withMempoolStatus(MempoolStatus.MempoolAddTransactionStatus value) {
    if (this.mempoolStatus == value) return this;
    MempoolStatus.MempoolAddTransactionStatus newValue = Objects.requireNonNull(value, "mempoolStatus");
    return new ImmutableSubmitTransactionResult(this.admissionControlStatus, newValue, this.vmStatus, this.statusCase);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubmitTransactionResult#getVmStatus() vmStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vmStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubmitTransactionResult withVmStatus(VmErrors.VMStatus value) {
    if (this.vmStatus == value) return this;
    VmErrors.VMStatus newValue = Objects.requireNonNull(value, "vmStatus");
    return new ImmutableSubmitTransactionResult(this.admissionControlStatus, this.mempoolStatus, newValue, this.statusCase);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubmitTransactionResult#getStatusCase() statusCase} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for statusCase
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubmitTransactionResult withStatusCase(AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase value) {
    if (this.statusCase == value) return this;
    AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase newValue = Objects.requireNonNull(value, "statusCase");
    if (this.statusCase.equals(newValue)) return this;
    return new ImmutableSubmitTransactionResult(this.admissionControlStatus, this.mempoolStatus, this.vmStatus, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubmitTransactionResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubmitTransactionResult
        && equalTo((ImmutableSubmitTransactionResult) another);
  }

  private boolean equalTo(ImmutableSubmitTransactionResult another) {
    return admissionControlStatus.equals(another.admissionControlStatus)
        && mempoolStatus.equals(another.mempoolStatus)
        && vmStatus.equals(another.vmStatus)
        && statusCase.equals(another.statusCase);
  }

  /**
   * Computes a hash code from attributes: {@code admissionControlStatus}, {@code mempoolStatus}, {@code vmStatus}, {@code statusCase}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + admissionControlStatus.hashCode();
    h += (h << 5) + mempoolStatus.hashCode();
    h += (h << 5) + vmStatus.hashCode();
    h += (h << 5) + statusCase.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SubmitTransactionResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SubmitTransactionResult")
        .omitNullValues()
        .add("admissionControlStatus", admissionControlStatus)
        .add("mempoolStatus", mempoolStatus)
        .add("vmStatus", vmStatus)
        .add("statusCase", statusCase)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SubmitTransactionResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubmitTransactionResult instance
   */
  public static ImmutableSubmitTransactionResult copyOf(SubmitTransactionResult instance) {
    if (instance instanceof ImmutableSubmitTransactionResult) {
      return (ImmutableSubmitTransactionResult) instance;
    }
    return ImmutableSubmitTransactionResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSubmitTransactionResult ImmutableSubmitTransactionResult}.
   * <pre>
   * ImmutableSubmitTransactionResult.builder()
   *    .admissionControlStatus(admission_control.AdmissionControlOuterClass.AdmissionControlStatus) // required {@link SubmitTransactionResult#getAdmissionControlStatus() admissionControlStatus}
   *    .mempoolStatus(mempool.MempoolStatus.MempoolAddTransactionStatus) // required {@link SubmitTransactionResult#getMempoolStatus() mempoolStatus}
   *    .vmStatus(types.VmErrors.VMStatus) // required {@link SubmitTransactionResult#getVmStatus() vmStatus}
   *    .statusCase(admission_control.AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase) // required {@link SubmitTransactionResult#getStatusCase() statusCase}
   *    .build();
   * </pre>
   * @return A new ImmutableSubmitTransactionResult builder
   */
  public static ImmutableSubmitTransactionResult.Builder builder() {
    return new ImmutableSubmitTransactionResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSubmitTransactionResult ImmutableSubmitTransactionResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubmitTransactionResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ADMISSION_CONTROL_STATUS = 0x1L;
    private static final long INIT_BIT_MEMPOOL_STATUS = 0x2L;
    private static final long INIT_BIT_VM_STATUS = 0x4L;
    private static final long INIT_BIT_STATUS_CASE = 0x8L;
    private long initBits = 0xfL;

    private @Nullable AdmissionControlOuterClass.AdmissionControlStatus admissionControlStatus;
    private @Nullable MempoolStatus.MempoolAddTransactionStatus mempoolStatus;
    private @Nullable VmErrors.VMStatus vmStatus;
    private @Nullable AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase statusCase;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SubmitTransactionResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(SubmitTransactionResult instance) {
      Objects.requireNonNull(instance, "instance");
      admissionControlStatus(instance.getAdmissionControlStatus());
      mempoolStatus(instance.getMempoolStatus());
      vmStatus(instance.getVmStatus());
      statusCase(instance.getStatusCase());
      return this;
    }

    /**
     * Initializes the value for the {@link SubmitTransactionResult#getAdmissionControlStatus() admissionControlStatus} attribute.
     * @param admissionControlStatus The value for admissionControlStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder admissionControlStatus(AdmissionControlOuterClass.AdmissionControlStatus admissionControlStatus) {
      this.admissionControlStatus = Objects.requireNonNull(admissionControlStatus, "admissionControlStatus");
      initBits &= ~INIT_BIT_ADMISSION_CONTROL_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SubmitTransactionResult#getMempoolStatus() mempoolStatus} attribute.
     * @param mempoolStatus The value for mempoolStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder mempoolStatus(MempoolStatus.MempoolAddTransactionStatus mempoolStatus) {
      this.mempoolStatus = Objects.requireNonNull(mempoolStatus, "mempoolStatus");
      initBits &= ~INIT_BIT_MEMPOOL_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SubmitTransactionResult#getVmStatus() vmStatus} attribute.
     * @param vmStatus The value for vmStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder vmStatus(VmErrors.VMStatus vmStatus) {
      this.vmStatus = Objects.requireNonNull(vmStatus, "vmStatus");
      initBits &= ~INIT_BIT_VM_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SubmitTransactionResult#getStatusCase() statusCase} attribute.
     * @param statusCase The value for statusCase 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder statusCase(AdmissionControlOuterClass.SubmitTransactionResponse.StatusCase statusCase) {
      this.statusCase = Objects.requireNonNull(statusCase, "statusCase");
      initBits &= ~INIT_BIT_STATUS_CASE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSubmitTransactionResult ImmutableSubmitTransactionResult}.
     * @return An immutable instance of SubmitTransactionResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSubmitTransactionResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSubmitTransactionResult(admissionControlStatus, mempoolStatus, vmStatus, statusCase);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ADMISSION_CONTROL_STATUS) != 0) attributes.add("admissionControlStatus");
      if ((initBits & INIT_BIT_MEMPOOL_STATUS) != 0) attributes.add("mempoolStatus");
      if ((initBits & INIT_BIT_VM_STATUS) != 0) attributes.add("vmStatus");
      if ((initBits & INIT_BIT_STATUS_CASE) != 0) attributes.add("statusCase");
      return "Cannot build SubmitTransactionResult, some of required attributes are not set " + attributes;
    }
  }
}
