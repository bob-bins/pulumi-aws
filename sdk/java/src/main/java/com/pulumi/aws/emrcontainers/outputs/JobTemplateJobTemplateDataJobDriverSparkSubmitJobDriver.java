// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver {
    /**
     * @return The entry point of job application.
     * 
     */
    private String entryPoint;
    /**
     * @return The arguments for job application.
     * 
     */
    private @Nullable List<String> entryPointArguments;
    /**
     * @return The Spark submit parameters that are used for job runs.
     * 
     */
    private @Nullable String sparkSubmitParameters;

    private JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver() {}
    /**
     * @return The entry point of job application.
     * 
     */
    public String entryPoint() {
        return this.entryPoint;
    }
    /**
     * @return The arguments for job application.
     * 
     */
    public List<String> entryPointArguments() {
        return this.entryPointArguments == null ? List.of() : this.entryPointArguments;
    }
    /**
     * @return The Spark submit parameters that are used for job runs.
     * 
     */
    public Optional<String> sparkSubmitParameters() {
        return Optional.ofNullable(this.sparkSubmitParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entryPoint;
        private @Nullable List<String> entryPointArguments;
        private @Nullable String sparkSubmitParameters;
        public Builder() {}
        public Builder(JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryPoint = defaults.entryPoint;
    	      this.entryPointArguments = defaults.entryPointArguments;
    	      this.sparkSubmitParameters = defaults.sparkSubmitParameters;
        }

        @CustomType.Setter
        public Builder entryPoint(String entryPoint) {
            if (entryPoint == null) {
              throw new MissingRequiredPropertyException("JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver", "entryPoint");
            }
            this.entryPoint = entryPoint;
            return this;
        }
        @CustomType.Setter
        public Builder entryPointArguments(@Nullable List<String> entryPointArguments) {

            this.entryPointArguments = entryPointArguments;
            return this;
        }
        public Builder entryPointArguments(String... entryPointArguments) {
            return entryPointArguments(List.of(entryPointArguments));
        }
        @CustomType.Setter
        public Builder sparkSubmitParameters(@Nullable String sparkSubmitParameters) {

            this.sparkSubmitParameters = sparkSubmitParameters;
            return this;
        }
        public JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver build() {
            final var _resultValue = new JobTemplateJobTemplateDataJobDriverSparkSubmitJobDriver();
            _resultValue.entryPoint = entryPoint;
            _resultValue.entryPointArguments = entryPointArguments;
            _resultValue.sparkSubmitParameters = sparkSubmitParameters;
            return _resultValue;
        }
    }
}
