// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.VaultNotificationsArgs;
import com.pulumi.aws.backup.inputs.VaultNotificationsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup vault notifications resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.sns.TopicPolicy;
 * import com.pulumi.aws.sns.TopicPolicyArgs;
 * import com.pulumi.aws.backup.VaultNotifications;
 * import com.pulumi.aws.backup.VaultNotificationsArgs;
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
 *         var testTopic = new Topic(&#34;testTopic&#34;);
 * 
 *         final var testPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .policyId(&#34;__default_policy_ID&#34;)
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;SNS:Publish&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;backup.amazonaws.com&#34;)
 *                     .build())
 *                 .resources(testTopic.arn())
 *                 .sid(&#34;__default_statement_ID&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testTopicPolicy = new TopicPolicy(&#34;testTopicPolicy&#34;, TopicPolicyArgs.builder()        
 *             .arn(testTopic.arn())
 *             .policy(testPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(testPolicyDocument -&gt; testPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var testVaultNotifications = new VaultNotifications(&#34;testVaultNotifications&#34;, VaultNotificationsArgs.builder()        
 *             .backupVaultName(&#34;example_backup_vault&#34;)
 *             .snsTopicArn(testTopic.arn())
 *             .backupVaultEvents(            
 *                 &#34;BACKUP_JOB_STARTED&#34;,
 *                 &#34;RESTORE_JOB_COMPLETED&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Backup vault notifications using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:backup/vaultNotifications:VaultNotifications test TestVault
 * ```
 * 
 */
@ResourceType(type="aws:backup/vaultNotifications:VaultNotifications")
public class VaultNotifications extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="backupVaultArn", refs={String.class}, tree="[0]")
    private Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> backupVaultArn() {
        return this.backupVaultArn;
    }
    /**
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    @Export(name="backupVaultEvents", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> backupVaultEvents;

    /**
     * @return An array of events that indicate the status of jobs to back up resources to the backup vault.
     * 
     */
    public Output<List<String>> backupVaultEvents() {
        return this.backupVaultEvents;
    }
    /**
     * Name of the backup vault to add notifications for.
     * 
     */
    @Export(name="backupVaultName", refs={String.class}, tree="[0]")
    private Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add notifications for.
     * 
     */
    public Output<String> backupVaultName() {
        return this.backupVaultName;
    }
    /**
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    @Export(name="snsTopicArn", refs={String.class}, tree="[0]")
    private Output<String> snsTopicArn;

    /**
     * @return The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
     * 
     */
    public Output<String> snsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VaultNotifications(String name) {
        this(name, VaultNotificationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VaultNotifications(String name, VaultNotificationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VaultNotifications(String name, VaultNotificationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultNotifications:VaultNotifications", name, args == null ? VaultNotificationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VaultNotifications(String name, Output<String> id, @Nullable VaultNotificationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultNotifications:VaultNotifications", name, state, makeResourceOptions(options, id));
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
    public static VaultNotifications get(String name, Output<String> id, @Nullable VaultNotificationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VaultNotifications(name, id, state, options);
    }
}
