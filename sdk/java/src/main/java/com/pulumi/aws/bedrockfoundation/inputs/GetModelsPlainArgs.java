// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrockfoundation.inputs;

import com.pulumi.aws.bedrockfoundation.inputs.GetModelsModelSummary;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetModelsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelsPlainArgs Empty = new GetModelsPlainArgs();

    /**
     * Customization type to filter on. Valid values are `FINE_TUNING`.
     * 
     */
    @Import(name="byCustomizationType")
    private @Nullable String byCustomizationType;

    /**
     * @return Customization type to filter on. Valid values are `FINE_TUNING`.
     * 
     */
    public Optional<String> byCustomizationType() {
        return Optional.ofNullable(this.byCustomizationType);
    }

    /**
     * Inference type to filter on. Valid values are `ON_DEMAND` and `PROVISIONED`.
     * 
     */
    @Import(name="byInferenceType")
    private @Nullable String byInferenceType;

    /**
     * @return Inference type to filter on. Valid values are `ON_DEMAND` and `PROVISIONED`.
     * 
     */
    public Optional<String> byInferenceType() {
        return Optional.ofNullable(this.byInferenceType);
    }

    /**
     * Output modality to filter on. Valid values are `TEXT`, `IMAGE`, and `EMBEDDING`.
     * 
     */
    @Import(name="byOutputModality")
    private @Nullable String byOutputModality;

    /**
     * @return Output modality to filter on. Valid values are `TEXT`, `IMAGE`, and `EMBEDDING`.
     * 
     */
    public Optional<String> byOutputModality() {
        return Optional.ofNullable(this.byOutputModality);
    }

    /**
     * Model provider to filter on.
     * 
     */
    @Import(name="byProvider")
    private @Nullable String byProvider;

    /**
     * @return Model provider to filter on.
     * 
     */
    public Optional<String> byProvider() {
        return Optional.ofNullable(this.byProvider);
    }

    /**
     * List of model summary objects. See `model_summaries`.
     * 
     */
    @Import(name="modelSummaries")
    private @Nullable List<GetModelsModelSummary> modelSummaries;

    /**
     * @return List of model summary objects. See `model_summaries`.
     * 
     */
    public Optional<List<GetModelsModelSummary>> modelSummaries() {
        return Optional.ofNullable(this.modelSummaries);
    }

    private GetModelsPlainArgs() {}

    private GetModelsPlainArgs(GetModelsPlainArgs $) {
        this.byCustomizationType = $.byCustomizationType;
        this.byInferenceType = $.byInferenceType;
        this.byOutputModality = $.byOutputModality;
        this.byProvider = $.byProvider;
        this.modelSummaries = $.modelSummaries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelsPlainArgs $;

        public Builder() {
            $ = new GetModelsPlainArgs();
        }

        public Builder(GetModelsPlainArgs defaults) {
            $ = new GetModelsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byCustomizationType Customization type to filter on. Valid values are `FINE_TUNING`.
         * 
         * @return builder
         * 
         */
        public Builder byCustomizationType(@Nullable String byCustomizationType) {
            $.byCustomizationType = byCustomizationType;
            return this;
        }

        /**
         * @param byInferenceType Inference type to filter on. Valid values are `ON_DEMAND` and `PROVISIONED`.
         * 
         * @return builder
         * 
         */
        public Builder byInferenceType(@Nullable String byInferenceType) {
            $.byInferenceType = byInferenceType;
            return this;
        }

        /**
         * @param byOutputModality Output modality to filter on. Valid values are `TEXT`, `IMAGE`, and `EMBEDDING`.
         * 
         * @return builder
         * 
         */
        public Builder byOutputModality(@Nullable String byOutputModality) {
            $.byOutputModality = byOutputModality;
            return this;
        }

        /**
         * @param byProvider Model provider to filter on.
         * 
         * @return builder
         * 
         */
        public Builder byProvider(@Nullable String byProvider) {
            $.byProvider = byProvider;
            return this;
        }

        /**
         * @param modelSummaries List of model summary objects. See `model_summaries`.
         * 
         * @return builder
         * 
         */
        public Builder modelSummaries(@Nullable List<GetModelsModelSummary> modelSummaries) {
            $.modelSummaries = modelSummaries;
            return this;
        }

        /**
         * @param modelSummaries List of model summary objects. See `model_summaries`.
         * 
         * @return builder
         * 
         */
        public Builder modelSummaries(GetModelsModelSummary... modelSummaries) {
            return modelSummaries(List.of(modelSummaries));
        }

        public GetModelsPlainArgs build() {
            return $;
        }
    }

}
