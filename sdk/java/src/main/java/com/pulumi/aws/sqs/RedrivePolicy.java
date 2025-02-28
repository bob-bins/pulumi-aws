// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sqs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sqs.RedrivePolicyArgs;
import com.pulumi.aws.sqs.inputs.RedrivePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows you to set a redrive policy of an SQS Queue
 * while referencing ARN of the dead letter queue inside the redrive policy.
 * 
 * This is useful when you want to set a dedicated
 * dead letter queue for a standard or FIFO queue, but need
 * the dead letter queue to exist before setting the redrive policy.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
 * import com.pulumi.aws.sqs.RedrivePolicy;
 * import com.pulumi.aws.sqs.RedrivePolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var queue = new Queue(&#34;queue&#34;);
 * 
 *         var ddl = new Queue(&#34;ddl&#34;, QueueArgs.builder()        
 *             .redriveAllowPolicy(queue.arn().applyValue(arn -&gt; serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;redrivePermission&#34;, &#34;byQueue&#34;),
 *                     jsonProperty(&#34;sourceQueueArns&#34;, jsonArray(arn))
 *                 ))))
 *             .build());
 * 
 *         var redrivePolicy = new RedrivePolicy(&#34;redrivePolicy&#34;, RedrivePolicyArgs.builder()        
 *             .queueUrl(queue.id())
 *             .redrivePolicy(ddl.arn().applyValue(arn -&gt; serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;deadLetterTargetArn&#34;, arn),
 *                     jsonProperty(&#34;maxReceiveCount&#34;, 4)
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SQS Queue Redrive Policies using the queue URL. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sqs/redrivePolicy:RedrivePolicy test https://queue.amazonaws.com/0123456789012/myqueue
 * ```
 * 
 */
@ResourceType(type="aws:sqs/redrivePolicy:RedrivePolicy")
public class RedrivePolicy extends com.pulumi.resources.CustomResource {
    /**
     * The URL of the SQS Queue to which to attach the policy
     * 
     */
    @Export(name="queueUrl", refs={String.class}, tree="[0]")
    private Output<String> queueUrl;

    /**
     * @return The URL of the SQS Queue to which to attach the policy
     * 
     */
    public Output<String> queueUrl() {
        return this.queueUrl;
    }
    /**
     * The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
     * 
     */
    @Export(name="redrivePolicy", refs={String.class}, tree="[0]")
    private Output<String> redrivePolicy;

    /**
     * @return The JSON redrive policy for the SQS queue. Accepts two key/val pairs: `deadLetterTargetArn` and `maxReceiveCount`. Learn more in the [Amazon SQS dead-letter queues documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html).
     * 
     */
    public Output<String> redrivePolicy() {
        return this.redrivePolicy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RedrivePolicy(String name) {
        this(name, RedrivePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RedrivePolicy(String name, RedrivePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RedrivePolicy(String name, RedrivePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/redrivePolicy:RedrivePolicy", name, args == null ? RedrivePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RedrivePolicy(String name, Output<String> id, @Nullable RedrivePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/redrivePolicy:RedrivePolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RedrivePolicy get(String name, Output<String> id, @Nullable RedrivePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RedrivePolicy(name, id, state, options);
    }
}
