// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowOnExceptionStepDeleteStepDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowOnExceptionStepDeleteStepDetailsArgs Empty = new WorkflowOnExceptionStepDeleteStepDetailsArgs();

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    @Import(name="sourceFileLocation")
    private @Nullable Output<String> sourceFileLocation;

    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    public Optional<Output<String>> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }

    private WorkflowOnExceptionStepDeleteStepDetailsArgs() {}

    private WorkflowOnExceptionStepDeleteStepDetailsArgs(WorkflowOnExceptionStepDeleteStepDetailsArgs $) {
        this.name = $.name;
        this.sourceFileLocation = $.sourceFileLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowOnExceptionStepDeleteStepDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowOnExceptionStepDeleteStepDetailsArgs $;

        public Builder() {
            $ = new WorkflowOnExceptionStepDeleteStepDetailsArgs();
        }

        public Builder(WorkflowOnExceptionStepDeleteStepDetailsArgs defaults) {
            $ = new WorkflowOnExceptionStepDeleteStepDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(@Nullable Output<String> sourceFileLocation) {
            $.sourceFileLocation = sourceFileLocation;
            return this;
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(String sourceFileLocation) {
            return sourceFileLocation(Output.of(sourceFileLocation));
        }

        public WorkflowOnExceptionStepDeleteStepDetailsArgs build() {
            return $;
        }
    }

}
