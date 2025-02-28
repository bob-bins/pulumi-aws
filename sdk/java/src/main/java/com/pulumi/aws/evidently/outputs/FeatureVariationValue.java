// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureVariationValue {
    /**
     * @return If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * 
     */
    private @Nullable String boolValue;
    /**
     * @return If this feature uses the double integer variation type, this field contains the double integer value of this variation.
     * 
     */
    private @Nullable String doubleValue;
    /**
     * @return If this feature uses the long variation type, this field contains the long value of this variation. Minimum value of `-9007199254740991`. Maximum value of `9007199254740991`.
     * 
     */
    private @Nullable String longValue;
    /**
     * @return If this feature uses the string variation type, this field contains the string value of this variation. Minimum length of `0`. Maximum length of `512`.
     * 
     */
    private @Nullable String stringValue;

    private FeatureVariationValue() {}
    /**
     * @return If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
     * 
     */
    public Optional<String> boolValue() {
        return Optional.ofNullable(this.boolValue);
    }
    /**
     * @return If this feature uses the double integer variation type, this field contains the double integer value of this variation.
     * 
     */
    public Optional<String> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    /**
     * @return If this feature uses the long variation type, this field contains the long value of this variation. Minimum value of `-9007199254740991`. Maximum value of `9007199254740991`.
     * 
     */
    public Optional<String> longValue() {
        return Optional.ofNullable(this.longValue);
    }
    /**
     * @return If this feature uses the string variation type, this field contains the string value of this variation. Minimum length of `0`. Maximum length of `512`.
     * 
     */
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureVariationValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String boolValue;
        private @Nullable String doubleValue;
        private @Nullable String longValue;
        private @Nullable String stringValue;
        public Builder() {}
        public Builder(FeatureVariationValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.longValue = defaults.longValue;
    	      this.stringValue = defaults.stringValue;
        }

        @CustomType.Setter
        public Builder boolValue(@Nullable String boolValue) {

            this.boolValue = boolValue;
            return this;
        }
        @CustomType.Setter
        public Builder doubleValue(@Nullable String doubleValue) {

            this.doubleValue = doubleValue;
            return this;
        }
        @CustomType.Setter
        public Builder longValue(@Nullable String longValue) {

            this.longValue = longValue;
            return this;
        }
        @CustomType.Setter
        public Builder stringValue(@Nullable String stringValue) {

            this.stringValue = stringValue;
            return this;
        }
        public FeatureVariationValue build() {
            final var _resultValue = new FeatureVariationValue();
            _resultValue.boolValue = boolValue;
            _resultValue.doubleValue = doubleValue;
            _resultValue.longValue = longValue;
            _resultValue.stringValue = stringValue;
            return _resultValue;
        }
    }
}
