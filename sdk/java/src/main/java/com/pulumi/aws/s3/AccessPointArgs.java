// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs;
import com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * AWS account ID associated with the S3 bucket associated with this access point.
     * 
     */
    @Import(name="bucketAccountId")
    private @Nullable Output<String> bucketAccountId;

    /**
     * @return AWS account ID associated with the S3 bucket associated with this access point.
     * 
     */
    public Optional<Output<String>> bucketAccountId() {
        return Optional.ofNullable(this.bucketAccountId);
    }

    /**
     * Name you want to assign to this access point.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name you want to assign to this access point.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
    private @Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    /**
     * @return Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    public Optional<Output<AccessPointPublicAccessBlockConfigurationArgs>> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }

    /**
     * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration;

    /**
     * @return Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    public Optional<Output<AccessPointVpcConfigurationArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private AccessPointArgs() {}

    private AccessPointArgs(AccessPointArgs $) {
        this.accountId = $.accountId;
        this.bucket = $.bucket;
        this.bucketAccountId = $.bucketAccountId;
        this.name = $.name;
        this.policy = $.policy;
        this.publicAccessBlockConfiguration = $.publicAccessBlockConfiguration;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointArgs $;

        public Builder() {
            $ = new AccessPointArgs();
        }

        public Builder(AccessPointArgs defaults) {
            $ = new AccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param bucket Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of an AWS Partition S3 General Purpose Bucket or the ARN of S3 on Outposts Bucket that you want to associate this access point with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param bucketAccountId AWS account ID associated with the S3 bucket associated with this access point.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccountId(@Nullable Output<String> bucketAccountId) {
            $.bucketAccountId = bucketAccountId;
            return this;
        }

        /**
         * @param bucketAccountId AWS account ID associated with the S3 bucket associated with this access point.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccountId(String bucketAccountId) {
            return bucketAccountId(Output.of(bucketAccountId));
        }

        /**
         * @param name Name you want to assign to this access point.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name you want to assign to this access point.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = &#34;&#34;`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `&#34;{}&#34;` (an empty JSON document).
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(@Nullable Output<AccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            $.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        /**
         * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessBlockConfiguration(AccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            return publicAccessBlockConfiguration(Output.of(publicAccessBlockConfiguration));
        }

        /**
         * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<AccessPointVpcConfigurationArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(AccessPointVpcConfigurationArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public AccessPointArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("AccessPointArgs", "bucket");
            }
            return $;
        }
    }

}
