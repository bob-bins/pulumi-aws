// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateMaintenanceOption {
    private String autoRecovery;

    private GetLaunchTemplateMaintenanceOption() {}
    public String autoRecovery() {
        return this.autoRecovery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateMaintenanceOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoRecovery;
        public Builder() {}
        public Builder(GetLaunchTemplateMaintenanceOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRecovery = defaults.autoRecovery;
        }

        @CustomType.Setter
        public Builder autoRecovery(String autoRecovery) {
            if (autoRecovery == null) {
              throw new MissingRequiredPropertyException("GetLaunchTemplateMaintenanceOption", "autoRecovery");
            }
            this.autoRecovery = autoRecovery;
            return this;
        }
        public GetLaunchTemplateMaintenanceOption build() {
            final var _resultValue = new GetLaunchTemplateMaintenanceOption();
            _resultValue.autoRecovery = autoRecovery;
            return _resultValue;
        }
    }
}
