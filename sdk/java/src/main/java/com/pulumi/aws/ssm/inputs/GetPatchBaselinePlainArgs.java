// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPatchBaselinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPatchBaselinePlainArgs Empty = new GetPatchBaselinePlainArgs();

    /**
     * Filters the results against the baselines default_baseline field.
     * 
     */
    @Import(name="defaultBaseline")
    private @Nullable Boolean defaultBaseline;

    /**
     * @return Filters the results against the baselines default_baseline field.
     * 
     */
    public Optional<Boolean> defaultBaseline() {
        return Optional.ofNullable(this.defaultBaseline);
    }

    /**
     * Filter results by the baseline name prefix.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return Filter results by the baseline name prefix.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Specified OS for the baseline. Valid values: `AMAZON_LINUX`, `AMAZON_LINUX_2`, `UBUNTU`, `REDHAT_ENTERPRISE_LINUX`, `SUSE`, `CENTOS`, `ORACLE_LINUX`, `DEBIAN`, `MACOS`, `RASPBIAN` and `ROCKY_LINUX`.
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable String operatingSystem;

    /**
     * @return Specified OS for the baseline. Valid values: `AMAZON_LINUX`, `AMAZON_LINUX_2`, `UBUNTU`, `REDHAT_ENTERPRISE_LINUX`, `SUSE`, `CENTOS`, `ORACLE_LINUX`, `DEBIAN`, `MACOS`, `RASPBIAN` and `ROCKY_LINUX`.
     * 
     */
    public Optional<String> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * Owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
     * 
     */
    @Import(name="owner", required=true)
    private String owner;

    /**
     * @return Owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
     * 
     */
    public String owner() {
        return this.owner;
    }

    private GetPatchBaselinePlainArgs() {}

    private GetPatchBaselinePlainArgs(GetPatchBaselinePlainArgs $) {
        this.defaultBaseline = $.defaultBaseline;
        this.namePrefix = $.namePrefix;
        this.operatingSystem = $.operatingSystem;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPatchBaselinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPatchBaselinePlainArgs $;

        public Builder() {
            $ = new GetPatchBaselinePlainArgs();
        }

        public Builder(GetPatchBaselinePlainArgs defaults) {
            $ = new GetPatchBaselinePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultBaseline Filters the results against the baselines default_baseline field.
         * 
         * @return builder
         * 
         */
        public Builder defaultBaseline(@Nullable Boolean defaultBaseline) {
            $.defaultBaseline = defaultBaseline;
            return this;
        }

        /**
         * @param namePrefix Filter results by the baseline name prefix.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param operatingSystem Specified OS for the baseline. Valid values: `AMAZON_LINUX`, `AMAZON_LINUX_2`, `UBUNTU`, `REDHAT_ENTERPRISE_LINUX`, `SUSE`, `CENTOS`, `ORACLE_LINUX`, `DEBIAN`, `MACOS`, `RASPBIAN` and `ROCKY_LINUX`.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable String operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param owner Owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            $.owner = owner;
            return this;
        }

        public GetPatchBaselinePlainArgs build() {
            if ($.owner == null) {
                throw new MissingRequiredPropertyException("GetPatchBaselinePlainArgs", "owner");
            }
            return $;
        }
    }

}
