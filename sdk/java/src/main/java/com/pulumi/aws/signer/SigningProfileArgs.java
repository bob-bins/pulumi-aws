// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import com.pulumi.aws.signer.inputs.SigningProfileSigningMaterialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @Import(name="platformId", required=true)
    private Output<String> platformId;

    /**
     * @return The ID of the platform that is used by the target signing profile.
     * 
     */
    public Output<String> platformId() {
        return this.platformId;
    }

    /**
     * The validity period for a signing job.
     * 
     */
    @Import(name="signatureValidityPeriod")
    private @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    /**
     * @return The validity period for a signing job.
     * 
     */
    public Optional<Output<SigningProfileSignatureValidityPeriodArgs>> signatureValidityPeriod() {
        return Optional.ofNullable(this.signatureValidityPeriod);
    }

    @Import(name="signingMaterial")
    private @Nullable Output<SigningProfileSigningMaterialArgs> signingMaterial;

    public Optional<Output<SigningProfileSigningMaterialArgs>> signingMaterial() {
        return Optional.ofNullable(this.signingMaterial);
    }

    /**
     * A list of tags associated with the signing profile. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A list of tags associated with the signing profile. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SigningProfileArgs() {}

    private SigningProfileArgs(SigningProfileArgs $) {
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.platformId = $.platformId;
        this.signatureValidityPeriod = $.signatureValidityPeriod;
        this.signingMaterial = $.signingMaterial;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningProfileArgs $;

        public Builder() {
            $ = new SigningProfileArgs();
        }

        public Builder(SigningProfileArgs defaults) {
            $ = new SigningProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param platformId The ID of the platform that is used by the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformId(Output<String> platformId) {
            $.platformId = platformId;
            return this;
        }

        /**
         * @param platformId The ID of the platform that is used by the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformId(String platformId) {
            return platformId(Output.of(platformId));
        }

        /**
         * @param signatureValidityPeriod The validity period for a signing job.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            $.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }

        /**
         * @param signatureValidityPeriod The validity period for a signing job.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            return signatureValidityPeriod(Output.of(signatureValidityPeriod));
        }

        public Builder signingMaterial(@Nullable Output<SigningProfileSigningMaterialArgs> signingMaterial) {
            $.signingMaterial = signingMaterial;
            return this;
        }

        public Builder signingMaterial(SigningProfileSigningMaterialArgs signingMaterial) {
            return signingMaterial(Output.of(signingMaterial));
        }

        /**
         * @param tags A list of tags associated with the signing profile. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags associated with the signing profile. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SigningProfileArgs build() {
            if ($.platformId == null) {
                throw new MissingRequiredPropertyException("SigningProfileArgs", "platformId");
            }
            return $;
        }
    }

}
