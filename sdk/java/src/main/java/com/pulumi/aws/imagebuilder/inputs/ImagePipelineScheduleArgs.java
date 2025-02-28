// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagePipelineScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImagePipelineScheduleArgs Empty = new ImagePipelineScheduleArgs();

    /**
     * Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    @Import(name="pipelineExecutionStartCondition")
    private @Nullable Output<String> pipelineExecutionStartCondition;

    /**
     * @return Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    public Optional<Output<String>> pipelineExecutionStartCondition() {
        return Optional.ofNullable(this.pipelineExecutionStartCondition);
    }

    /**
     * Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="scheduleExpression", required=true)
    private Output<String> scheduleExpression;

    /**
     * @return Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> scheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private ImagePipelineScheduleArgs() {}

    private ImagePipelineScheduleArgs(ImagePipelineScheduleArgs $) {
        this.pipelineExecutionStartCondition = $.pipelineExecutionStartCondition;
        this.scheduleExpression = $.scheduleExpression;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagePipelineScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagePipelineScheduleArgs $;

        public Builder() {
            $ = new ImagePipelineScheduleArgs();
        }

        public Builder(ImagePipelineScheduleArgs defaults) {
            $ = new ImagePipelineScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineExecutionStartCondition Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
         * 
         * @return builder
         * 
         */
        public Builder pipelineExecutionStartCondition(@Nullable Output<String> pipelineExecutionStartCondition) {
            $.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }

        /**
         * @param pipelineExecutionStartCondition Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
         * 
         * @return builder
         * 
         */
        public Builder pipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
            return pipelineExecutionStartCondition(Output.of(pipelineExecutionStartCondition));
        }

        /**
         * @param scheduleExpression Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * @param scheduleExpression Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        /**
         * @param timezone The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The timezone that applies to the scheduling expression. For example, &#34;Etc/UTC&#34;, &#34;America/Los_Angeles&#34; in the [IANA timezone format](https://www.joda.org/joda-time/timezones.html). If not specified this defaults to UTC.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public ImagePipelineScheduleArgs build() {
            if ($.scheduleExpression == null) {
                throw new MissingRequiredPropertyException("ImagePipelineScheduleArgs", "scheduleExpression");
            }
            return $;
        }
    }

}
