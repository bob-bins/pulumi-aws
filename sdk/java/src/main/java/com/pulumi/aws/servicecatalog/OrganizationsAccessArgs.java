// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationsAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationsAccessArgs Empty = new OrganizationsAccessArgs();

    /**
     * Whether to enable AWS Organizations access.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable AWS Organizations access.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private OrganizationsAccessArgs() {}

    private OrganizationsAccessArgs(OrganizationsAccessArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationsAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationsAccessArgs $;

        public Builder() {
            $ = new OrganizationsAccessArgs();
        }

        public Builder(OrganizationsAccessArgs defaults) {
            $ = new OrganizationsAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable AWS Organizations access.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable AWS Organizations access.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public OrganizationsAccessArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("OrganizationsAccessArgs", "enabled");
            }
            return $;
        }
    }

}
