// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs();

    /**
     * The name of the HTTP endpoint common attribute.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the HTTP endpoint common attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the HTTP endpoint common attribute.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the HTTP endpoint common attribute.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs() {}

    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs();
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs defaults) {
            $ = new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the HTTP endpoint common attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeArgs", "value");
            }
            return $;
        }
    }

}
