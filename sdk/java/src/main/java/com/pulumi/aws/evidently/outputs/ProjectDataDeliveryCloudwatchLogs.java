// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectDataDeliveryCloudwatchLogs {
    /**
     * @return The name of the log group where the project stores evaluation events.
     * 
     * The `s3_destination` block supports the following arguments:
     * 
     */
    private @Nullable String logGroup;

    private ProjectDataDeliveryCloudwatchLogs() {}
    /**
     * @return The name of the log group where the project stores evaluation events.
     * 
     * The `s3_destination` block supports the following arguments:
     * 
     */
    public Optional<String> logGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDataDeliveryCloudwatchLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String logGroup;
        public Builder() {}
        public Builder(ProjectDataDeliveryCloudwatchLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroup = defaults.logGroup;
        }

        @CustomType.Setter
        public Builder logGroup(@Nullable String logGroup) {

            this.logGroup = logGroup;
            return this;
        }
        public ProjectDataDeliveryCloudwatchLogs build() {
            final var _resultValue = new ProjectDataDeliveryCloudwatchLogs();
            _resultValue.logGroup = logGroup;
            return _resultValue;
        }
    }
}
