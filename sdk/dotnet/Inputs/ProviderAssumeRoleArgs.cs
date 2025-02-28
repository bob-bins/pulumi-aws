// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Inputs
{

    public sealed class ProviderAssumeRoleArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("policy")]
        public Input<string>? Policy { get; set; }

        [Input("policyArns")]
        private InputList<string>? _policyArns;
        public InputList<string> PolicyArns
        {
            get => _policyArns ?? (_policyArns = new InputList<string>());
            set => _policyArns = value;
        }

        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("sessionName")]
        public Input<string>? SessionName { get; set; }

        [Input("sourceIdentity")]
        public Input<string>? SourceIdentity { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("transitiveTagKeys")]
        private InputList<string>? _transitiveTagKeys;
        public InputList<string> TransitiveTagKeys
        {
            get => _transitiveTagKeys ?? (_transitiveTagKeys = new InputList<string>());
            set => _transitiveTagKeys = value;
        }

        public ProviderAssumeRoleArgs()
        {
        }
        public static new ProviderAssumeRoleArgs Empty => new ProviderAssumeRoleArgs();
    }
}
