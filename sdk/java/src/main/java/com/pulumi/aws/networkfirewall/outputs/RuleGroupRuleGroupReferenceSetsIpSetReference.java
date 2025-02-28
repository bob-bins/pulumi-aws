// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupReferenceSetsIpSetReference {
    /**
     * @return Set of configuration blocks that define the IP Reference information. See IP Set Reference below for details.
     * 
     */
    private List<RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference> ipSetReferences;
    /**
     * @return A unique alphanumeric string to identify the `ip_set`.
     * 
     */
    private String key;

    private RuleGroupRuleGroupReferenceSetsIpSetReference() {}
    /**
     * @return Set of configuration blocks that define the IP Reference information. See IP Set Reference below for details.
     * 
     */
    public List<RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference> ipSetReferences() {
        return this.ipSetReferences;
    }
    /**
     * @return A unique alphanumeric string to identify the `ip_set`.
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupReferenceSetsIpSetReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference> ipSetReferences;
        private String key;
        public Builder() {}
        public Builder(RuleGroupRuleGroupReferenceSetsIpSetReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSetReferences = defaults.ipSetReferences;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder ipSetReferences(List<RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference> ipSetReferences) {
            if (ipSetReferences == null) {
              throw new MissingRequiredPropertyException("RuleGroupRuleGroupReferenceSetsIpSetReference", "ipSetReferences");
            }
            this.ipSetReferences = ipSetReferences;
            return this;
        }
        public Builder ipSetReferences(RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReference... ipSetReferences) {
            return ipSetReferences(List.of(ipSetReferences));
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("RuleGroupRuleGroupReferenceSetsIpSetReference", "key");
            }
            this.key = key;
            return this;
        }
        public RuleGroupRuleGroupReferenceSetsIpSetReference build() {
            final var _resultValue = new RuleGroupRuleGroupReferenceSetsIpSetReference();
            _resultValue.ipSetReferences = ipSetReferences;
            _resultValue.key = key;
            return _resultValue;
        }
    }
}
