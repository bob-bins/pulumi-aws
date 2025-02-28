// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventDestinationKinesisDestination {
    /**
     * @return The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    private String roleArn;
    /**
     * @return The ARN of the Kinesis Stream
     * 
     */
    private String streamArn;

    private EventDestinationKinesisDestination() {}
    /**
     * @return The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The ARN of the Kinesis Stream
     * 
     */
    public String streamArn() {
        return this.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationKinesisDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String roleArn;
        private String streamArn;
        public Builder() {}
        public Builder(EventDestinationKinesisDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.streamArn = defaults.streamArn;
        }

        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            if (roleArn == null) {
              throw new MissingRequiredPropertyException("EventDestinationKinesisDestination", "roleArn");
            }
            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder streamArn(String streamArn) {
            if (streamArn == null) {
              throw new MissingRequiredPropertyException("EventDestinationKinesisDestination", "streamArn");
            }
            this.streamArn = streamArn;
            return this;
        }
        public EventDestinationKinesisDestination build() {
            final var _resultValue = new EventDestinationKinesisDestination();
            _resultValue.roleArn = roleArn;
            _resultValue.streamArn = streamArn;
            return _resultValue;
        }
    }
}
