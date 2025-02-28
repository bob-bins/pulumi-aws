// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetCostFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetCostFilterArgs Empty = new BudgetCostFilterArgs();

    /**
     * The name of a budget. Unique within accounts.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of a budget. Unique within accounts.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private BudgetCostFilterArgs() {}

    private BudgetCostFilterArgs(BudgetCostFilterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetCostFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetCostFilterArgs $;

        public Builder() {
            $ = new BudgetCostFilterArgs();
        }

        public Builder(BudgetCostFilterArgs defaults) {
            $ = new BudgetCostFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a budget. Unique within accounts.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a budget. Unique within accounts.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public BudgetCostFilterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("BudgetCostFilterArgs", "name");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("BudgetCostFilterArgs", "values");
            }
            return $;
        }
    }

}
