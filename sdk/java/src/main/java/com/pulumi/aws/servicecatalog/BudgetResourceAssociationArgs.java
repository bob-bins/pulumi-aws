// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BudgetResourceAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetResourceAssociationArgs Empty = new BudgetResourceAssociationArgs();

    /**
     * Budget name.
     * 
     */
    @Import(name="budgetName", required=true)
    private Output<String> budgetName;

    /**
     * @return Budget name.
     * 
     */
    public Output<String> budgetName() {
        return this.budgetName;
    }

    /**
     * Resource identifier.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return Resource identifier.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    private BudgetResourceAssociationArgs() {}

    private BudgetResourceAssociationArgs(BudgetResourceAssociationArgs $) {
        this.budgetName = $.budgetName;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetResourceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetResourceAssociationArgs $;

        public Builder() {
            $ = new BudgetResourceAssociationArgs();
        }

        public Builder(BudgetResourceAssociationArgs defaults) {
            $ = new BudgetResourceAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param budgetName Budget name.
         * 
         * @return builder
         * 
         */
        public Builder budgetName(Output<String> budgetName) {
            $.budgetName = budgetName;
            return this;
        }

        /**
         * @param budgetName Budget name.
         * 
         * @return builder
         * 
         */
        public Builder budgetName(String budgetName) {
            return budgetName(Output.of(budgetName));
        }

        /**
         * @param resourceId Resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public BudgetResourceAssociationArgs build() {
            if ($.budgetName == null) {
                throw new MissingRequiredPropertyException("BudgetResourceAssociationArgs", "budgetName");
            }
            if ($.resourceId == null) {
                throw new MissingRequiredPropertyException("BudgetResourceAssociationArgs", "resourceId");
            }
            return $;
        }
    }

}
