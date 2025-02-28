// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrockmodel.outputs;

import com.pulumi.aws.bedrockmodel.outputs.InvocationLoggingConfigurationLoggingConfigCloudwatchConfig;
import com.pulumi.aws.bedrockmodel.outputs.InvocationLoggingConfigurationLoggingConfigS3Config;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InvocationLoggingConfigurationLoggingConfig {
    /**
     * @return CloudWatch logging configuration. See `cloudwatch_config`.
     * 
     */
    private @Nullable InvocationLoggingConfigurationLoggingConfigCloudwatchConfig cloudwatchConfig;
    /**
     * @return Set to include embeddings data in the log delivery.
     * 
     */
    private Boolean embeddingDataDeliveryEnabled;
    /**
     * @return Set to include image data in the log delivery.
     * 
     */
    private Boolean imageDataDeliveryEnabled;
    /**
     * @return S3 configuration for storing log data. See `s3_config`.
     * 
     */
    private @Nullable InvocationLoggingConfigurationLoggingConfigS3Config s3Config;
    /**
     * @return Set to include text data in the log delivery.
     * 
     */
    private Boolean textDataDeliveryEnabled;

    private InvocationLoggingConfigurationLoggingConfig() {}
    /**
     * @return CloudWatch logging configuration. See `cloudwatch_config`.
     * 
     */
    public Optional<InvocationLoggingConfigurationLoggingConfigCloudwatchConfig> cloudwatchConfig() {
        return Optional.ofNullable(this.cloudwatchConfig);
    }
    /**
     * @return Set to include embeddings data in the log delivery.
     * 
     */
    public Boolean embeddingDataDeliveryEnabled() {
        return this.embeddingDataDeliveryEnabled;
    }
    /**
     * @return Set to include image data in the log delivery.
     * 
     */
    public Boolean imageDataDeliveryEnabled() {
        return this.imageDataDeliveryEnabled;
    }
    /**
     * @return S3 configuration for storing log data. See `s3_config`.
     * 
     */
    public Optional<InvocationLoggingConfigurationLoggingConfigS3Config> s3Config() {
        return Optional.ofNullable(this.s3Config);
    }
    /**
     * @return Set to include text data in the log delivery.
     * 
     */
    public Boolean textDataDeliveryEnabled() {
        return this.textDataDeliveryEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvocationLoggingConfigurationLoggingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InvocationLoggingConfigurationLoggingConfigCloudwatchConfig cloudwatchConfig;
        private Boolean embeddingDataDeliveryEnabled;
        private Boolean imageDataDeliveryEnabled;
        private @Nullable InvocationLoggingConfigurationLoggingConfigS3Config s3Config;
        private Boolean textDataDeliveryEnabled;
        public Builder() {}
        public Builder(InvocationLoggingConfigurationLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.embeddingDataDeliveryEnabled = defaults.embeddingDataDeliveryEnabled;
    	      this.imageDataDeliveryEnabled = defaults.imageDataDeliveryEnabled;
    	      this.s3Config = defaults.s3Config;
    	      this.textDataDeliveryEnabled = defaults.textDataDeliveryEnabled;
        }

        @CustomType.Setter
        public Builder cloudwatchConfig(@Nullable InvocationLoggingConfigurationLoggingConfigCloudwatchConfig cloudwatchConfig) {

            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }
        @CustomType.Setter
        public Builder embeddingDataDeliveryEnabled(Boolean embeddingDataDeliveryEnabled) {
            if (embeddingDataDeliveryEnabled == null) {
              throw new MissingRequiredPropertyException("InvocationLoggingConfigurationLoggingConfig", "embeddingDataDeliveryEnabled");
            }
            this.embeddingDataDeliveryEnabled = embeddingDataDeliveryEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder imageDataDeliveryEnabled(Boolean imageDataDeliveryEnabled) {
            if (imageDataDeliveryEnabled == null) {
              throw new MissingRequiredPropertyException("InvocationLoggingConfigurationLoggingConfig", "imageDataDeliveryEnabled");
            }
            this.imageDataDeliveryEnabled = imageDataDeliveryEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder s3Config(@Nullable InvocationLoggingConfigurationLoggingConfigS3Config s3Config) {

            this.s3Config = s3Config;
            return this;
        }
        @CustomType.Setter
        public Builder textDataDeliveryEnabled(Boolean textDataDeliveryEnabled) {
            if (textDataDeliveryEnabled == null) {
              throw new MissingRequiredPropertyException("InvocationLoggingConfigurationLoggingConfig", "textDataDeliveryEnabled");
            }
            this.textDataDeliveryEnabled = textDataDeliveryEnabled;
            return this;
        }
        public InvocationLoggingConfigurationLoggingConfig build() {
            final var _resultValue = new InvocationLoggingConfigurationLoggingConfig();
            _resultValue.cloudwatchConfig = cloudwatchConfig;
            _resultValue.embeddingDataDeliveryEnabled = embeddingDataDeliveryEnabled;
            _resultValue.imageDataDeliveryEnabled = imageDataDeliveryEnabled;
            _resultValue.s3Config = s3Config;
            _resultValue.textDataDeliveryEnabled = textDataDeliveryEnabled;
            return _resultValue;
        }
    }
}
